package com.girusoft.model.mappers;

import com.girusoft.model.dto.ResponseDto;
import com.girusoft.model.dto.UserResponseDto;
import com.girusoft.model.dto.UserRoleDto;
import com.girusoft.model.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserRolesMapper {

    @Mapping(source = "user", target = "user")
    ResponseDto mapToDTO(UserEntity user, List<UserRoleDto> roles);

    UserResponseDto mapToDTO(UserEntity user);

}
