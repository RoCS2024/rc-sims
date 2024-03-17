import com.student.information.management.app.facade.student.StudentFacade;
import com.student.information.management.app.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.app.model.student.Student;

import java.util.List;
import java.util.Scanner;

import static com.student.information.management.app.model.student.Student.*;
/**
 * This is the main.
 */
public class Main {
    public static void main(String[] args) {
        StudentFacade studentFacade = new StudentFacadeImpl();
        Scanner sc = new Scanner(System.in);

        /**
         * This is for displaying students with their information.
         */
        System.out.println("Showing all students...");
        List<Student> studentList;
        studentList = studentFacade.getAllStudents();
        for(Student student: studentList) {
            System.out.println("Student ID: " + student.getStudentId() + " | " + student.getLastName() + " | " + student.getFirstName() + " | " + student.getMiddleName() + " | " + student.getSex() + " | " + student.getBirthday() + " | " + student.getReligion() + " | " + student.getEmail() + " | " + student.getAddress() + " | " + student.getContactNumber());
        }

        /**
         * This is for inputting information to add a student.
         */
        System.out.println("Adding a student...");
        Student newStudent = new Student();
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        if (isValidStudentId(studentId)) {
            newStudent.setStudentId(studentId);
        }else {
            System.out.println("Invalid Student ID. Please try again.");
            return;
        }
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        /**
         * Input Validation for Student's Last Name.
         */
        if (isValidLastName(lastName)) {
            newStudent.setLastName(lastName);
        } else {
            System.out.println("Invalid Last Name. Please try again.");
            return;
        }
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        /**
         * Input Validation for Student's First Name.
         */
        if (isValidFirstName(firstName)) {
            newStudent.setFirstName(firstName);
        } else {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();

        /**
         * Input Validation for Student's Middle Name.
         */
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
            System.out.println("Invalid sex. Please enter \"Male\" or \"Female\".");
            return;
        }
        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();

        /**
         * Input Validation for Date of Birth.
         */
        while (!isValidBirthday(birthday)) {
            System.out.println("Invalid birthday format. Please use MM/DD/YYYY.");
            System.out.print("Enter Birthday (MM/DD/YYYY): ");
            birthday = sc.nextLine();
        }
        newStudent.setBirthday(birthday);
        System.out.print("Enter Religion: ");
        String religion = sc.nextLine();

        /**
         * Input Validation for Religion.
         */
        if (isValidReligion(sex)) {
            newStudent.setReligion(religion);
        } else {
            System.out.println("Invalid religion. Please enter a valid religion.");
            return;
        }
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        /**
         * Input Validation for Email.
         */
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
            System.out.println("Error in adding student." + e.getMessage());
            return;
        }
        System.out.println("Student successfully added.");

        /**
         * This is for updating student.
         */
        int option;
        do {
            displayMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    UpdateStudentById();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

        } while (option != 2);
    }

    private static void displayMenu() {
        System.out.println("----- User List Application -----");
        System.out.println("1. Update Student");
        System.out.println("2. Exit");
        System.out.print("Choose an option: ");
    }
    public static void UpdateStudentById(){
        Scanner sc = new Scanner(System.in);
        StudentFacade studentFacade = new StudentFacadeImpl();
        System.out.println("Searching ID");
        System.out.print("Enter search ID: ");
        String students = sc.nextLine();
        Student uStudents = studentFacade.getStudentById(students);
        uStudents.setStudentId(students);


        if (uStudents == null){
            System.out.println("Student not found");
            return;
        }else {
            System.out.println("StudentID: " + uStudents.getStudentId());
            System.out.println("LASTNAME: : " + uStudents.getLastName());
            System.out.println("FIRSTNAME: " + uStudents.getFirstName());
            System.out.println("MIDDLENAME: " + uStudents.getMiddleName());
            System.out.println("SEX: " + uStudents.getSex());
            System.out.println("Birthday: "+ uStudents.getBirthday());
            System.out.println("RELIGION: " + uStudents.getReligion());
            System.out.println("EMAIL: " + uStudents.getEmail());
            System.out.println("ADDRESS: " + uStudents.getAddress());
            System.out.println("CONTACT#: " + uStudents.getContactNumber());
        }

        System.out.println("Updating");

        System.out.println("Update Last Name");
        String lastName = sc.nextLine();
        if (!isValidLastName(lastName)) {
            System.out.println("Invalid last name format.");
            return;
        }
        uStudents.setLastName(lastName);

        // Update firstname
        System.out.println("Update First Name");
        String firstName = sc.nextLine();
        if (!isValidFirstName(firstName)) {
            System.out.println("Invalid first name format.");
            return;
        }
        uStudents.setFirstName(firstName);

        System.out.println("Update Middle Name");
        String middleName = sc.nextLine();
        if (!isValidMiddleName(middleName)) {
            System.out.println("Invalid middle name format.");
            return;
        }
        uStudents.setMiddleName(middleName);

        System.out.println("Update Sex");
        String sex = sc.nextLine();
        if (!isValidSex(sex)) {
            System.out.println("Invalid sex format.");
            return;
        }
        uStudents.setSex(sex);

        System.out.println("Update Birthday (MM/DD/YYYY)");
        String birthday = sc.nextLine();
        if (!isValidBirthday(birthday)) {
            System.out.println("Invalid birthday format.");
            return;
        }
        uStudents.setBirthday(birthday);

        System.out.println("Update Religion");
        String religion = sc.nextLine();
        if (!isValidReligion(religion)) {
            System.out.println("Invalid religion format.");
            return;
        }
        uStudents.setReligion(religion);

        System.out.println("Update Email");
        String email = sc.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format.");
            return;
        }
        uStudents.setEmail(email);

        System.out.println("Update Address");
        String address = sc.nextLine();
        if (!isValidAddress(address)) {
            System.out.println("Invalid address format.");
            return;
        }
        uStudents.setAddress(address);

        System.out.println("Update Contact Number");
        String contactNumber = sc.nextLine();
        if (!isValidContactNumber(contactNumber)) {
            System.out.println("Invalid contact number format.");
            return;
        }
        uStudents.setContactNumber(contactNumber);

        try {
            studentFacade.updateStudent(uStudents);
            System.out.println("Update Successful.");
        } catch (Exception e) {
            System.out.println("Error updating: " + e.getMessage());
        }
    }
}
