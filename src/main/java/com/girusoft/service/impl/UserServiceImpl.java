package com.girusoft.service.impl;

import com.girusoft.exception.ResourceNotFoundException;
import com.girusoft.model.payload.ResponseDto;
import com.girusoft.model.payload.UserResponseDto;
import com.girusoft.model.dto.UserRoleDto;
import com.girusoft.model.entities.UserEntity;
import com.girusoft.model.mappers.UserRolesMapper;
import com.girusoft.repository.IUserRepository;
import com.girusoft.repository.IUserRoleRepository;
import com.girusoft.service.IUserService;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {


    private final IUserRepository iUserRepository;
    private final UserRolesMapper userRolesMapper;
    private final IUserRoleRepository userRoleRepository;


    @Override
    public ResponseDto retrieveUserByEmail(String email) {

        UserEntity user = iUserRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User", "email", email));

        List<UserRoleDto> roles = userRoleRepository.findByUser(user)
                .stream()
                .map(userRole -> new UserRoleDto(userRole.getRole().getId(), userRole.getRole()
                        .getRolName())).toList();

        return userRolesMapper.mapToDTO(user, roles);
    }

    @Override
    public UserResponseDto findById(Long id) {
        var user = iUserRepository.findById(id);
        if (user.isEmpty())
            throw new ResourceNotFoundException("User", "id", id);
        return UserResponseDto.builder()
                .name(user.get().getName())
                .email(user.get().getEmail())
                .build();

    }
}
