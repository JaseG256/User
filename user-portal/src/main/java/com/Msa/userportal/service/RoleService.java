package com.Msa.userportal.service;

import com.Msa.userportal.model.Role;
import com.Msa.userportal.model.RoleName;

import java.util.Optional;

public interface RoleService extends CRUDService<Role> {

    Optional<Role> findByName(RoleName roleName);
}