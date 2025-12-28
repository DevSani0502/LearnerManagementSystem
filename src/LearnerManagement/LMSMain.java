package LearnerManagement;

import utility.BasicMethods;

import java.util.Scanner;

public class LMSMain {
    public static void main(String[] args) {
        LMSRouter lmsRout = new LMSRouter();
        BasicMethods bms = new BasicMethods();

        Scanner sc = new Scanner(System.in);
        bms.displayWelcomeMessage();
        System.out.println("Pls Enter your operation type:");
        System.out.println("1 for Student Management");
        System.out.println("2 for Course Management");
        System.out.println("3 for Enrollement Management");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Under Student Section we have other operation as well pls processed for them as well");
                lmsRout.subOperationTypesStudents();
                break;

            case 2:
                System.out.println("Under Course Section we have other operation as well pls processed for them as well");
                lmsRout.subOperationTypesCourse();
                break;

            case 3:
                System.out.println("Under Enrollement Section we have other operation as well pls processed for them as well");
                lmsRout.subOperationTypesEnrollement();
                break;

            default:
                System.out.println("Invalid choice");
        }


        bms.closeScannerConnection(sc);
    }


}