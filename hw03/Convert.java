//////////////////////////////////////////////////////
//Ryan Kirton
//hw03
//Convert
//
//This program will be able to take an amount of meters
//and convert it to inches.


//create scanner
import java.util.Scanner;
//create class
public class Convert{
    public static void main(String[] args){//create main method
        //name scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //print line
        System.out.println("Enter the distance in meters: ");
        double meters = myScanner.nextDouble();//take in input
        
        double inches = meters*39.3701;//convert input to inches
        
        inches = (int)(inches*10000)/10000.0;//limit decimal points
        
        //print out the conversion
        System.out.println(""+(meters)+" meters is "+(inches)+" inches.");
        
        
        
        
        
    }
}