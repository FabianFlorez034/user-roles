package com.girusoft.model.dto;

import jakarta.validation.constraints.Email;

import lombok.Data;

@Data
public class Request {

    @Email(message = " Must be a well-formed email address")
    private String email;
}
