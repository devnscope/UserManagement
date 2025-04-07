package com.devnscope.usermanagement.repository;

import com.devnscope.usermanagement.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("userManagementRepository")
public interface UserManagementRepository extends MongoRepository<User, String> {
}
