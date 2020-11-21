package com.itheimalearn.edumanager.controller;

import com.itheimalearn.edumanager.domain.Person;
import com.itheimalearn.edumanager.service.BaseService;
import com.itheimalearn.edumanager.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentControllerImpl implements Controller {
    Scanner sc = new Scanner(System.in);
    BaseService service = new StudentServiceImpl();

    @Override
    public void start() {
        loop: while (true){
            System.out.println("\n---Student Info Management---");
            System.out.println("What do you want to manage? (Please input number)");
            System.out.println("1,Add  2,Delete  3,Update  4,Find  5,Exit");
            String input = sc.next();
            switch(input){
                case "1":
                    add();
                    break;
                case "2":
                    delete();
                    break;
                case "3":
                    update();
                    break;
                case "4":
                    findAll();
                    break;
                case "5":
                    break loop;
                default:
                    System.out.println("Please retype your input");
                    break;
            }

        }
    }

    @Override
    public void add() {
        if( service.add() ){
            System.out.println("Updated Successfully");
        }else {
            System.out.println("Failed to update. Please try again");
        }
    }

    @Override
    public void delete() {
        if(service.delete()){
            System.out.println("Deleted Successfully");
        }else{
            System.out.println("Failed to delete. Please try again");
        }
    }

    @Override
    public void update() {
        if( service.update() ){
            System.out.println("Updated Successfully");
        }else {
            System.out.println("Failed to update. Please try again");
        }
    }

    @Override
    public void findAll() {
        Person[] students = service.findAll();
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                System.out.println(students[i]);
            }
        }
    }
}
