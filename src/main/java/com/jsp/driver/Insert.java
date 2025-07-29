package com.jsp.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entity.Car;
import com.jsp.entity.Engine;

public class Insert {

	public static void main(String[] args) {

		EntityManager entityManager = Persistence.createEntityManagerFactory("balaji").createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		Car car = new Car(3, "hammer", 350000);

		Engine engine = new Engine(3, "turbo-charger-v4", 1600);
		
		
		engine.setCar(car);

		transaction.begin();

		entityManager.persist(car);

		entityManager.persist(engine);

		transaction.commit();

	}

}
