package com.itheimalearn.edumanager.domain;

public class Teacher extends Person {
    private String role;

    public Teacher(String id, String name, String birthday, String role ){
        super(id, name, birthday);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString() +
                " {role='" + role + '\'' +
                '}';
    }
}
