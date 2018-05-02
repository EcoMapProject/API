package api.services;

import api.entities.Bin;

public interface BinService {
    Iterable<Bin> findAll();

    Bin findById(int id);

    Bin findByName(String name);
}
