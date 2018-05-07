package api.services.impl;

import api.entities.Bin;
import api.repositories.BinRepository;
import api.services.BinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BinServiceImpl implements BinService {

    @Autowired
    private BinRepository bins;

    @Override
    public Bin findByName(String name) {
        return bins.findByName(name);
    }

    @Override
    public Bin findById(int id) {
        return bins.findById(id);
    }

    @Override
    public List<Bin> findAll() {
        return bins.findAll();
    }

    public void set(BinRepository bins) {
        this.bins = bins;
    }

}
