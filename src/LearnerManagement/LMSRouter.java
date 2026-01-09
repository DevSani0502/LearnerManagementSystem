package LearnerManagement;

import service.StudentService;
import service.CourseService;
import service.EnrollmentService;
import serviceImpl.StudentServiceImpl;
import serviceImpl.CourseServiceImpl;
import serviceImpl.EnrollmentServiceImpl;
import utility.BasicMethods;

import java.util.Scanner;

public class LMSRouter {

    private final Scanner sc;

    StudentService student = new StudentServiceImpl();
    CourseService course = new CourseServiceImpl();
    EnrollmentService enrollment = new EnrollmentServiceImpl();
 //   BasicMethods bms = new BasicMethods();

    // Scanner comes from LMSMain
    public LMSRouter(Scanner sc) {
        this.sc = sc;
    }

    public void subOperationTypesStudents() {
        System.out.println("Pls Enter your sub-operation type:");
        BasicMethods.subOperationTypesStudentsOptions();
        boolean exit = false;

        while (!exit) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.addNewStudent();
                    System.out.println("Student added successfully! Returning to menu...");
                    BasicMethods.subOperationTypesStudentsOptions();
                    break;
                case 2:
                    student.viewAllStudent();
                    BasicMethods.subOperationTypesStudentsOptions();
                    break;
                case 3:
                    student.getStudentById();
                    BasicMethods.subOperationTypesStudentsOptions();
                    break;
                case 4:
                    student.deactivateStudentById();
                    BasicMethods.subOperationTypesStudentsOptions();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Thank you for using LMS...! Sry, but pls try completing the process ");
                //    bms.closeScannerConnection(sc);
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("Pls Enter your sub-operation type:");
                    BasicMethods.subOperationTypesStudentsOptions();
            }
        }
    }

    public void subOperationTypesCourse() {
        BasicMethods.subOperationTypesCourseOptions();
        boolean exit = false;

        while (!exit) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    course.addNewCourse();
                    System.out.println("Course added successfully ..!");
                    BasicMethods.subOperationTypesCourseOptions();
                    break;
                case 2:
                    course.viewAllCourse();
                    BasicMethods.subOperationTypesCourseOptions();
                    break;
                case 3:
                    course.actionOnCourseById();
                    BasicMethods.subOperationTypesCourseOptions();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Thank you for using LMS...! Sry, but pls try completing the process ");
                //    bms.closeScannerConnection(sc);
                    break;
                default:
                    System.out.println("Invalid choice");
                    BasicMethods.subOperationTypesCourseOptions();
            }
        }
    }

    public void subOperationTypesEnrollement() {
    BasicMethods.subOperationTypesEnrollmentOptions();
        boolean exit = false;

        while (!exit) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enrollment.enrollStudent();
                    BasicMethods.subOperationTypesEnrollmentOptions();
                    break;
                case 2:
                    enrollment.viewAllEnrolledStudent();
                    BasicMethods.subOperationTypesEnrollmentOptions();
                    break;
                case 3:
                    enrollment.markEnrollmentById();
                    BasicMethods.subOperationTypesEnrollmentOptions();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Thank you for using LMS...! Sry, but pls try completing the process ");
                //    bms.closeScannerConnection(sc);
                    break;
                default:
                    System.out.println("Invalid choice");
                    BasicMethods.subOperationTypesEnrollmentOptions();
            }
        }
    }
}
