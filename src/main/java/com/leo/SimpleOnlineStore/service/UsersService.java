package com.leo.SimpleOnlineStore.service;

import com.leo.SimpleOnlineStore.dto.UsersDto;
import com.leo.SimpleOnlineStore.exception.ValidationException;

import java.util.List;

public interface UsersService {

    UsersDto saveUser(UsersDto usersDto) throws ValidationException;

    void deleteUser(Integer userId);

    UsersDto findByLogin(String login);

    List<UsersDto> findAll();
}
