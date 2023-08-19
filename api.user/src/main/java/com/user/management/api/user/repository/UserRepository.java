package com.user.management.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.management.api.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
