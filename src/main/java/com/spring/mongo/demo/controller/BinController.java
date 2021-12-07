package com.spring.mongo.demo.controller;


import com.spring.mongo.demo.model.Bin;
import com.spring.mongo.demo.service.BinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bin")
public class BinController {

    @Autowired
    private BinService binService;

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = binService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Bin bin = binService.findById(id);
        return ResponseEntity.ok().body(bin);
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Bin bin) {
        Bin savedBin = binService.save(bin);
        return ResponseEntity.ok().body(savedBin);
    }

    @PostMapping("/true/{id}")
    public ResponseEntity<?> changeBinTrue(@PathVariable String id) {
        Bin savedBin = binService.updateBinTrue(id);
        return ResponseEntity.ok().body(savedBin);
    }
    @PostMapping("/false/{id}")
    public ResponseEntity<?> changeBinFalse(@PathVariable String id) {
        Bin savedBin = binService.updateBinFalse(id);
        return ResponseEntity.ok().body(savedBin);
    }






    @PutMapping
    public ResponseEntity<?> update(@RequestBody Bin bin) {
        Bin updatedBin = binService.update(bin);
        return ResponseEntity.ok().body(updatedBin);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        binService.delete(id);
        return ResponseEntity.ok().body("Deleted successfully...!");
    }
}
