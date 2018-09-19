package com.Msa.userportal.model;

import com.Msa.userportal.service.RoleServiceImpl;
import org.springframework.boot.ApplicationRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class RoleLoader implements ApplicationRunner {

    private RoleServiceImpl role;

    @Autowired
    public RoleLoader(RoleServiceImpl role){
        this.role = role;

    }
    public void run(ApplicationArguments args) {
        Role foo = new Role(RoleName.ROLE_USER);
        this.role.saveOrUpdate(foo);

        foo = new Role(RoleName.ROLE_ADMIN);
        this.role.saveOrUpdate(foo);

    }
}

