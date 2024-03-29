package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    User getById(Integer id);

    List<User> listUsers();

    void removeUser(Integer id);

    void updateUser(User user);

    boolean addUser(User user);

    List<Role> listByRole(List<String> lsr);

    User findByEmail(String email);

}