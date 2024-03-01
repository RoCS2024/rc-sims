import com.student.view.app.facade.student.StudentFacade;
import com.student.view.app.facade.student.impl.StudentFacadeImpl;
import com.student.view.app.model.student.Student;
import com.student.view.data.student.dao.impl.StudentDaoImpl;

import javax.swing.*;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentFacade studentFacade = new StudentFacadeImpl();

    public static void main(String[] args) {
        char choice;
            do{
                    System.out.println("Select your choice");
                    System.out.println("1. View Student table");
                    System.out.println("2. View a Certain student ( Enter the Student Id )");
                    choice = (char) scanner.nextShort();
                    scanner.nextLine();

                    switch(choice){
                        case 1:
                            viewStudentTable();
                            break;
                        case 2:
                            System.out.print("Enter student id: ");
                            String studentId = scanner.nextLine();

                            Student student = (Student) studentFacade.getStudentById(studentId);
                            if(null == student) {
                                System.out.println("cannot find  " + studentId);
                                return;
                            } else {
                                System.out.println("Student information: ");
                                System.out.println(student.getStudentId() + " || " +
                                        student.getLastName() + " || " +
                                        student.getFirstName()+ " || " +
                                        student.getMiddleName()+ " || " +
                                        student.getSex()+ " || " +
                                        student.getBirthdate()+ " || " +
                                        student.getReligion()+ " || " +
                                        student.getEmail()+ " || " +
                                        student.getAddress()+ " || " +
                                        student.getContactNumber());

                            }

                            break;
                    }
            } while (choice !=0);
            scanner.close();
    }


    private static void viewStudentTable() {
        try{
            List<Student> students = studentFacade.getAllStudents();

            if(students.isEmpty()){
                System.out.println("No records found.");
            } else{
                System.out.println("Student Table");
                System.out.println(" studentId, lastName, firstName, middleName, sex, birthdate, religion, email, address, contactNumber");
                for(Student student : students){
                    System.out.println(student.getStudentId() + " || " +
                            student.getLastName() + " || " +
                            student.getFirstName()+ " || " +
                            student.getMiddleName()+ " || " +
                            student.getSex()+ " || " +
                            student.getBirthdate()+ " || " +
                            student.getReligion()+ " || " +
                            student.getEmail()+ " || " +
                            student.getAddress()+ " || " +
                            student.getContactNumber());
                }
            }
        } catch (Exception e) {
            System.out.println("Can't view table, try again.");
                e.printStackTrace();
        }

        }

}


