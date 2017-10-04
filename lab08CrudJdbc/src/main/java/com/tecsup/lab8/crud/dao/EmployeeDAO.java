package com.tecsup.lab8.crud.dao;

import java.util.ArrayList;

import com.tecsup.lab8.crud.bean.Employee;

public interface EmployeeDAO {

	/**
	 * 
	 * @return
	 */
	ArrayList<Employee> findAll();

	/**
	 * 
	 * @param id
	 */
	Employee findById(int id);
		
	/**
	 * 
	 * @param pFirstname
	 * @param pLastname
	 * @param pSalary
	 */
	int create(String pFirstname, String pLastname, Double pSalary, int pEdad);

	/**
	 * 
	 * @param id
	 */
	void delete(int id);

	/**
	 * 
	 * @param id
	 * @param pFirstname
	 * @param pLastname
	 * @param pSalary
	 */
	void update(int id, String pFirstname, String pLastname, Double pSalary, int pEdad);

} 
