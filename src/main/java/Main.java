import com.student.information.management.appl.facade.student.StudentFacade;
import com.student.information.management.appl.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.appl.model.student.Student;
import com.student.information.management.data.student.dao.StudentDao;
import com.student.information.management.data.student.dao.impl.StudentDaoImpl;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static List<String> existingStudentIds = new ArrayList<>();
    public static void main(String[] args) {
        StudentInfoMgtApplication app = new StudentInfoMgtApplication();
        StudentFacade studentFacade = app.getStudentFacade();
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
        if (!lastName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Last Name. Please try again.");
            return;
        }
        newStudent.setLastName(lastName);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        if (!firstName.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        newStudent.setFirstName(firstName);

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        if (!middleName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Middle Name. Please try again.");
            return;
        }
        newStudent.setMiddleName(middleName);

        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        if (!(sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female"))) {
            System.out.println("Invalid sex. Please enter 'Male' or 'Female'.");
            return;
        }
        newStudent.setSex(sex);


        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();

        if (!isValidBirthday(birthday)) {
            System.out.println("Invalid birthday format. Please enter the date in MM/DD/YYYY format.");
            return;
        }

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
        if (!religion.matches("[a-zA-Z ]+")) {
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

        if (studentFacade.findStudentByEmail(email) != null) {
            System.out.println("Email address is already in use. Please enter a different email address.");
            return;
        }
        newStudent.setEmail(email);


        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        if (!(address != null && !address.isEmpty())) {
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
        if (!lastName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Last Name. Please try again.");
            return;
        }
        studentToUpdate.setLastName(lastName);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        if (!firstName.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid First Name. Please try again.");
            return;
        }
        studentToUpdate.setFirstName(firstName);

        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        if (!middleName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid Middle Name. Please try again.");
            return;
        }
        studentToUpdate.setMiddleName(middleName);

        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();

        if (!(sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female"))) {
            System.out.println("Invalid sex. Please enter 'Male' or 'Female'.");
            return;
        }
        studentToUpdate.setSex(sex);

        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();

        if (!isValidBirthday(birthday)) {
            System.out.println("Invalid birthday format. Please enter the date in MM/DD/YYYY format.");
            return;
        }

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
        if (!religion.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid Religion. Please try again.");
            return;
        }
        studentToUpdate.setReligion(religion);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        } if (!email.equals(studentToUpdate.getEmail()) && studentFacade.findStudentByEmail(email) != null) {
            System.out.println("Email address is already in use. Please enter a different email address.");
            return;
        }

        studentToUpdate.setEmail(email);



        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        if (!(address != null && !address.isEmpty())) {
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

    /**
     * Validation for student id should be have a pattern like CT00-0000.
     */

    public static boolean isValidStudentId(String studentId) {
        String pattern = "CT\\d{2}-\\d{4}";
        if (studentId.matches(pattern)) {
            if (existingStudentIds.contains(studentId)) {
                System.out.println("Student ID " + studentId + " already exists.");
                return false;
            } else {
                existingStudentIds.add(studentId);
                return true;
            }
        } else {
            System.out.println("Invalid student ID format.");
            return false;
        }
    }

    /**
     * Validation for Birthday it should have this pattern MM/DD/YYYY.
     */
    public static boolean isValidBirthday(String birthday) {
        String[] parts = birthday.split("/");
        if (parts.length != 3)
            return false;

        int month, day, year;
        try {
            month = Integer.parseInt(parts[0]);
            day = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        if (month < 1 || month > 12)
            return false;

        if (day < 1 || day > 31)
            return false;

        if (year < 1950 || year > 2100)
            return false;

        return true;
    }

    /**
     * Validation for email it should have a @ and . input.
     */
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    /**
     * Validation for contact number it should be a number only.
     */
    public static boolean isValidContactNumber(String contactNumber) {
        String contactNumberRegex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(contactNumberRegex);
        Matcher matcher = pattern.matcher(contactNumber);
        return matcher.matches();
    }
}