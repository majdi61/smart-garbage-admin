package com.spring.mongo.demo.service.impl;

import com.spring.mongo.demo.model.Bin;
import com.spring.mongo.demo.repository.BinRepository;
import com.spring.mongo.demo.service.BinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BinServiceImpl implements BinService {

    @Autowired
    private BinRepository repository;

    @Override
    public List<Bin> findAll() {
        return repository.findAll();
    }

    @Override
    public Bin findById(String id) {
        return repository.findById(id).orElse(new Bin());
    }

    @Override
    public Bin save(Bin bin) {
        return repository.save(bin);
    }

    @Override
    public Bin update(Bin bin) {
        return repository.save(bin);
    }

    @Override
    public Bin updateBinTrue(String id) {
        Optional<Bin> findBinQuery = repository.findById(id);
        Bin binValues = findBinQuery.get();
        binValues.setRempli(true);
        return repository.save(binValues);
    }

    @Override
    public Bin updateBinFalse(String id) {
        Optional<Bin> findBinQuery = repository.findById(id);
        Bin binValues = findBinQuery.get();
        binValues.setRempli(false);
        return repository.save(binValues);
    }


    @Override
    public void delete(String id) {
       repository.findById(id).ifPresent(bin -> repository.delete(bin));
    }
}
