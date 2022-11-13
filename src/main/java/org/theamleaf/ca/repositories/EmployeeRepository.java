package org.theamleaf.ca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theamleaf.ca.pojo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
