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
        Scanner inFile = new Scanner(System.in);
        
        //prompt to enter the number of miles traveled. 
        System.out.println("Please enter number of miles driven?:");
        double miles = inFile.nextDouble();
        
        
        //prompt to enter the number of gallons of gas used 
        System.out.println("Enter the number of gallons used:");
        double gallons = inFile.nextDouble();
        
        //calculate miles per gallon
        double mpg = miles / gallons;
        
        //display the miles per gallon to the concole 
        System.out.println("The Miles-Per-Gallon for this trip is "
                            +  mpg );
        
    }
}