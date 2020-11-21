package com.itheimalearn.edumanager.service;

import com.itheimalearn.edumanager.domain.Person;

public interface BaseService {
    public boolean add();
    public boolean delete();
    public boolean update();
    public Person[] findAll();
    public int exist(String id);
}
