package com.cds.apicds.principal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cds.apicds.principal.primarydb.entity.CdEntity;

@Service
public interface CdsService {

	public Boolean save(CdEntity entity);

	public CdEntity findOne(Long id);

	public Boolean delete(Long id);

	public Boolean update(CdEntity entity);

	public List<CdEntity> listAll();
}
