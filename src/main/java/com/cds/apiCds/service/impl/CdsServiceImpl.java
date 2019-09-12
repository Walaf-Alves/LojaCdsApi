package com.cds.apiCds.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cds.apiCds.repository.CdRepo;
import com.cds.apiCds.repository.entity.CdEntity;
import com.cds.apiCds.service.CdsService;
import com.google.common.collect.Lists;

@Service
public class CdsServiceImpl implements CdsService {

	public static final Logger log = Logger.getLogger(CdsServiceImpl.class);

	@Autowired
	CdRepo repo;

	@Override
	public Boolean save(CdEntity entity) {
		if (Objects.nonNull(entity)) {
			repo.save(entity);
			log.info("O objeto foi salvo no banco de dados");
			return true;
		} else {
			log.info("O objeto informado é nulo");
			return null;
		}
	}

	@Override
	public CdEntity findOne(Long id) {
		CdEntity cd = repo.findById(id).get();
		if (Objects.isNull(cd)) {
			log.error("O Cd não foi encontrado na base");
			return null;
		} else {
			return cd;
		}

	}

	@Override
	public List<CdEntity> listAll() {
		ArrayList<CdEntity> listCds = Lists.newArrayList(repo.findAll());
		if (listCds.isEmpty() || Objects.isNull(listCds)) {
			log.info("Não forma encontrados nenhum cd na base de dados!");
			return null;
		}
		return listCds;
	}

}
