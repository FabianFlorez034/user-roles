package com.girusoft.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {

    private String givenName;
    private String familyName;
    private String nickname;
    private String name;
    private String picture;
    private String locale;
    private String updatedAt;
    private String email;
    private boolean emailVerified;
    private String sub;
}
