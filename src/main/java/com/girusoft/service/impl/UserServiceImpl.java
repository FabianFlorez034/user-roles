package com.girusoft.service.impl;

import com.girusoft.model.dto.ResponseDto;
import com.girusoft.model.dto.UserRoleDto;
import com.girusoft.model.entities.UserEntity;
import com.girusoft.model.mappers.UserRolesMapper;
import com.girusoft.repository.IUserRepository;
import com.girusoft.repository.IUserRoleRepository;
import com.girusoft.service.IUserService;
import jakarta.persistence.EntityNotFoundException;

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
                .orElseThrow(() -> new EntityNotFoundException("User not found with email: " + email));

        List<UserRoleDto> roles = userRoleRepository.findByUser(user)
                .stream()
                .map(userRole -> new UserRoleDto(userRole.getRole().getId(), userRole.getRole()
                        .getRolName())).toList();

        return userRolesMapper.mapToDTO(user, roles);
    }
}
