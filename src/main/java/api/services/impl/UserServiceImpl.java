package api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import api.entities.User;
import api.repositories.UserRepository;
import api.services.UserService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository users;

    @Override
    public User findByName(String userName) {
        return users.findByUserName(userName);
    }

    @Override
    public User findById(int id) {
        return users.findById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return users.findAll();
    }

    public void set(UserRepository users) {
        this.users = users;
    }

}
