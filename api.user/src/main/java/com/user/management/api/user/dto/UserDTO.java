package com.user.management.api.user.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDTO {

	private long id;

	private String username;

	private String password;

	private String firstName;

	private String lastName;
	
	private String email;
}
