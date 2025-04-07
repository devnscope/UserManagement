package com.devnscope.usermanagement.mongoconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.devnscope.usermanagement")
public class MongoConfig {
}
