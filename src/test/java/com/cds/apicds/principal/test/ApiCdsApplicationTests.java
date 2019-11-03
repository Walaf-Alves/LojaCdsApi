package com.cds.apicds.principal.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.cds.apicds.principal.primarydb.entity.CdEntity;
import com.cds.apicds.principal.service.CdsService;
import com.cds.apicds.principal.service.impl.CdsServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiCdsApplicationTests {

	public static final Logger log = Logger.getLogger(ApiCdsApplicationTests.class);

	@Autowired
	CdsService service;

	@Before
	public void setUp() {
		service.save(new CdEntity("xesquem"));
	}

	@Test
	public void contextLoads() {

		List<CdEntity> listAll = service.listAll();
		assertTrue(listAll != null);
		listAll.forEach(item -> System.out.println(item));

	}

}
