package com.update.student;

import com.update.student.app.facade.student.StudentFacade;
import com.update.student.app.facade.student.impl.StudentFacadeImpl;
import com.update.student.app.model.student.Student;


import java.sql.Timestamp;
import java.util.Scanner;


public class Main {


public static void main(String[] args) {
    StudentFacade studentFacade = new StudentFacadeImpl();
    Scanner sc = new Scanner(System.in);


    System.out.println("searching Id");
    System.out.print("Enter search id: ");
    String students = sc.nextLine();
    Student uStudents = studentFacade.getStudentById(students);
    uStudents.setId(students);


    if (uStudents == null){
        System.out.println("Student not found");
        return;
    }else {
        System.out.println("StudentID: " + uStudents.getId());
        System.out.println("LASTNAME: : " + uStudents.getLastname());
        System.out.println("FIRSTNAME: " + uStudents.getFirstname());
        System.out.println("MIDDLENAME: " + uStudents.getMiddlename());
        System.out.println("SEX: " + uStudents.getSex());
        System.out.println("Birthday: "+ uStudents.getBirthday());
        System.out.println("RELIGION: " + uStudents.getReligion());
        System.out.println("EMAIL: " + uStudents.getEmail());
        System.out.println("ADDRESS: " + uStudents.getAddress());
        System.out.println("CONTACT#: " + uStudents.getContactnumber());
    }

        System.out.println("Updating");
        System.out.println("Update lastname");
        uStudents.setLastname(sc.nextLine());
        System.out.println("Update firstname");
        uStudents.setFirstname(sc.nextLine());
        System.out.println("Update middlename");
        uStudents.setMiddlename(sc.nextLine());
        System.out.println("Update sex");
        uStudents.setSex(sc.nextLine());
        System.out.println("Update birthday");
        uStudents.setBirthday(Timestamp.valueOf(sc.nextLine()));
        System.out.println("Update religion");
        uStudents.setReligion(sc.nextLine());
        System.out.println("Update email");
        uStudents.setEmail(sc.nextLine());
        System.out.println("Update address");
        uStudents.setAddress(sc.nextLine());
        System.out.println("Update contactnumber");
        uStudents.setContactnumber(sc.nextLine());

        try{
            studentFacade.updateStudent(uStudents);
        } catch (Exception e){
            System.out.println("Error Updating" + e.getMessage());
            return;
        }
        System.out.println("successfull");
        }
}
