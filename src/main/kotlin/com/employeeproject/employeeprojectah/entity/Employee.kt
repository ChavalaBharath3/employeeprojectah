package com.employeeproject.employeeprojectah.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="EmployeeProject")
data class Employee(
    @Id
    @GeneratedValue
    val employeeId:Long=0,
    val firstName:String="",
    val lastName:String="",
    val department:String="") {
}