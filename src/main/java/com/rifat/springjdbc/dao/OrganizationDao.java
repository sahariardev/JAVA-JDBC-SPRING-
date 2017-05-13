package com.rifat.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.rifat.springjdbc.domain.Organization;

public interface OrganizationDao {
	
	public void setDatasource(DataSource ds);
	public boolean create (Organization org);
	public Organization getOrganization(Integer id);
	public List<Organization> getAllorganization();
	public boolean delete (Organization org);
	public boolean update (Organization org);
	public void cleanup();
	

}
