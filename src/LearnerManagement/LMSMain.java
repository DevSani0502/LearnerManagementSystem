package LearnerManagement;

import utility.BasicMethods;

import java.util.Scanner;

public class LMSMain {
    public static void main(String[] args) {

        BasicMethods bms = new BasicMethods();
        Scanner sc = new Scanner(System.in);
        LMSRouter lmsRout = new LMSRouter(sc);

        bms.displayWelcomeMessage();
        System.out.println("Pls Enter your operation type:");
        bms.operationType();

        boolean exit = false;

        while (!exit) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Under Student Section we have other operation as well pls processed for them as well");
                    lmsRout.subOperationTypesStudents();
                    bms.operationType();
                    break;

                case 2:
                    System.out.println("Under Course Section we have other operation as well pls processed for them as well");
                    lmsRout.subOperationTypesCourse();
                    bms.operationType();
                    break;

                case 3:
                    System.out.println("Under Enrollement Section we have other operation as well pls processed for them as well");
                    lmsRout.subOperationTypesEnrollement();
                    bms.operationType();
                    break;

                case 0:
                    exit = true;
                    System.out.println("Thank you for using LMS!");
                    bms.closeScannerConnection(sc);
                    break;

                default:
                    System.out.println("Invalid choice");
                    bms.operationType();
            }
        }
    }

}