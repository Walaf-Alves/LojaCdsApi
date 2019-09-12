package com.cds.apiCds.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cds.apiCds.repository.CdRepo;
import com.cds.apiCds.repository.entity.CdEntity;
import com.cds.apiCds.service.CdsService;

@Service
public class CdsServiceImpl implements CdsService {

	@Autowired
	CdRepo repo;

	@Override
	public Boolean save(CdEntity entity) {
		return null;
	}

	@Override
	public CdEntity findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
