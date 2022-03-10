package com.employeeproject.employeeprojectah.repository

import com.employeeproject.employeeprojectah.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee,Long> {
    fun findByDepartment(department:String):ArrayList<Employee>
}