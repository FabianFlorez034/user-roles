package com.girusoft.controller.impl;

import com.girusoft.controller.IUserController;
import com.girusoft.model.dto.Request;
import com.girusoft.model.payload.ResponseDto;
import com.girusoft.model.payload.UserResponseDto;
import com.girusoft.service.IUserService;
import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController implements IUserController {

    private final IUserService iUserService;

    @PostMapping(value = "/roles", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> retrieveUserByEmail(@RequestBody @Valid Request request) {
        var response = iUserService.retrieveUserByEmail(request.getEmail());
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> retrieveUserById(@PathVariable Long id) {
        var response = iUserService.findById(id);
        return ResponseEntity.ok(response);
    }
}