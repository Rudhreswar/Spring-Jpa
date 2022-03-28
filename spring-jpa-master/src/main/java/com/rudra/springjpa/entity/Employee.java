package com.rudra.springjpa.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @Column(name = "employee_id")
  private long employeeId;
  @Column(name = "full_name")
  private String fullName;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "position_id")
  private long positionId;
  @Column(name = "position_title")
  private String positionTitle;

  @Column(name = "store_id")
  private long storeId;
  @ManyToOne
  private Department department;

  @Column(name = "birth_date")
  private LocalDate birthDate;
  @Column(name = "hire_date")
  private LocalDateTime hireDate;
  @Column(name = "end_date")
  private LocalDateTime endDate;
  @Column(name = "salary")
  private double salary;
  @Column(name = "supervisor_id")
  private long supervisorId;
  @Column(name = "education_level")
  private String educationLevel;
  @Column(name = "marital_status")
  private String maritalStatus;
  @Column(name = "gender")
  private String gender;
  @Column(name = "management_role")
  private String managementRole;

  public long getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(long employeeId) {
    this.employeeId = employeeId;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public long getPositionId() {
    return positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }

  public String getPositionTitle() {
    return positionTitle;
  }

  public void setPositionTitle(String positionTitle) {
    this.positionTitle = positionTitle;
  }

  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public LocalDateTime getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDateTime hireDate) {
    this.hireDate = hireDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public long getSupervisorId() {
    return supervisorId;
  }

  public void setSupervisorId(long supervisorId) {
    this.supervisorId = supervisorId;
  }

  public String getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }

  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getManagementRole() {
    return managementRole;
  }

  public void setManagementRole(String managementRole) {
    this.managementRole = managementRole;
  }
}
