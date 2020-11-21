package com.itheimalearn.edumanager.entry;

import com.itheimalearn.edumanager.controller.Controller;
import com.itheimalearn.edumanager.controller.StudentControllerImpl;
import com.itheimalearn.edumanager.controller.TeacherControllerImpl;

import java.util.Scanner;

public class EduManagerEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input ;
        Controller StudentController = new StudentControllerImpl();
        Controller TeacherController = new TeacherControllerImpl();

        loop:while(true){
            System.out.println("---Welcome To Education Info Management Systetm---");
            System.out.println("What do you want to manage? (Please input number)");
            System.out.println("1, Student  2, Teacher  3, Exit");
            input = sc.next();
            switch(input){
                case "1":
                    StudentController.start();
                    break;
                case "2":
                    TeacherController.start();
                    break;
                case "3":
                    break loop;
                default:
                    System.out.println("Please retype your input");
                    break;
            }

        }
        System.out.println("Thanks for using Education Info Manager!");

    }
}
