package com.itheimalearn.edumanager.controller;

import com.itheimalearn.edumanager.domain.Person;

import java.util.Scanner;

public interface Controller {

    default void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to manage? (Please input number)");
        System.out.println("1,Add  2,Delete  3,Update  4,Find  5,Exit");

        loop: while (true){
            String input = sc.next();
            switch(input){
                case "1":
                    System.out.println("Add");
                    break;
                case "2":
                    System.out.println("Delete");
                    break;
                case "3":
                    System.out.println("Update");
                    break;
                case "4":
                    System.out.println("Find");
                    break;
                case "5":
                    break loop;
                default:
                    System.out.println("Please retype your input");
                    break;
            }

        }
    };
    public void add();
    public void delete();
    public void update();
    public void findAll();


}
