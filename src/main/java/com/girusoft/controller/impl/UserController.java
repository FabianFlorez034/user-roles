package com.girusoft.controller.impl;

import com.girusoft.controller.IUserController;
import com.girusoft.model.dto.Request;
import com.girusoft.model.dto.ResponseDto;
import com.girusoft.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    public ResponseEntity<ResponseDto> retrieveUserByEmail(@RequestBody Request request) {
        var response = iUserService.retrieveUserByEmail(request.getEmail());
        return ResponseEntity.ok(response);
    }
}
