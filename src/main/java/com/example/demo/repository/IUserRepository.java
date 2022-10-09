package com.example.demo.repository;

import com.example.demo.entities.User;

import java.util.List;

public interface IUserRepository {

    List<User> findAllUsers();

    void saveUser(User user);

}
