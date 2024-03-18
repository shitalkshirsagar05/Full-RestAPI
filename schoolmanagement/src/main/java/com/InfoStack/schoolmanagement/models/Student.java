package com.InfoStack.schoolmanagement.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roll_no")
    private int rollNo;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_city")
    private String city;
    @Column(name = "mobile_no")
    private String mobileNo;

    public Student() {
    }

    public Student(int rollNo, String name, String city, String mobileNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
        this.mobileNo = mobileNo;
    }

    public Student(String name, String city, String mobileNo) {
        this.name = name;
        this.city = city;
        this.mobileNo = mobileNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}