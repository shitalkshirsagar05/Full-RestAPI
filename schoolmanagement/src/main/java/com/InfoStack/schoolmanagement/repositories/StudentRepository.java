package com.InfoStack.schoolmanagement.repositories;

import com.InfoStack.schoolmanagement.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
