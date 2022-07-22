package com.example.bookshop.service;


import java.util.Optional;

import com.example.bookshop.model.User;

public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
