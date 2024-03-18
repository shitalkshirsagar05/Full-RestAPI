package com.InfoStack.schoolmanagement.services;

import com.InfoStack.schoolmanagement.models.Peon;
import com.InfoStack.schoolmanagement.models.Student;
import com.InfoStack.schoolmanagement.models.Teacher;
import com.InfoStack.schoolmanagement.repositories.PeonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeonService {
    @Autowired
  PeonRepository pe;
    @Autowired
    private PeonRepository peonRepository;

    public Peon savePeonData(Peon P)
    {
        return pe.save(P);
    }

    public Peon getPeonDetails(int rollno) {

        return peonRepository.findById(rollno).get();
    }

    public List<Peon> getAllPeons() {
        return (List<Peon>) peonRepository.findAll();
    }

    public void deletePeon(int rollNo){

        peonRepository.deleteById(rollNo);
    }
    public Peon saveData(Peon p) {
        return peonRepository.save(p);
    }
}

