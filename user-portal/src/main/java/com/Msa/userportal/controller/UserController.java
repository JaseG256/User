package com.Msa.userportal.controller;

import com.Msa.userportal.model.User;
import com.Msa.userportal.service.UserService;
import com.Msa.userportal.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping({"/api"})
//@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

//    @PostMapping(path = "/add")
    public User create(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }

//    @PreAuthorize("hasRole('USER')")
    @GetMapping(path = "/{id}")
    public Optional<User> findOne(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public User update(@PathVariable("id") Long id, @RequestBody User user){
        user.setId(id);
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping(path ="/{id}")
    public void delete(@PathVariable("id") Long id) {
         userService.delete(id);
    }


//    @Secured("ROLE_USER")
//    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
//    @PreAuthorize("hasRole('USER')")
    @GetMapping(path = "/users")
    public List<User> findAll(){
        return userService.listAll();
    }
}