package com.example.springstudentweb.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.springstudentweb.data.entity.Student;



public interface StudentRepository extends CrudRepository<Student, Integer>
{

    Student findById( int id );

}