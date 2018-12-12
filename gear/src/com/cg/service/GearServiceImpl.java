package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IGearDao;
import com.cg.dto.QueryMaster;

@Service
public class GearServiceImpl implements IGearService {
	@Autowired
	IGearDao gearDao;
	@Override
	public QueryMaster search(int id) {
		// TODO Auto-generated method stub
		return gearDao.search(id);
	}

	@Override
	public boolean addQuery(QueryMaster queryMaster) {
		return gearDao.addQuery(queryMaster);
		
	}

}
