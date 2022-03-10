package com.employeeproject.employeeprojectah.service

import com.employeeproject.employeeprojectah.entity.Employee
import org.springframework.stereotype.Service


@Service
interface EmployeeService  {
    fun saveEmployee(employee:Employee): Employee;
    fun updateEmployee(employee: Employee):Employee;
    fun deleteEmployeeById(employeeId:Long);
    fun getAllEmployees(): List<Employee>;
    fun getEmployee(employeeId: Long):Employee;
    fun getEmployees(department:String):ArrayList<Employee>
}