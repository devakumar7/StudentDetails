package com.deva.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deva.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> 
{

}
