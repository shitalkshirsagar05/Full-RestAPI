package com.InfoStack.schoolmanagement.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_marks")
public class StudentMarks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "subject_1")
    int subject1;
    @Column(name = "subject_2")
    int subject2;
    @Column(name = "subject_3")
    int subject3;
    @ManyToOne
    @JoinColumn(name = "student_roll_no")
    Student student;

    public StudentMarks() {
    }

    public StudentMarks(int id, int subject1, int subject2, int subject3, Student student) {
        this.id = id;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
