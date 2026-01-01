package serviceImpl;

import models.StudentDTO;
import service.StudentService;
import utility.BasicMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class StudentServiceImpl implements StudentService {
    private static List<StudentDTO> students = new ArrayList<>();

    @Override
    public void addNewStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Batch: ");
        String batch = sc.nextLine();

        int id = BasicMethods.getNextStudentId();
        String studentId = "STU-" + id;

        StudentDTO student = new StudentDTO(studentId,firstName,
                lastName,email,batch,true );

        students.add(student);

        //  sc.close();
    }
    @Override
    public void viewAllStudent() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("----- Student List -----");
        for (StudentDTO student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Batch: " + student.getBatch());
            System.out.println("Active: " + student.isActive());
            System.out.println("------------------------");
        }
    }

    @Override
    public void getStudentById() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (StudentDTO student : students) {
            if (student.getId().equalsIgnoreCase(searchId)) {
                System.out.println("----- Student Details -----");
                System.out.println("ID: " + student.getId());
                System.out.println("First Name: " + student.getFirstName());
                System.out.println("Last Name: " + student.getLastName());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Batch: " + student.getBatch());
                System.out.println("Active: " + student.isActive());
                System.out.println("---------------------------");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }

    @Override
    public void deactivateStudentById() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to deactivate: ");
        String searchId = sc.nextLine();

        boolean found = false;

        for (StudentDTO student : students) {
            if (student.getId().equalsIgnoreCase(searchId)) {
                if (!student.isActive()) {
                    System.out.println("Student is already deactivated.");
                } else {
                    student.setActive(false);
                    System.out.println("Student successfully deactivated.");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }
}
