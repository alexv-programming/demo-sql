package com.example.sql.demosql.controllers;

import com.example.sql.demosql.constants.EndpointsConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.sql.demosql.constants.EndpointsConstants.API;

@RestController
@RequestMapping(API)
public class HealthCheckController {

    @GetMapping(value = EndpointsConstants.HEALTH_CHECK)
    public ResponseEntity<Boolean> healthCheck() {
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
    }

}
