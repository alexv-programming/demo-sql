package com.example.sql.demosql.controllers;

import com.example.sql.demosql.model.DemoEntity;
import com.example.sql.demosql.service.DemoEntityService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.sql.demosql.constants.EndpointsConstants.DEMO_ENTITY;
import static com.example.sql.demosql.constants.EndpointsConstants.API;

@RestController
@RequestMapping(API+DEMO_ENTITY)
public class DemoEntityController {

    DemoEntityService demoEntityService;

    public DemoEntityController(DemoEntityService demoEntityService) {
        this.demoEntityService = demoEntityService;
    }


    @GetMapping("/")
    public List<DemoEntity> getDemoEntities() {
        return demoEntityService.getDemoEntities();
    }

    @GetMapping("/{id}")
    public DemoEntity getDemoEntityById(@PathVariable String id) throws ChangeSetPersister.NotFoundException {
        return demoEntityService.getDemoEntityById(id);
    }


}
