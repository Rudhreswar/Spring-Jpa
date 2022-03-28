package com.rudra.springjpa.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

  @Id
  @Column(name = "department_id")
  private long departmentId;
  @Column(name = "department_description")
  private String departmentDescription;

  @OneToMany
  private List<Employee> employees;


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public String getDepartmentDescription() {
    return departmentDescription;
  }

  public void setDepartmentDescription(String departmentDescription) {
    this.departmentDescription = departmentDescription;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }
}
