package com.example.sql.demosql.controllers;

import com.example.sql.demosql.constants.EndpointsConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(controllers = {HealthCheckController.class})
class HealthCheckControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private HealthCheckController healthCheckController;

    @BeforeEach
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(healthCheckController)
                .build();
    }

    @Test
    public void testHealthCheck() throws Exception {
        mockMvc.perform(get(EndpointsConstants.API + EndpointsConstants.HEALTH_CHECK))
                .andExpect(status().isOk());
    }

}