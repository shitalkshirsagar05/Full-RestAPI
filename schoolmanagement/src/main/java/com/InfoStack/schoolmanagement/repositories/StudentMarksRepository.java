package com.InfoStack.schoolmanagement.repositories;

import com.InfoStack.schoolmanagement.models.StudentMarks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMarksRepository extends CrudRepository<StudentMarks, Integer> {
}
