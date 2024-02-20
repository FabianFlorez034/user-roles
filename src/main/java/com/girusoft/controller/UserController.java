package com.girusoft.controller;

import com.girusoft.model.dto.Request;
import com.girusoft.model.dto.ResponseDTO;
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
public class UserController {

    private final IUserService iUserService;

    @PostMapping(value = "/roles", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> retrieveUserByEmail(@RequestBody Request request) {
        var response = iUserService.retrieveUserByEmail(request.getEmail());
        return ResponseEntity.ok(response);
    }
}
