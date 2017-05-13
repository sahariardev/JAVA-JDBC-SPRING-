package com.rifat.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.rifat.springjdbc.domain.Organization;

public class OrganizationRowMapper implements RowMapper<Organization> {

	public Organization mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO Auto-generated method stub
		Organization org=new Organization();
		org.setAddress(rs.getString("address"));
		org.setName(rs.getString("name"));
		return org;
	}
	
	

}
