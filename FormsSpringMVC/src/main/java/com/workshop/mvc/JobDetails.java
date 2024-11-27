package com.workshop.mvc;

import org.springframework.stereotype.Component;

@Component
public class JobDetails {
  
  private String jobRole;
  private int salary;
  private boolean isPermanent;

  // Default constructor for Spring to use
  public JobDetails() {
    this.jobRole = "Employee"; // Default role
    this.salary = 6000; // Default salary
    this.isPermanent = true; // Default permanent status
  }

  public JobDetails(String jobRole, int salary, boolean isPermanent) {
    this.jobRole = jobRole;
    this.salary = salary;
    this.isPermanent = isPermanent;
  }

  // Getters and Setters

  public String getJobRole() {
    return jobRole;
  }

  public void setJobRole(String jobRole) {
    this.jobRole = jobRole;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public boolean getIsPermanent() {
    return isPermanent;
  }
 
  public void setIsPermanent(boolean isPermanent) {
	  this.isPermanent = isPermanent;
  }
}