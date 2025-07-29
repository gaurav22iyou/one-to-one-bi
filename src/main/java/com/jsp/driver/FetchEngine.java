package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.entity.Engine;

public class FetchEngine {

	public static void main(String[] args) {
		

		EntityManager entityManager = Persistence.createEntityManagerFactory("balaji").createEntityManager();
		
		Engine engine = entityManager.find(Engine.class, 1);
		
		System.out.println("-------------------------------------------------");
		
		
		System.out.println(engine.getId());
		
		System.out.println("Engine CC :"+engine.getCc());
		
		System.out.println("Engine Type :"+engine.getType());
		
		
		System.out.println("Car Brand :"+engine.getCar().getName());
		
		System.out.println("Car Price :"+engine.getCar().getPrice());
		
		System.out.println("-------------------------------------------------");
	}

}
