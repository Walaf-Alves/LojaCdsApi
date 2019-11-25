package com.cds.apicds.principal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@ApiOperation(value = "Lista todos os cds", produces = "application/json" )
	@GetMapping("/cds")
	public List<CdEntity> cds() {
		return service.listAll();
	}

	@ApiOperation(value = "Retorna um Cd", produces = "application/json")
	@GetMapping("/cd/{id}")
	public CdEntity cd(@PathVariable Long id) {
		return service.findOne(id);
	}

	@ApiOperation(value = "Salva um cd", produces = "application/json")
	@PostMapping("/save")
	public Boolean save(@RequestBody CdEntity cd) {
		return service.save(cd);
	}

	@ApiOperation(value = "Altera o valor de um cd", produces = "application/json")
	@PutMapping("/update")
	public Boolean update(@RequestBody CdEntity cd) {
		return service.update(cd);
	}

	@ApiOperation(value = "Deleta um valor do banco", produces = "application/json")
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable Long id) {
		return service.delete(id);
	}

}
