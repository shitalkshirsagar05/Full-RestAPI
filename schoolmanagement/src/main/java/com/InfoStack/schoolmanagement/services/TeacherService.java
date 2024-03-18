package com.InfoStack.schoolmanagement.services;


import com.InfoStack.schoolmanagement.models.Teacher;
import com.InfoStack.schoolmanagement.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository tr;
    public Teacher saveData(Teacher t) {
        return tr.save(t);

    }

    public Teacher saveTeacherData(Teacher t) {


        return tr.save(t);
    }

    public Teacher getTeacherDetails(int teacherId) {

        return tr.findById(teacherId).get();
    }

    public List<Teacher> getAllTeachers() {
        return (List<Teacher>) tr.findAll();
    }

    public void deleteTeacher(int teacherId) {

        tr.deleteById(teacherId);
    }
}
