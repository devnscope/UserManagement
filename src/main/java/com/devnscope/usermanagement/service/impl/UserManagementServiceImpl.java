package com.devnscope.usermanagement.service.impl;

import com.devnscope.usermanagement.entity.User;
import com.devnscope.usermanagement.repository.UserManagementRepository;
import com.devnscope.usermanagement.service.UserManagementService;
import org.springframework.stereotype.Service;

@Service
public class UserManagementServiceImpl implements UserManagementService {

private UserManagementRepository userManagementRepository;

    @Override
    public User saveUser(User user) {
        userManagementRepository.save(user);
        return user;
    }
}
