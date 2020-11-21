package com.itheimalearn.edumanager.dao;

import com.itheimalearn.edumanager.domain.Person;
import com.itheimalearn.edumanager.domain.Student;

public class StudentDaoImpl implements BaseDao {
    private static Person[] students = new Person[10];

    static {
        students[0] = new Student("9","test1","2001-11-15","33");
        students[1] = new Student("10","test2","2001-11-15","33");
    }

    @Override
    public boolean add(Person student) {
        int i;
        for( i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        int i;
        for(i=0; i<students.length; i++){
            if(students[i]!=null && students[i].getId().equals(id)){
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(String id, Person student) {
        for(int i=0; i<students.length; i++){
            if(students[i]!=null && students[i].getId().equals(id)){
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] findAll() {
        return students;
    }
}
