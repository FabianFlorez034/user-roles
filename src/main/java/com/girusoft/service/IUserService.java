package com.girusoft.service;


import com.girusoft.model.payload.ResponseDto;
import com.girusoft.model.payload.UserResponseDto;

public interface IUserService {

    ResponseDto retrieveUserByEmail(String email);

    UserResponseDto findById(Long id);
}
