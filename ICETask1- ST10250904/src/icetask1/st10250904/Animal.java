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
public class Animal {

    public static Scanner kb = new Scanner(System.in); //Global scanner object created

    //Variables declared
    int IDtag;
    String species;

    /*
    Base class Animal with two fields, IDtag and species. 
    Two methods, input() and output(), for getting input from the user 
    Then ouputs the details entered by the user
     */
    public void input() {

        System.out.print("Enter IDtag: ");

        //While loop will execute until a correct input is entered by the user if an in-correct input was entered...
        while (!kb.hasNextInt()) {  //loops executes if an integer was not entered...

            System.out.println("Error - you have entered an in-valid IDtag...Please enter a valid IDtag only consisting of numbers....\n");
            System.out.print("Enter IDtag: ");
            kb.next(); // clears the invalid input...

        }//end while

        IDtag = kb.nextInt();

        System.out.print("Enter species: ");
        species = kb.next();

    }// end method input

    public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }//end method output (Display method)   

}// end animal class (base class)


/*
Class Bird that inherits from the Animal class. 
Adds another field to overrides the input() and output() methods above
Did this so can have input/output for the colour field...
 */
class Bird extends Animal {

    private int colour;

    @Override
    public void input() {
        super.input();

        System.out.print("Enter the feather colour: \nEnter (1) for grey \nEnter (2) for white \nEnter (3) for black ");

        //  While loop will execute until a correct input is entered by the user if an in-correct input was entered...
        while (!kb.hasNextInt()) { // While loop executes if an in-valid entry (not an integer) was made by the user

            System.out.println("\nError - you have entered an in-valid option for color...\n");
            System.out.print("Please re-enter the feather colour: \nEnter (1) for grey \nEnter (2) for white \nEnter (3) for black ");
            kb.next(); // clears the invalid input...

        }// end while loop

        colour = kb.nextInt();
    }

    @Override
    public void output() {

        String birdColor = ""; // variable initialized
        super.output();

        switch (colour) {
            case 1:
                birdColor = "grey";
                break;
            case 2:
                birdColor = "white";
                break;
            case 3:
                birdColor = "black";
                break;
        }// end switch

        System.out.println("Feather Colour: " + birdColor);
    }
} // end bird class

/*
Class reptile that inherits from the Animal class. 
Adds another field to overrides the input() and output() methods above
Did this so can have input/output for the blood temperature field...
 */
class Reptile extends Animal {

    private double bloodTemp;

    @Override
    public void input() {
        super.input();
        System.out.print("Enter blood temperature: ");

        //  While loop will execute until a correct input is entered by the user if an in-correct input was entered...
        while (!kb.hasNextInt()) { //while loop executes if the user has entered an in-valid entry... it will ask the user for a valid entry

            System.out.println("\nError - you have entered an in-valid blood temperature...Please re-enter a valid blood temperature...\n");
            System.out.print("Enter blood temperature: ");
            kb.next(); // clears the invalid input...

        }// end while loop

        bloodTemp = kb.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }

}//end reptile method
