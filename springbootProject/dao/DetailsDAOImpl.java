package com.qac.springbootProject.dao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.qac.springbootProject.entity.SpringMvcRegistrationDetails;

@Repository
public class DetailsDAOImpl implements DetailsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void save(SpringMvcRegistrationDetails details) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(details);
		transaction.commit();
		session.close();
	}


	public SpringMvcRegistrationDetails getByEmail(String email) {
		Session session = sessionFactory.openSession();
		String que = " from SpringMvcRegistrationDetails where  email = '"+email+"'";
        Query query =session.createQuery(que);
        SpringMvcRegistrationDetails entity=(SpringMvcRegistrationDetails) query.getSingleResult();
	    System.out.println(entity);
	    session.close();
		return entity;
	}
}