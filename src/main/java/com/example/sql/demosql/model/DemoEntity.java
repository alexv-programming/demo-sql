package com.example.sql.demosql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "demo_entities")
public class DemoEntity {

    @Id
    @Column
//    @Column(name = "DEMO_ENTITY_ID")
    private String id;

//    @Column(name = "DEMO_ENTITY_NAME")
    @Column
    private String name;
}
