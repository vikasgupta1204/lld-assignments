package com.inteviewprep.RedisConfig;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Component
public interface IEmployeeDao {
    void saveEmployee(Employee emp);
    Employee getOneEmployee(Integer id);
    void updateEmployee(Employee emp);
    Map<Integer, Employee> getAllEmployees();
    void deleteEmployee(Integer id);
    void saveAllEmployees(Map<Integer, Employee> map);
}
