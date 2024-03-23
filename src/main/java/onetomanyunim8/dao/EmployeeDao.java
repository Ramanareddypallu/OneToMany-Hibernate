package onetomanyunim8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyunim8.dto.Company;
import onetomanyunim8.dto.Employee;

public class EmployeeDao {
	
	public void saveEmployee(int companyId, Employee employee) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Company dbCompany = entityManager.find(Company.class, companyId);
		if(dbCompany!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(employee);
			List<Employee> employees = dbCompany.getEmployees();
			employees.add(employee);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry CompanyId is not present");
		}
	}
	
	
	public void updateEmployee(int id, Employee employee) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee dbEmployee =  entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id); 
			entityManager.merge(employee);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry CompanyId is not present");
		}
	}
	
	
	public void findEmployee(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee dbEmployee =  entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
			System.out.println(dbEmployee);
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	public void deleteEmployee(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee dbEmployee =  entityManager.find(Employee.class, id);
		if(dbEmployee!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbEmployee);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
		
	}

}
