package api.repositories;

import api.entities.Bin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BinRepository extends CrudRepository<Bin, Integer> {

    List<Bin> findAll();

    Bin findById(int id);

    Bin findByName(String name);
}
