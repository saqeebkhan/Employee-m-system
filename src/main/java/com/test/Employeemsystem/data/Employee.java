package com.test.Employeemsystem.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    private double aadharnumber;
    private long mobilenumber;
    private String salary;
    private String photo;

    public Employee() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(double aadharnumber) {
        this.aadharnumber = aadharnumber;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Employee(long id, String firstname, String lastname, double aadharnumber, long mobilenumber, String salary, String photo) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.aadharnumber = aadharnumber;
        this.mobilenumber = mobilenumber;
        this.salary = salary;
        this.photo = photo;
    }
}
