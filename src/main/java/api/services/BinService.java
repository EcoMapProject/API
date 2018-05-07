package api.services;

import api.entities.Bin;

import java.util.List;

public interface BinService {
    List<Bin> findAll();

    Bin findById(int id);

    Bin findByName(String name);
}
