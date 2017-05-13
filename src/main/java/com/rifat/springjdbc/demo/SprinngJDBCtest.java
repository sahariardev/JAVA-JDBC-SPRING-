package com.rifat.springjdbc.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rifat.springjdbc.dao.OrganizationDao;
import com.rifat.springjdbc.daoimpl.OrganizationDaoImpl;
import com.rifat.springjdbc.domain.Organization;

public class SprinngJDBCtest {

	public static void main(String[] args) {
	
		
		//creating the application context
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans-cp.xml");
		OrganizationDao dao =(OrganizationDaoImpl) ctx.getBean("orgDao");
		
		List <Organization> orgs=dao.getAllorganization();
		
		for(Organization org : orgs)
		{
			System.out.println(org.getName());
		}
		
        ((ClassPathXmlApplicationContext) ctx).close(); 
	}

}
