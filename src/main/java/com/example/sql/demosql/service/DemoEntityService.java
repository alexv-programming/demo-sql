package com.example.sql.demosql.service;

import com.example.sql.demosql.model.DemoEntity;
import com.example.sql.demosql.repositories.DemoEntityRepo;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoEntityService {

    DemoEntityRepo repo;

    public DemoEntityService(DemoEntityRepo repo) {
        this.repo = repo;
    }

    public List<DemoEntity> getDemoEntities() {
        return repo.findAll();
    }

    public DemoEntity getDemoEntityById(String id) throws ChangeSetPersister.NotFoundException {
        return repo.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }
}
