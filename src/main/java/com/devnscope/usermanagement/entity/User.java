package com.devnscope.usermanagement.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Document(collection = "users")
public class User {

    @Id
    private Long userId;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String role;

    private LocalDate dob;

}
