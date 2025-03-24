package com.girusoft.controller.impl;

import com.girusoft.controller.IRoleController;
import com.girusoft.model.entities.RoleEntity;
import com.girusoft.service.IRoleService;

import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/roles")
public class RoleController implements IRoleController {

    private final IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<RoleEntity>> getAllRoles() {
        List<RoleEntity> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }

    @GetMapping("/pageable")
    public ResponseEntity<Map<String, Object>> getAllRolesPageable(@RequestParam(defaultValue = "0") int page,
                                                                @RequestParam(defaultValue = "1") int size) {
        Map<String, Object> rolesMap = roleService.getAllRolesPageable(page, size);
        return ResponseEntity.ok(rolesMap);
    }
}
