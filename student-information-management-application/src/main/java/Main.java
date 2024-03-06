import com.student.information.management.app.facade.student.StudentFacade;
import com.student.information.management.app.facade.student.impl.StudentFacadeImpl;
import com.student.information.management.app.model.student.Student;

import java.sql.Timestamp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            displayMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    UpdateStudentbyId();
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
    public static void UpdateStudentbyId(){
        Scanner sc = new Scanner(System.in);
        StudentFacade studentFacade = new StudentFacadeImpl();
        System.out.println("searching Id");
        System.out.print("Enter search id: ");
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
        System.out.println("Update lastname");
        uStudents.setLastName(sc.nextLine());
        System.out.println("Update firstname");
        uStudents.setFirstName(sc.nextLine());
        System.out.println("Update middlename");
        uStudents.setMiddleName(sc.nextLine());
        System.out.println("Update sex");
        uStudents.setSex(sc.nextLine());
        System.out.println("Update birthday");
        uStudents.setBirthday(sc.nextLine());
        System.out.println("Update religion");
        uStudents.setReligion(sc.nextLine());
        System.out.println("Update email");
        uStudents.setEmail(sc.nextLine());
        System.out.println("Update address");
        uStudents.setAddress(sc.nextLine());
        System.out.println("Update contactnumber");
        uStudents.setContactNumber(sc.nextLine());

        try{
            studentFacade.updateStudent(uStudents);
        } catch (Exception e){
            System.out.println("Error Updating" + e.getMessage());
            return;
        }
        System.out.println("successfull");

        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Middle Name: ");
        String middleName = sc.nextLine();
        System.out.print("Enter Sex (Male/Female): ");
        String sex = sc.nextLine();
        System.out.print("Enter Birthday (MM/DD/YYYY): ");
        String birthday = sc.nextLine();
        System.out.print("Enter Religion: ");
        String religion = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = sc.nextLine();
    }
}
