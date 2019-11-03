package com.cds.apicds.principal.primarydb.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cds.apicds.principal.primarydb.entity.CdEntity;

@Repository
public interface CdRepo extends PagingAndSortingRepository<CdEntity, Long> {

}
