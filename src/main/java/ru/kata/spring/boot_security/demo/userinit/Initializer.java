package ru.kata.spring.boot_security.demo.userinit;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserServiceImpl;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Initializer {

    private final UserServiceImpl userService;

    public Initializer(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        Role role1 = new Role("ROLE_ADMIN");
        Role role2 = new Role("ROLE_USER");


        userService.addRole(role1);
        userService.addRole(role2);

        List<Role> roleAdmin = new ArrayList<>();
        List<Role> roleUser = new ArrayList<>();

        roleAdmin.add(role1);
        roleAdmin.add(role2);

        roleUser.add(role2);


        User user1 = new User("user", "FamilyUser", 45, "user@mail.sru","u", roleUser);
        User admin1 = new User("admin", "FamilyAdmin", 21, "admin@mail.sru","a", roleAdmin);

        userService.addUser(admin1);
        userService.addUser(user1);

    }
}
