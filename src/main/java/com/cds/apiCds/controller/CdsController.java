package com.cds.apiCds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cds.apiCds.repository.entity.CdEntity;
import com.cds.apiCds.service.CdsService;

@RestController
@RequestMapping(value = "/controller")
public class CdsController {
	@Autowired
	CdsService service;

	@GetMapping("/cds")
	public List<CdEntity> cds() {
		return service.listAll();
	}

}
