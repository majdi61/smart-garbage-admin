package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Bin;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BinRepository extends MongoRepository<Bin, String> {

}
