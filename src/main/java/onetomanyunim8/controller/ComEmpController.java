package onetomanyunim8.controller;

import onetomanyunim8.dao.CompanyDao;
import onetomanyunim8.dao.EmployeeDao;
import onetomanyunim8.dto.Company;
import onetomanyunim8.dto.Employee;

public class ComEmpController {

	public static void main(String[] args) {


		Company company = new Company();
		company.setId(1);
		company.setName("TCS");
		company.setGst("TCS@!@#");
		CompanyDao companyDao = new CompanyDao();
		companyDao.saveCompany(company);
	    
		
		
	/*	Employee employee = new Employee();
		employee.setId(2);
		employee.setName("pavithra Reddy");
        employee.setAddress("Banglore");
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(1, employee);
        */
		
		
	/*	Employee employee = new Employee();
		employee.setName("chalama Reddy");
        employee.setAddress("Banglore");
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.updateEmployee(1, employee);
        */
		
		
	/*	Company company = new Company();
		company.setName("TCS");
		company.setGst("TCS@!@#");
		CompanyDao companyDao = new CompanyDao();
		companyDao.updateCompany(1, company);
        */
		
		
	/*	CompanyDao companyDao = new CompanyDao();
		companyDao.findCompany(1);
		
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.findEmployee(1);
		*/
		
		
	//	EmployeeDao employeeDao = new EmployeeDao();
	//	employeeDao.deleteEmployee(2);
		
	//	CompanyDao companyDao = new CompanyDao();
	//	companyDao.deleteCompany(1);
		
	} 

}
