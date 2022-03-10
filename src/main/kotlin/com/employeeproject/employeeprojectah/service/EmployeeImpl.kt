package com.employeeproject.employeeprojectah.service

import com.employeeproject.employeeprojectah.entity.Employee
import com.employeeproject.employeeprojectah.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeImpl : EmployeeService {
    @Autowired
    lateinit var employeeRepository:EmployeeRepository;
    override fun saveEmployee(employee:Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun updateEmployee(employee: Employee):Employee{
        return employeeRepository.save(employee)
    }

    override fun deleteEmployeeById(employeeId: Long) {
       return employeeRepository.deleteById(employeeId)
    }

    override fun getAllEmployees(): List<Employee> {
        return employeeRepository.findAll()
    }

    override fun getEmployee(employeeId: Long): Employee {
        return employeeRepository.getById(employeeId)
    }

    override fun getEmployees(department: String):ArrayList<Employee> {
        return employeeRepository.findByDepartment(department)
    }

}