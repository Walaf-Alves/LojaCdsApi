package com.cds.apicds.principal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cds.apicds.principal.primarydb.entity.CdEntity;
import com.cds.apicds.principal.primarydb.repository.CdRepo;
import com.cds.apicds.principal.service.CdsService;
import com.google.common.collect.Lists;

@Service
public class CdsServiceImpl implements CdsService {

	public static final Logger log = Logger.getLogger(CdsServiceImpl.class);

	@Autowired
	CdRepo repo;;

	@Override
	public Boolean save(CdEntity entity) {
		if (Objects.nonNull(entity)) {
			repo.save(entity);
			log.info("O objeto foi salvo no banco de dados");
			return true;
		} else {
			log.info("O objeto informado é nulo");
			return false;
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
			log.info("Não foram encontrados nenhum cd na base de dados!");
			return null;
		}
		return listCds;
	}

	@Override
	public Boolean delete(Long id) {
		Optional<CdEntity> findById = repo.findById(id);
		if (findById.isPresent()) {
			log.info("Deletando: " + findById.get().getName());
			repo.deleteById(id);
			return true;
		} else {
			log.info("Não foi possivel achar nenhum cd com o id informado: " + id);
			return false;
		}
	}

	@Override
	public Boolean update() {
		// TODO Auto-generated method stub
		return null;
	}

}
