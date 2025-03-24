package com.girusoft.service.impl;

import com.girusoft.model.entities.RoleEntity;
import com.girusoft.repository.IRoleRepository;
import com.girusoft.service.IRoleService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

    private final IRoleRepository roleRepository;

    public RoleServiceImpl(IRoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    public Map<String, Object> getAllRolesPageable(int page, int size) {
        Page<RoleEntity> rolesPage = roleRepository.findAll(PageRequest.of(page, size));

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("roles", rolesPage.getContent());
        response.put("pageNumber", rolesPage.getPageable().getPageNumber());
        response.put("pageSize", rolesPage.getPageable().getPageSize());
        response.put("offset", rolesPage.getPageable().getOffset());
        response.put("total pages", rolesPage.getTotalPages());
        response.put("total elements", rolesPage.getTotalElements());
        return response;
    }

}
