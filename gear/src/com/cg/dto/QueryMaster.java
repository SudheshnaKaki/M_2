package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="query_master")
public class QueryMaster {
	@Id
	@Column(name="query_id")
	@NotNull
	private int query_Id;
	@Id
	@Column(name="technology")
	private String technology;
	@Id
	@Column(name="query_raised_by")
	private String query_Raised_By;
	@Id
	@Column(name="query")
	private String query;
	@Id
	@Column(name="solutions")
	private String solutions;
	@Id
	@Column(name="solution_Given_By")
	private String solution_Given_By;
	
	
	//Constructor using fields
	
	public QueryMaster(int query_Id, String technology, String query_Raised_By, String query, String solutions,
			String solution_Given_By) {
		super();
		this.query_Id = query_Id;
		this.technology = technology;
		this.query_Raised_By = query_Raised_By;
		this.query = query;
		this.solutions = solutions;
		this.solution_Given_By = solution_Given_By;
	}
	
	//Constructor without using fields
	
	public QueryMaster() {
		super();
	}



	//setters and getters
	
	public int getQuery_Id() {
		return query_Id;
	}
	public void setQuery_Id(int query_Id) {
		this.query_Id = query_Id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuery_Raised_By() {
		return query_Raised_By;
	}
	public void setQuery_Raised_By(String query_Raised_By) {
		this.query_Raised_By = query_Raised_By;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSolutions() {
		return solutions;
	}
	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}
	public String getSolution_Given_By() {
		return solution_Given_By;
	}
	public void setSolution_Given_By(String solution_Given_By) {
		this.solution_Given_By = solution_Given_By;
	}

	// to String
	
	@Override
	public String toString() {
		return "QueryMaster [query_Id=" + query_Id + ", technology=" + technology + ", query_Raised_By="
				+ query_Raised_By + ", query=" + query + ", solutions=" + solutions + ", solution_Given_By="
				+ solution_Given_By + "]";
	}
	
	
	
}
