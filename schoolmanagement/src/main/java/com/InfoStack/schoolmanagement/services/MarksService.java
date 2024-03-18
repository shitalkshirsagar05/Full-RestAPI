package com.InfoStack.schoolmanagement.services;

import com.InfoStack.schoolmanagement.models.StudentMarks;
import com.InfoStack.schoolmanagement.repositories.StudentMarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {
    @Autowired
    StudentMarksRepository r;

    public StudentMarks saveData(StudentMarks sm) {
        return r.save(sm);
    }

    public List<StudentMarks> getAllData() {
        return (List<StudentMarks>) r.findAll();
    }
}
