package com.cds.apiCds.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cds.apiCds.repository.entity.CdEntity;

public interface CdRepo extends PagingAndSortingRepository<CdEntity, Long> {

}
