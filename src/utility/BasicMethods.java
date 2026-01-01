package utility;

import java.util.Scanner;

public class BasicMethods {

    private static int studentId = 0;
    private static int courseId = 0;
    private static int enrollmentId = 0;
    public void displayWelcomeMessage(){
        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("======Welcome to the LMS=====");
        System.out.println("=============================");
        System.out.println("=============================");
    }

    public void closeScannerConnection(Scanner sc){
      sc.close();
    }

    public static int getNextStudentId() {
        return ++studentId;
    }
    public static int getNextCourseId() {
        return ++courseId;
    }

    public static int getNextEnrollmentId() {
        return ++enrollmentId;
    }

    public static void subOperationTypesStudentsOptions(){
        System.out.println("Pls press 0 for going to previous selection types");
        System.out.println("1 for Adding New Student");
        System.out.println("2 for Viewing Students");
        System.out.println("3 for Search of a Student");
        System.out.println("4 for De-Activating the Student");
    }

    public static void subOperationTypesCourseOptions(){
        System.out.println("Pls press 0 for going to previous selection types");
        System.out.println("1 for Adding New Course");
        System.out.println("2 for Viewing Courses");
        System.out.println("3 for Active and De-Active a Course");
    }

  public static void subOperationTypesEnrollmentOptions(){
      System.out.println("Pls press 0 for going to previous selection types");
      System.out.println("1 for Enrolling a student in a course");
      System.out.println("2 for View all enrollments for Students");
      System.out.println("3 for Mark Enrollement as Completed / Cancelled");
    }

    public void operationType(){
        System.out.println("0 for Closing the LMS ... !!!!");
        System.out.println("1 for Student Management");
        System.out.println("2 for Course Management");
        System.out.println("3 for Enrollement Management");
    }


}
