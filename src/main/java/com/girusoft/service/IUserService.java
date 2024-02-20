package com.girusoft.service;


import com.girusoft.model.dto.ResponseDTO;

public interface IUserService {

    ResponseDTO retrieveUserByEmail(String email);
}
