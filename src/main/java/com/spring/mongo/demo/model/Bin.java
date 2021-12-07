package com.spring.mongo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "bin")
public class Bin implements Serializable {

    @Id
    private String id;

    private String longitude ;
    private String latitude;
    private String type;
    private String adresse;
    private boolean rempli;

    @Builder.Default
    private Instant time = Instant.now();


    // Constructor, Getter and Setter
}
