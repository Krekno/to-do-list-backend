package com.krekno.todolistbackend.repository;

import com.krekno.todolistbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
