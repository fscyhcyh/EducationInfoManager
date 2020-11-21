package com.itheimalearn.edumanager.service;

import com.itheimalearn.edumanager.dao.BaseDao;
import com.itheimalearn.edumanager.dao.StudentDaoImpl;
import com.itheimalearn.edumanager.domain.Person;
import com.itheimalearn.edumanager.domain.Student;

import java.util.Scanner;

public class StudentServiceImpl implements BaseService{
    BaseDao dao = new StudentDaoImpl();
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean add() {
        Person student = assambleStudent();
        if(exist(student.getId())==-1){
            return dao.add(student);
        }else {
            return false;
        }

    }

    @Override
    public boolean delete() {
        System.out.println("Please enter Student ID");
        String id = sc.next();
        if(exist(id )!=-1){
            return dao.delete(id);
        }else {
            return false;
        }


    }

    @Override
    public boolean update() {
        Person student = assambleStudent();
        if(exist(student.getId())!=-1){
            return dao.update(student.getId(),student);
        }else {
            return false;
        }

    }

    @Override
    public Person[] findAll() {
        return dao.findAll();
    }

    @Override
    public int exist(String id) {
        Person[] students = findAll();
        for(int i =0; i < students.length; i++){
            if(students[i] != null && students[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    private Person assambleStudent(){
        System.out.println("Please enter Student ID");
        String id = sc.next();
        System.out.println("Please enter Student Name");
        String name = sc.next();
        System.out.println("Please enter Student Birthday");
        String birthday = sc.next();
        System.out.println("Please enter Student Classroom");
        String classroom = sc.next();
        Person student = new Student(id, name, birthday, classroom);
        return student;
    }
}
