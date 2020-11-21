package com.itheimalearn.edumanager.domain;

public class Student extends Person {
    private String classroom;

    public Student(String id, String name, String birthday, String classroom ){
        super(id, name, birthday);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return super.toString() +
                " {classroom='" + classroom + '\'' +
                '}';
    }
}
