package com.cds.apiCds.service;

import com.cds.apiCds.repository.entity.CdEntity;

public interface CdsService {

	public Boolean save(CdEntity entity);

	public CdEntity findOne(Long id);
}
