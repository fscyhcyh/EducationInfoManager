package com.itheimalearn.edumanager.dao;

import com.itheimalearn.edumanager.domain.Person;
import com.itheimalearn.edumanager.domain.Teacher;


public class TeacherDaoImpl implements BaseDao {
    private static Person[] teachers = new Person[10];

    static {
        teachers[0] = new Teacher("9","test1","2001-11-15","Dean");
        teachers[1] = new Teacher("10","test2","2001-11-15","Zhuren");
    }

    @Override
    public boolean add(Person teacher) {
        int i;
        for( i = 0; i < teachers.length; i++){
            if(teachers[i] == null){
                teachers[i] = teacher;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        int i;
        for(i=0; i<teachers.length; i++){
            if(teachers[i]!=null && teachers[i].getId().equals(id)){
                teachers[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(String id, Person teacher) {
        for(int i=0; i<teachers.length; i++){
            if(teachers[i]!=null && teachers[i].getId().equals(id)){
                teachers[i] = teacher;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] findAll() {
        return teachers;
    }
}
