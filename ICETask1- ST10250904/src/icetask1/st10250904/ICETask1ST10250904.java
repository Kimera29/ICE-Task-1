/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetask1.st10250904;

import java.util.Scanner;

/**
 *
 * @author Kimera Pillay
 */
public class ICETask1ST10250904 {

    public static Scanner kb = new Scanner(System.in);// Scanner object created 
    public static Bird brd = new Bird();   //object created
    public static Reptile rept = new Reptile();   //object created

    public static void main(String[] args) {
        // TODO code application logic here

        //Variables declared
        int userInput;

        System.out.println("Welcome User :) let's get started...\n");
        System.out.println("Would you like to enter the details for a bird or reptile?\nEnter (1) for bird\nEnter (2) for reptile\nEnter (0) to exit application");
        userInput = kb.nextInt();

        while (userInput != 0) {

            switch (userInput) {

                case 1:
                    System.out.println("\nPlease enter the details for Bird:\n");
                    brd.input();// input method called
                    System.out.println("\nThe Bird's details are:\n");// used 2 \n so that it leaves a line before and after for neatness...
                    brd.output();// output method called
                    break;

                case 2:
                    System.out.println("\nPlease enter the details for Reptile:\n");
                    rept.input();// input method called
                    System.out.println("\nThe Reptile's details:\n");// used 2 \n so that it leaves a line before and after for neatness...
                    rept.output();// output method called
                    break;

            }// end switch case

            System.out.println("\nWould you like to enter the details for a bird or reptile?\nEnter (1) for bird\nEnter (2) for reptile\nEnter (0) to exit application");
            userInput = kb.nextInt();
        }// end while

        if (userInput == 0) {
            System.out.println("Thank you for using this program! Have a lovely day...");
            System.exit(0);//closes program
        }
    }//end main

}
