/*
 * This program  will ask user to enter miles drivien and gallons used. Then will calculate the average miles per gallon.
 */
import java.util.Scanner;

public class MilesPerGallon {
    /**
     * The program starts in the main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //print out the welcome message
        System.out.println();
        System.out.println("This program tells you your average miles per gallon for this driving period");
        
        //create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);
        
        //prompt to enter the number of miles traveled. 
        System.out.println("\nPlease enter number of miles driven?:");
        int miles;
        //read the value of the next line typed in the console
        miles = inFile.nextInt();
        
        //prompt to enter the number of gallons of gas used 
        System.out.println("\nEnter the number of gallons used:");
        int gallons;
        //get the value entered for the number of gallons
        gallons = inFile.nextInt();
        
        //calculate miles per gallon
        int mpg;
        mpg = miles / gallons;
        
        //display the miles per gallon to the concole
        System.out.println("\n******************************************"
                           + "*************************");
        
        System.out.println(" The Miles-Per-Gallon used in this trip are "
                            +  mpg );
        
        System.out.println("*********************************************"
                          + "*************************\n");
        
    }
}