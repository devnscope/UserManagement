package com.devnscope.usermanagement.repository;


import com.devnscope.usermanagement.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserManagementRepository extends MongoRepository<User, String> {
}
