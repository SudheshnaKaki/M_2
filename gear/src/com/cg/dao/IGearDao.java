package com.cg.dao;

import com.cg.dto.QueryMaster;

public interface IGearDao {
	QueryMaster search(int id);

	boolean addQuery(QueryMaster queryMaster);
}
