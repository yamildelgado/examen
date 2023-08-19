package com.user.management.api.user.mapper;

import org.mapstruct.Mapper;

import com.user.management.api.user.dto.UserDTO;
import com.user.management.api.user.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserDTO source);
    UserDTO toDto(User target);
}