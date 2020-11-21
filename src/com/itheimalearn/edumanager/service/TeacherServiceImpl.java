package com.itheimalearn.edumanager.service;

import com.itheimalearn.edumanager.dao.BaseDao;
import com.itheimalearn.edumanager.dao.StudentDaoImpl;
import com.itheimalearn.edumanager.dao.TeacherDaoImpl;
import com.itheimalearn.edumanager.domain.Person;
import com.itheimalearn.edumanager.domain.Student;
import com.itheimalearn.edumanager.domain.Teacher;

import java.util.Scanner;

public class TeacherServiceImpl implements BaseService{
    BaseDao dao = new TeacherDaoImpl();
    Scanner sc = new Scanner(System.in);

    @Override
    public boolean add() {
        Person teacher = assambleTeacher();
        if(exist(teacher.getId()) == -1){
            return dao.add(teacher);
        }else {
            return false;
        }
    }

    @Override
    public boolean delete() {
        System.out.println("Please enter Teacher ID");
        String id = sc.next();
        if(exist(id) != -1){
            return dao.delete(id);
        }else{
            return false;
        }

    }

    @Override
    public boolean update() {
        Person teacher = assambleTeacher();
        if(exist(teacher.getId()) == -1){
            return dao.update(teacher.getId(), teacher);
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
        Person[] teachers = findAll();
        for(int i=0; i < teachers.length; i++){
            if(teachers[i] != null && teachers[i].equals(id)){
                return i;
            }
        }
        return -1;
    }


    private Person assambleTeacher(){
        System.out.println("Please enter Teacher ID");
        String id = sc.next();
        System.out.println("Please enter Teacher Name");
        String name = sc.next();
        System.out.println("Please enter Teacher Birthday");
        String birthday = sc.next();
        System.out.println("Please enter Teacher Role");
        String role = sc.next();
        Person teacher = new Teacher(id, name, birthday, role);
        return teacher;
    }
}
