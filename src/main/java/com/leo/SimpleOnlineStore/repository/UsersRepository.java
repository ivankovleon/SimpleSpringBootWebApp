package com.leo.SimpleOnlineStore.repository;

import com.leo.SimpleOnlineStore.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByLogin(String login);

}
