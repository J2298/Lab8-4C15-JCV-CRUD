package com.tecsup.lab8.crud.app;

import com.tecsup.lab8.crud.bean.Employee;
import com.tecsup.lab8.crud.dao.EmployeeDAO;
import com.tecsup.lab8.crud.dao.EmployeeDAOImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int id = -1;
		
		id = dao.create("Job", "Cantaro", (double) 1500, (int) 18);
		
		Employee emp = dao.findById(id);
		
		System.out.println("Create .. " + emp);

		dao.update(id, "Job2", "Cantaro2", (double) 1505, (int) 19);
		
		emp = dao.findById(id);
		
		System.out.println("Update .. " + emp);
				
		/*dao.delete(id);

		emp = dao.findById(id);

		System.out.println("Delete .. " + emp);	*/	
		
		
		for (Employee item : dao.findAll()) {
			
			System.out.println(item);
			 
		};
		
	}

}
