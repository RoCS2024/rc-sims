package com.update.student;

import com.update.student.app.facade.student.StudentFacade;
import com.update.student.app.facade.student.impl.StudentFacadeImpl;
import com.update.student.app.model.student.Student;


import java.util.Scanner;


public class Main {


public static void main(String[] args) {
    StudentFacade studentFacade = new StudentFacadeImpl();
    Scanner sc = new Scanner(System.in);


    System.out.println("searching Id");
    System.out.print("Enter search id: ");
    String students = sc.nextLine();
    Student searchStudent = studentFacade.getStudentById(students);

    if (searchStudent == null){
        System.out.println("Student not found");
        return;
    }else {
        System.out.println("StudentID: " + searchStudent.getId());
        System.out.println("LASTNAME: : " + searchStudent.getLastname());
        System.out.println("FIRSTNAME: " + searchStudent.getFirstname());
        System.out.println("MIDDLENAME: " + searchStudent.getMiddlename());
        System.out.println("SEX: " + searchStudent.getSex());
        //System.out.println(searchStudent.getBirthday());
        System.out.println("RELIGION: " + searchStudent.getReligion());
        System.out.println("EMAIL: " + searchStudent.getEmail());
        System.out.println("ADDRESS: " + searchStudent.getAddress());
        System.out.println("CONTACT#: " + searchStudent.getContactnumber());
    }


        System.out.println("Updating");
        Student uStudents = new Student();
        System.out.println("Update lastname");
        uStudents.setLastname(sc.nextLine());
        System.out.println("Update firstname");
        uStudents.setFirstname(sc.nextLine());
        System.out.println("Update middlename");
        uStudents.setMiddlename(sc.nextLine());
        System.out.println("Update sex");
        uStudents.setSex(sc.nextLine());
    //    System.out.println("Update birthday");
    //    uStudents.setBirthday(sc.nextLine());
        System.out.println("Update religion");
        uStudents.setReligion(sc.nextLine());
        System.out.println("Update email");
        uStudents.setEmail(sc.nextLine());
        System.out.println("Update address");
        uStudents.setAddress(sc.nextLine());
        System.out.println("Update contactnumber");
        uStudents.setContactnumber(sc.nextLine());

        try{
            if (searchStudent == null){
            studentFacade.updateStudent(uStudents);
             }
        } catch (Exception e){
            System.out.println("Error Updating" + e.getMessage());

        }
        System.out.println("successfull");

        }
}
//
//    private static void updateStudent()  {
//       try{
//           System.out.println("Enter the student id to update: ");
//           String updateId = scanner.nextLine();
//           Student student = new Student();
//
//           if(student != null){
//               student.setId(updateId);
//               System.out.println("Enter new Lastname: ");
//               String newLastname = scanner.nextLine();
//               student.setLastname(newLastname);
//               System.out.println("Enter new Firstname: ");
//               String newFirstname = scanner.nextLine();
//               student.setFirstname(newFirstname);
//               System.out.println("Enter new Middlename: ");
//               String newMiddlename = scanner.nextLine();
//               student.setMiddlename(newMiddlename);
//               System.out.println("Enter new Sex: ");
//               String newSex = scanner.nextLine();
//               student.setSex(newSex);
//               //System.out.println("Enter new Birthday: ");
//               //Timestamp newBirthday = Timestamp.valueOf(scanner.nextLine());
//               //student.setBirthday(newBirthday);
//               System.out.println("Enter new Religion: ");
//               String newReligion = scanner.nextLine();
//               student.setReligion(newReligion);
//               System.out.println("Enter new Email: ");
//               String newEmail = scanner.nextLine();
//               student.setEmail(newEmail);
//               System.out.println("Enter new Address: ");
//               String newAddress = scanner.nextLine();
//               student.setAddress(newAddress);
//               System.out.println("Enter new Contact#: ");
//               String newContactNo = scanner.nextLine();
//               student.setContactnumber(newContactNo);
//
//
//               studentFacade.updateStudent(student);
//
//               System.out.println("Studemt update successfully");
//
//           }else{
//               System.out.println("");
//           }
//       }catch (Exception e){
//           System.out.println("Error updating student:");
//           e.printStackTrace();
//       }
//
//    }
//}

