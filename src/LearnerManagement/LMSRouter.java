package LearnerManagement;

import utility.BasicMethods;

import java.util.Scanner;

public class LMSRouter {

    public void subOperationTypesStudents(){
        System.out.println("Pls Enter your sub-operation type:");
        System.out.println("1 for Adding New Student");
        System.out.println("2 for Viewing Students");
        System.out.println("3 for Search of a Student");
        System.out.println("4 for De-Activating the Student");
        Scanner sc = new Scanner(System.in);
        BasicMethods bms = new BasicMethods();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Under Student Section we have other sub-operation as well pls processed for them as well");

                break;

            case 2:
                System.out.println("Under Student Section we have other sub-operation as well pls processed for them as well");

                break;

            case 3:
                System.out.println("Under Student Section we have other sub-operation as well pls processed for them as well");

                break;

            case 4:
                System.out.println("Under Student Section we have other sub-operation as well pls processed for them as well");

                break;

            default:
                System.out.println("Invalid choice");
        }
        bms.closeScannerConnection(sc);
    }

    public void subOperationTypesCourse(){
        System.out.println("Pls Enter your sub-operation type:");
        System.out.println("1 for Adding New Course");
        System.out.println("2 for Viewing Courses");
        System.out.println("3 for Active and De-Active a Course");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Under Course Section we have other sub-operation as well pls processed for them as well");
            //    lmsRout.subOperationTypesStudents();
                break;

            case 2:
                System.out.println("Under Course Section we have other sub-operation as well pls processed for them as well");
           //     lmsRout.subOperationTypesCourse();
                break;

            case 3:
                System.out.println("Under Course Section we have other sub-operation as well pls processed for them as well");
            //    lmsRout.subOperationTypesEnrollement();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    public void subOperationTypesEnrollement(){
        System.out.println("Pls Enter your sub-operation type:");
        System.out.println("1 for Enrolling a student in a course");
        System.out.println("2 for View all enrollments for Students");
        System.out.println("3 for Mark Enrollement as Completed / Cancelled");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Under Enrollement Section we have other sub-operation as well pls processed for them as well");
             //   lmsRout.subOperationTypesStudents();
                break;

            case 2:
                System.out.println("Under Enrollement Section we have other sub-operation as well pls processed for them as well");
             //   lmsRout.subOperationTypesCourse();
                break;

            case 3:
                System.out.println("Under Enrollement Section we have other sub-operation as well pls processed for them as well");
              //  lmsRout.subOperationTypesEnrollement();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

}
