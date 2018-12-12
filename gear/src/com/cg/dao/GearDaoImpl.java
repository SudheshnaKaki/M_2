package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.dto.QueryMaster;
@Repository
public class GearDaoImpl implements IGearDao {
@PersistenceContext
EntityManager entityManager;
	@Override
	public QueryMaster search(int id) {
		QueryMaster bean = null;
		bean = entityManager.find(QueryMaster.class, id);
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public boolean addQuery(QueryMaster queryMaster) {
		// TODO Auto-generated method stub
		entityManager.merge(queryMaster);
		entityManager.flush();
		return true;
		
	}

}
