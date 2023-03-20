package com.example.springstudentweb.service;

import com.example.springstudentweb.data.entity.Student;

public interface StudentService {
	Iterable<Student> all();

    Student get( int studentId );

    Student save( Student student );

    void delete( int studentId );
}
