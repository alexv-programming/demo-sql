package com.example.sql.demosql;

import com.example.sql.demosql.model.DemoEntity;
import com.example.sql.demosql.repositories.DemoEntityRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class DemoSqlApplicationTests {

	@Autowired
	DemoEntityRepo demoEntitiesRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void givenValidInitData_whenCallingFindAll_thenReturnData() {
		List<DemoEntity> entities = demoEntitiesRepo.findAll();

		assertThat(entities).hasSize(5);
	}
}
