package com.api.EMS.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.EMS.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee save(Employee employee);
    Optional<Employee> findById(int id);
    List<Employee> findAll();
    void deleteById(int id);
    boolean existsById(int id);

}

