package com.user.management.api.user.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.user.management.api.user.dto.UserDTO;

public interface UserService {

	ResponseEntity<List<UserDTO>> getAllUsers();

	ResponseEntity<UserDTO> getUserById(long id);

	ResponseEntity<UserDTO> createUser(UserDTO tutorial);

	ResponseEntity<UserDTO> updateUser(long id, UserDTO userDTO);

	ResponseEntity<HttpStatus> deleteUser(long id);

	ResponseEntity<HttpStatus> deleteAllUsers();


}
