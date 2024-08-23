package com.example.h2_demo.UserRepository;

import com.example.h2_demo.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
