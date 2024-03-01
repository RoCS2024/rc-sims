import com.student.information.management.add.app.facade.student.StudentFacade;
import com.student.information.management.add.app.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.add.app.model.student.Student;

import java.util.Scanner;

import static com.student.information.management.add.app.model.student.Student.*;

public class Main {
    public static void main(String[] args) {
        StudentFacade studentFacade = new StudentFacadeImpl();
        Scanner sc = new Scanner(System.in);

        /**
         * This is for need to input information of the student for adding student.
         */
        System.out.println("Adding an Student...");
        Student newStudent = new Student();
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        if (isValidStudentId(studentId)) {
            newStudent.setStudentId(studentId);
        } else {
            System.out.println("Invalid Student ID. Please try again.");
        }
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        if (isValidLastName(lastName)) {
            newStudent.setLastName(lastName);
        } else {
            System.out.println("Invalid Last Name. Please try again.");
            return;
        }
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        if (isValidFirstName(firstName)) {
            newStudent.setFirstName(firstName);
        } else {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        if (isValidMiddleName(middleName)) {
            newStudent.setMiddleName(middleName);
        } else {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        if (isValidSex(sex)) {
            newStudent.setSex(sex);
        } else {
            System.out.println("Invalid sex. Please enter 'Male' or 'Female'.");
            return;
        }
        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();

        while (!isValidBirthday(birthday)) {
            System.out.println("Invalid birthday format. Please use MM/DD/YYYY.");
            System.out.print("Enter Birthday (MM/DD/YYYY): ");
            birthday = sc.nextLine();
        }
        newStudent.setBirthday(birthday);
        System.out.print("Enter Religion: ");
        String religion = sc.nextLine();
        if (isValidReligion(sex)) {
            newStudent.setReligion(religion);
        } else {
            System.out.println("Invalid Religion. Please enter Religion.");
            return;
        }
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        if (isValidEmail(email)) {
            newStudent.setEmail(email);
        } else {
            System.out.println("Invalid email format. Please enter a valid email.");
            return;
        }
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        if (isValidAddress(address)) {
            newStudent.setAddress(address);
        } else {
            System.out.println("Address should not be null.");
        }
        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.nextLine();
        if (isValidContactNumber(contactNumber)) {
            newStudent.setContactNumber(contactNumber);
        } else {
            System.out.println("Invalid contact number format. Please enter a valid contact number.");
            return;
        }
        try {
            studentFacade.addStudent(newStudent);
        } catch (Exception e) {
            System.out.println("Error in adding student. " + e.getMessage());
            return;
        }
        System.out.println("Student successfully added.");
    }
}
