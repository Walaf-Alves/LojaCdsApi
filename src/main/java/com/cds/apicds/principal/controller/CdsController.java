package com.cds.apicds.principal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cds.apicds.principal.primarydb.entity.CdEntity;
import com.cds.apicds.principal.service.CdsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/controller")
@Api(value = "Cds")
public class CdsController {
	@Autowired
	CdsService service;

	@ApiOperation(value = "Lista todos os cds")
	@GetMapping("/cds")
	public List<CdEntity> cds() {
		return service.listAll();
	}

}
