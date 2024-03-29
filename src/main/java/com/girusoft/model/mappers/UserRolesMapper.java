package com.girusoft.model.mappers;

import com.girusoft.model.dto.ResponseDTO;
import com.girusoft.model.dto.UserResponseDTO;
import com.girusoft.model.dto.UserRoleDto;
import com.girusoft.model.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserRolesMapper {

    @Mapping(source = "user", target = "user")
    ResponseDTO mapToDTO(UserEntity user, List<UserRoleDto> roles);

    UserResponseDTO mapToDTO(UserEntity user);

}
