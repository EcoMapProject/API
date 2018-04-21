package api.services;

import api.entities.User;

public interface UserService {
    Iterable<User> findAll();

    User findById(int id);

    User findByName(String name);

    User save(User user);

    User update(User user);
}
