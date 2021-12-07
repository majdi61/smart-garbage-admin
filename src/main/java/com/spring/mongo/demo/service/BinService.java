package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Bin;

import java.util.List;

public interface BinService {

    List<?> findAll();

    Bin findById(String id);

    Bin save(Bin bin);

    Bin update(Bin bin);

    Bin updateBinTrue(String id);
    Bin updateBinFalse(String id);

    void delete(String id);
}
