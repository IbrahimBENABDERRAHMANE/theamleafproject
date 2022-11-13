package org.theamleaf.ca.services;

import java.util.List;

import org.theamleaf.ca.pojo.Employee;

/**
 * Classe de service Employee
 * @author CatTmp
 *
 */
public interface EmployeeServices {

    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
