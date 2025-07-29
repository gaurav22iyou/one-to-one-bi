package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.entity.Car;

public class FetchCar {

	public static void main(String[] args) {
		
		EntityManager entityManager = Persistence.createEntityManagerFactory("balaji").createEntityManager();
		

		Car car = entityManager.find(Car.class, 1);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Car Brand :"+car.getName());
		
		System.out.println("Car Price :"+car.getPrice());
		
		System.out.println("Car Id    :"+car.getId());
		
		System.out.println("Car CC    :"+car.getEngine().getCc());
		
		System.out.println("Car Type  :"+car.getEngine().getType());
		
		
		
		System.out.println("--------------------------------------------");
	}

}
