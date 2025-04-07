package com.devnscope.usermanagement.controller;

import com.devnscope.usermanagement.entity.User;
import com.devnscope.usermanagement.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        try {
            userManagementService.saveUser(user);
            return new ResponseEntity<>("User saved successfully!", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to save user.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
