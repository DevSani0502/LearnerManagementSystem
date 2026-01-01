package serviceImpl;

import models.EnrollmentDTO;
import service.EnrollmentService;
import utility.BasicMethods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnrollmentServiceImpl implements EnrollmentService {
    private static List<EnrollmentDTO> enrollments = new ArrayList<>();
    @Override
    public void enrollStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID to enroll: ");
        String studentId = sc.nextLine();

        System.out.print("Enter Course ID to enroll in: ");
        String courseId = sc.nextLine();

        int enrollmentId = BasicMethods.getNextEnrollmentId();
        String date = LocalDate.now().toString(); // enrollment date as today
        String status = "Enrolled";

        EnrollmentDTO enrollment = new EnrollmentDTO(String.valueOf(enrollmentId), studentId, courseId, date, status);
        enrollments.add(enrollment);

        System.out.println("Student enrolled successfully! Enrollment ID: " + enrollmentId);
    }

    @Override
    public void viewAllEnrolledStudent() {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        System.out.println("----- All Enrollments -----");
        for (EnrollmentDTO e : enrollments) {
            System.out.println("Enrollment ID: " + e.getId());
            System.out.println("Student ID: " + e.getStudentId());
            System.out.println("Course ID: " + e.getCourseId());
            System.out.println("Enrollment Date: " + e.getEnrollmentDate());
            System.out.println("Status: " + e.getStatus());
            System.out.println("---------------------------");
        }
    }

    @Override
    public void markEnrollmentById() {
        Scanner sc = new Scanner(System.in);

        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        System.out.print("Enter Enrollment ID to update status: ");
        String searchId = sc.nextLine();

        boolean found = false;
        for (EnrollmentDTO e : enrollments) {
            if (e.getId().equalsIgnoreCase(searchId)) {
                System.out.println("Current Status: " + e.getStatus());
                System.out.print("Enter new status (e.g., Completed, Dropped): ");
                String newStatus = sc.nextLine();
                e.setStatus(newStatus);
                System.out.println("Enrollment status updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Enrollment with ID " + searchId + " not found.");
        }
    }
}
