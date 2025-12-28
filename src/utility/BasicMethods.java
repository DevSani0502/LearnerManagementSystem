package utility;

import java.util.Scanner;

public class BasicMethods {
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

    public static int getIncrementedId(int id){
        return ++id;
    }
}
