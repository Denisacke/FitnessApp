package com.fitness.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String trainedBodyParts;


}
