package com.cds.apiCds.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cds.apiCds.repository.entity.CdEntity;

@Repository
public interface CdRepo extends PagingAndSortingRepository<CdEntity, Long> {

}
