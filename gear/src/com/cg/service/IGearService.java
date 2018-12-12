package com.cg.service;

import com.cg.dto.QueryMaster;

public interface IGearService {

	QueryMaster search(int id);

	boolean addQuery(QueryMaster queryMaster);

}
