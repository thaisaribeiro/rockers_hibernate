package com.rockers.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rockers.api.model.Employee;

@Component
public class EmployeeDao implements Crud<Employee> {

	@Override
	public Employee findOne(String id) {
		Employee emp = new Employee();
		emp.setWiproId("456789");
		emp.setName("Robin");
		emp.setEmail("123456");
		return emp;
	}

	@Override
	public String save(Employee t) {
		t.setWiproId("1235645");
		return t.getWiproId();
	}

	@Override
	public List<Employee> listAll() {
		List<Employee> emplist = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setWiproId("52");
		employee.setName("Batman");
		employee.setEmail("nananan");
		emplist.add(employee);
		
		return emplist;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
