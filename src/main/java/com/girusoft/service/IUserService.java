package com.girusoft.service;


import com.girusoft.model.dto.ResponseDto;

public interface IUserService {

    ResponseDto retrieveUserByEmail(String email);
}
