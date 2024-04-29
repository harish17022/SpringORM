package com.airport.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airport.entity.AirportEntity;
@Component
public class AirportDAOImpl implements AirportDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void saveAirportEntity(AirportEntity entity) {
		Session session = null;

		try {
//			Configuration config = new Configuration();
//			config.configure("hibernate.cfg.xml");
//			config.addAnnotatedClass(AirportEntity.class);
//			
//			sessionFactory = config.buildSessionFactory();
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			session.save(entity);
			System.out.println(entity);
			
			session.getTransaction().commit();
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}
	@Override
	public AirportEntity getAirportEntityByID(int id) {
		Session session = null;
		AirportEntity entity = null;
		try {
			session = this.sessionFactory.openSession();
			entity = session.get(AirportEntity.class, id);
			if(Objects.nonNull(entity)) {
				return entity;
			}
			else {
				System.out.println("Airport Entity is not Found...Please provide Valid id...!!!");
			}
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		return entity;
		
	}
	@Override
	public void updateAirportEntityByName(String name) {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("update AirportEntity e set noOfRunways = 10 where airportName=: name");
			query.setParameter("name", name);
			int i = query.executeUpdate();
			System.out.println(i);
			session.getTransaction().commit();
		
			
			
			
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	@Override
	public void updateAirportEntityByID(int id) {
		Session session=null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("update AirportEntity e set airportName='KempeGowda International Airport' where id=:id");
			query.setParameter("id", id);
			int i = query.executeUpdate();
			session.getTransaction().commit();
			System.out.println(i);
			
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	@Override
	public void updateAirportEntityByLocation(String location) {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			Query query = session.createQuery("update AirportEntity e set noOfPlanes=20 where airportLocation=:location");
			query.setParameter("location", location);
			int i= query.executeUpdate();
			System.out.println(i);
			session.getTransaction().commit();
			
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
		
		
	}
	@Override
	public void deleteAirportEntityByID(int id) {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			session.beginTransaction();
			AirportEntity air1 = session.get(AirportEntity.class, id);
			if(air1 != null) {
				session.delete(air1);
			}
			else {
				System.out.println("Enter Valid Id For Deleting...");
			}
			session.getTransaction().commit();
			
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
	}

	@Override
	public void getAll() {
		Session session = null;
		try {
			session = this.sessionFactory.openSession();
			Query query = session.createQuery("from AirportEntity");
			List list = query.getResultList();
			for(Object i : list) {
				System.out.println(i);
			}
			
		}
		finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	
	
}
