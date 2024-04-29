package com.airport;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airport.dao.AirportDAO;
import com.airport.entity.AirportEntity;
import com.airport.service.AirportService;

public class AirportTester {
	public static void main(String[] args) {
		String configLocation = "beanConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
//		AirportEntity entity = 	null;
		AirportDAO dao = context.getBean(AirportDAO.class);
		AirportService service = context.getBean(AirportService.class);
//		boolean isvalid = service.validateAirportEntity(entity);
//		if(isvalid) {
//			dao.saveAirportEntity(entity);
//		}
//		else {
//			System.out.println("Try again... Data is not valid...!!!");
//		}
		
		
		boolean id = service.validateId(1);
//
//		
//		if(id) {
//			dao.updateAirportEntityByID(1);
//		}
//		else {
//			
//			System.out.println("Try again... Data is not valid...!!!");
//		}
		
		
		
//		boolean name = service.validateName("KempeGowda International Airport");
//		if(name) {
//			dao.updateAirportEntityByName("KempeGowda International Airport");
//		}
//		else {
//			System.out.println("Incorrect Airport Name...Please Enter Valid Airport Name: ");
//		}
		
//		boolean location = service.validateLocation("bangolre");
//		if(location) {
//			dao.updateAirportEntityByLocation("Bangalore");
//		}
//		else {
//			System.out.println("Invalid Location... Please enter Valid Location...!!!");
//		}
		

		
//		boolean deleteID = service.validateId(14);
//		if(deleteID) {
//			dao.deleteAirportEntityByID(14);
//		}
//		else {
//			System.out.println("Invalid ID you Given for Deleting purpose...!!!");
//		}
		
//		if(id) {
//			AirportEntity byID = dao.getAirportEntityByID(1);
//			System.out.println(byID);
//		}
//		else
//		{
//			System.out.println("Try again... Data is not valid...!!!");
//		}
		
		boolean id2 = service.validateId(13);
		if(id2) {
			dao.deleteAirportEntityByID(13);
		}
		else {
			System.out.println("Unsuccesfull...");
		}
		
		dao.getAll();
		ClassPathXmlApplicationContext ioc = (ClassPathXmlApplicationContext)context;
		
		ioc.close();
	}
}
