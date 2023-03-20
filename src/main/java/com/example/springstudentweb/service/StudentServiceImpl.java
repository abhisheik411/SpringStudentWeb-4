package com.example.springstudentweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springstudentweb.data.entity.Student;
import com.example.springstudentweb.repository.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService
{

    private final StudentRepository studentRepository;

    public StudentServiceImpl( @Autowired StudentRepository studentsRepository )
    {
        this.studentRepository = studentsRepository;
    }

    @Override
    public Iterable<Student> all()
    {
        return studentRepository.findAll();
    }

    @Override
    public Student get( int studentId )
    {
        return studentRepository.findById( studentId );
    }

    @Override
    public Student save( Student student )
    {
        return studentRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        studentRepository.deleteById( studentId );
    }

	

	

	

	
}
