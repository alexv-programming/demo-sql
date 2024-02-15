package com.example.sql.demosql.repositories;

import com.example.sql.demosql.model.DemoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoEntityRepo extends CrudRepository<DemoEntity, String> {

    List<DemoEntity> findAll();
}
