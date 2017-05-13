package com.rifat.springjdbc.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rifat.springjdbc.dao.OrganizationDao;
import com.rifat.springjdbc.domain.Organization;

public class OrganizationDaoImpl implements OrganizationDao {

	
	private JdbcTemplate jdbc;
	public void setDataSource(DataSource dataSource) {
		
		
		jdbc=new JdbcTemplate(dataSource);
		

	}

	public boolean create(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organization getOrganization(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Organization> getAllorganization() {
		
		
		String sql="SELECT * from Organization";
		
		List<Organization> orglist=jdbc.query(sql, new OrganizationRowMapper());
		
		
		return orglist;
	}

	public boolean delete(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
