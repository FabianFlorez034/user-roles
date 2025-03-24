package com.girusoft.service;

import com.girusoft.model.entities.RoleEntity;

import java.util.List;
import java.util.Map;

public interface IRoleService {

    List<RoleEntity> getAllRoles();
    Map<String, Object> getAllRolesPageable(int page, int size);
}
