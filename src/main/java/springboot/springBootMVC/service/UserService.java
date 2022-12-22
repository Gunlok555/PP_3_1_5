package springboot.springBootMVC.service;

import javassist.NotFoundException;
import springboot.springBootMVC.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getById(long id);

    void updateUser(User user);

    void deleteUser(User user);

    User getByName(String userName) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;
}
