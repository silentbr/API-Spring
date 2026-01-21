package com.Silent.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Silent.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
