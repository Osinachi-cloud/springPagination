package com.example.springpaginationapp.service;

import com.example.springpaginationapp.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}