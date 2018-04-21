package api.repositories;

import org.springframework.data.repository.CrudRepository;
import api.entities.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();

    User findById(int id);

    User findByUserName(String userName);
}
