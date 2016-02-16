//////////////////////////////////////////////////////
//Ryan Kirton
//hw03
//Pyramid
//
//This  program should be able to take the square side of a
//pyramid and its height and output the volume.

//create scanner
import java.util.Scanner;
//create class Pyramid
public class Pyramid{
    public static void main (String[] args){//create main method
        
        //name scanner
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //prompt user for square side value
        System.out.println("The square side of the pyramid is: ");
        int base = myScanner.nextInt();//take user input as "base"
        
        //prompt user for height value
        System.out.println("The height of the pyramid is: ");
        int height = myScanner.nextInt();//take user input as "height"
        
        //calculate volume
        int volume = (base*base*height)/3;
        
        //print volume
        System.out.println("The volume inside the pyramid is: "+(volume)+"");
        
        
        
        
    }
}