package api.services;

import api.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(int id);

    User findByName(String name);
}
