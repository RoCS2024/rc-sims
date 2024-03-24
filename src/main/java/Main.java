import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.appl.model.student.Student;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static com.student.information.management.appl.model.student.Student.*;

public class Main {
    public static void main(String[] args) {
        StudentFacade studentFacade = new StudentFacadeImpl();
        Scanner sc = new Scanner(System.in);

        displayMenu();

        int option = sc.nextInt();
        sc.nextLine();

        switch (option) {
            case 1:
                viewAllStudents(studentFacade);
                break;
            case 2:
                addStudent(studentFacade, sc);
                break;
            case 3:
                updateStudentById(studentFacade, sc);
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    private static void displayMenu() {
        System.out.println("----- Student Management System Menu -----");
        System.out.println("1. View All Students");
        System.out.println("2. Add Student");
        System.out.println("3. Update Student");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private static void viewAllStudents(StudentFacade studentFacade) {
        System.out.println("Showing all students...");
        List<Student> studentList = studentFacade.getAllStudents();
        for (Student student : studentList) {
            System.out.println("Student ID: " + student.getStudentId() + " | Name: " + student.getLastName() + ", " + student.getFirstName() + " | Sex: " + student.getSex() + " | Birthday: " + student.getBirthday() + " | Religion: " + student.getReligion() + " | Email: " + student.getEmail() + " | Address: " + student.getAddress() + " | Contact Number: " + student.getContactNumber());
        }
    }

    private static void addStudent(StudentFacade studentFacade, Scanner sc) {
        System.out.println("Adding a new Student...");
        Student newStudent = new Student();

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        if (!isValidStudentId(studentId)) {
            System.out.println("Invalid Student ID. Please try again.");
            return;
        }
        newStudent.setStudentId(studentId);

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        if (!isValidLastName(lastName)) {
            System.out.println("Invalid Last Name. Please try again.");
            return;
        }
        newStudent.setLastName(lastName);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        if (!isValidFirstName(firstName)) {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        newStudent.setFirstName(firstName);

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        if (!isValidMiddleName(middleName)) {
            System.out.println("Invalid Middle Name. Please try again.");
            return;
        }
        newStudent.setMiddleName(middleName);

        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        if (!isValidSex(sex)) {
            System.out.println("Invalid sex. Please enter 'Male' or 'Female'.");
            return;
        }
        newStudent.setSex(sex);

        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date parsedDate = dateFormat.parse(birthday);
            Timestamp date = new Timestamp(parsedDate.getTime());
            newStudent.setBirthday(date);
        } catch (ParseException ex) {
            System.out.println("Invalid date format. Please enter the date in MM/DD/YYYY format.");
            return;
        }

        System.out.print("Enter Religion: ");
        String religion = sc.nextLine();
        if (!isValidReligion(religion)) {
            System.out.println("Invalid Religion. Please try again.");
            return;
        }
        newStudent.setReligion(religion);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        }
        newStudent.setEmail(email);

        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        if (!isValidAddress(address)) {
            System.out.println("Invalid address format. Please try again.");
            return;
        }
        newStudent.setAddress(address);

        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.nextLine();
        if (!isValidContactNumber(contactNumber)) {
            System.out.println("Invalid contact number format. Please try again.");
            return;
        }
        newStudent.setContactNumber(contactNumber);

        try {
            studentFacade.addStudent(newStudent);
            System.out.println("Student successfully added.");
        } catch (Exception e) {
            System.out.println("Error in adding student: " + e.getMessage());
        }
    }

    private static void updateStudentById(StudentFacade studentFacade, Scanner sc) {
        System.out.println("Updating Student...");
        System.out.print("Enter Student ID to update: ");
        String studentId = sc.nextLine();
        Student studentToUpdate = studentFacade.getStudentById(studentId);
        if (studentToUpdate == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        if (!isValidLastName(lastName)) {
            System.out.println("Invalid Last Name. Please try again.");
            return;
        }
        studentToUpdate.setLastName(lastName);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        if (!isValidFirstName(firstName)) {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        studentToUpdate.setFirstName(firstName);

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        if (!isValidMiddleName(middleName)) {
            System.out.println("Invalid Middle Name. Please try again.");
            return;
        }
        studentToUpdate.setMiddleName(middleName);

        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        if (!isValidSex(sex)) {
            System.out.println("Invalid sex. Please enter 'Male' or 'Female'.");
            return;
        }
        studentToUpdate.setSex(sex);

        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date parsedDate = dateFormat.parse(birthday);
            Timestamp date = new Timestamp(parsedDate.getTime());
            studentToUpdate.setBirthday(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        System.out.print("Enter Religion: ");
        String religion = sc.nextLine();
        if (!isValidReligion(religion)) {
            System.out.println("Invalid Religion. Please try again.");
            return;
        }
        studentToUpdate.setReligion(religion);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        }
        studentToUpdate.setEmail(email);

        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        if (!isValidAddress(address)) {
            System.out.println("Invalid address format. Please try again.");
            return;
        }
        studentToUpdate.setAddress(address);

        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.nextLine();
        if (!isValidContactNumber(contactNumber)) {
            System.out.println("Invalid contact number format. Please try again.");
            return;
        }
        studentToUpdate.setContactNumber(contactNumber);

        try {
            studentFacade.updateStudent(studentToUpdate);
            System.out.println("Student successfully updated.");
        } catch (Exception e) {
            System.out.println("Error in updating student: " + e.getMessage());
        }
    }
}