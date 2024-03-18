package com.InfoStack.schoolmanagement.services;

import com.InfoStack.schoolmanagement.models.Student;
import com.InfoStack.schoolmanagement.models.Teacher;
import com.InfoStack.schoolmanagement.repositories.StudentRepository;
import com.InfoStack.schoolmanagement.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository tr;

    public Teacher saveTeacherData(Teacher t)
    {
        return tr.save(t);
    }


    public Student getStudentDetails(int rollno) {

        return studentRepository.findById(rollno).get();
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public void deleteStudent(int rollNo){

        studentRepository.deleteById(rollNo);
    }


    public Student saveData(Student s) {
        return studentRepository.save(s);
    }

}
