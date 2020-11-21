package com.itheimalearn.edumanager.dao;

import com.itheimalearn.edumanager.domain.Person;
import com.itheimalearn.edumanager.domain.Student;

public interface BaseDao {

    public boolean add(Person person);
    public boolean delete(String id);
    public boolean update(String id, Person person);
    public Person[] findAll();

}
