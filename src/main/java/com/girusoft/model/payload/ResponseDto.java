package com.girusoft.model.payload;

import com.girusoft.model.dto.UserRoleDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ResponseDto {

    private UserResponseDto user;
    private List<UserRoleDto> roles;
}
