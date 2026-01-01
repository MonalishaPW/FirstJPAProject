package io.Mona.entityrelationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Monalisha2");
		EntityManager  entityManager = entityManagerFactory.createEntityManager();
		Student s1 = entityManager.find(Student.class, 1);
		System.out.println(s1.getName());
		
		for(Course c : s1.getCourseList()) {
			System.out.println(c.getCourseName());
		}
		
//		System.out.println(s1.getCard().getSoftwareVersion() + " " + s1.getCard().getCardNumber());
		
//		StudentIdCard c1 = entityManager.find(StudentIdCard.class, 3);
//		System.out.println( c1.getStudent().getName() + " " + c1.getCardNumber() + " " + c1.getSoftwareVersion());
		
//		Course cc1 = entityManager.find(Course.class, 5);
//		System.out.println(cc1.getCourseName() + " " + cc1.getStudent().getName());
	}

}
