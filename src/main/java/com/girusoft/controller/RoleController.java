package com.girusoft.controller;

import com.girusoft.model.entities.RoleEntity;
import com.girusoft.service.IRoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/roles")
public class RoleController {

    private final IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleEntity>> getAllRoles() {
        List<RoleEntity> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }
}
