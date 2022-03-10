package com.employeeproject.employeeprojectah.restcontroller

import com.employeeproject.employeeprojectah.entity.Employee
import com.employeeproject.employeeprojectah.service.EmployeeImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController {
    @Autowired
    lateinit var employeeImpl: EmployeeImpl;
    @PostMapping("/saveEmployee")
    fun createEmployee(@RequestBody employee:Employee):String
    {
        employeeImpl.saveEmployee(employee);
        return "Successfully saved the employee details"
    }
    @DeleteMapping("/deleteEmployee/{employeeId}")
    fun deleteEmployee(@PathVariable employeeId: Long):String{
        employeeImpl.deleteEmployeeById(employeeId)
        return "Employee details successfully deleted"
    }
    @GetMapping("/getAllEmployees")
    fun getAllEmployees():List<Employee>{
        println("Employee")
        return employeeImpl.getAllEmployees()
    }
    @GetMapping("/getEmployeeById/{employeeId}")
    fun getEmployeeById(@PathVariable employeeId:Long):Employee{
      return employeeImpl.getEmployee(employeeId)
    }
    @GetMapping("/getEmployeeByDepartment")
    fun getEmployeesDep(@RequestParam("department") department:String): ArrayList<Employee> {
        print(department)
        return employeeImpl.getEmployees(department)
    }

}
