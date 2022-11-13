package org.theamleaf.ca.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.theamleaf.ca.pojo.Employee;
import org.theamleaf.ca.repositories.EmployeeRepository;
import org.theamleaf.ca.services.EmployeeServices;

/**
 * Classe d implementation des services
 * @author CatTmp
 *
 */
@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Employee getById(Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return employee;
	}

	@Override
	public void deleteViaId(long id) {
		employeeRepository.deleteById(id);
		
	}

}
