package com.girusoft.repository;

import com.girusoft.model.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {
}
