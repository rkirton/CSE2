//////////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab10
//ArrayInputs

import java.util.Scanner;
public class ArrayInputs{
    
	public static void main(String[] args) {
	    Scanner myScanner = new Scanner( System.in );
        int size=1;
        System.out.print("Please enter an integer for the size of the aray: ");
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                size = myScanner.nextInt();//user input
                if (size<1){
                    System.out.print("invalid input, enter new input: ");
                    continue;
                }
                else{
                    i=-4;
                    break;
                }
            }
            else{
                System.out.print("invalid input, enter new input: ");
                continue;
            }
   	    }
   	    System.out.println("Enter Integers: ");
        int[] array = new int[size];
        
        for(int i = 0; i < size; i++){
            int a=1;
	        for (int j=1; j>0; j++){
                if (myScanner.hasNextInt()){//test if it is an int
                    a=myScanner.nextInt();
        
                    if (a<1){
                        System.out.print("invalid input, enter new input: ");
                        continue;
                    }
                    else{
                        j=-4;
                    }
                }
                else{
                    System.out.print("invalid input, enter new input: ");
                    continue;
                }
                array[i] = a;//user input
       
	        }
        }
        System.out.print("The array is: ");
       
   	    for(int i=0; i<size; i++){
   	        System.out.print(array[i]+" ");
   	       
   	       
   	    }
   	    System.out.print("\n");
   	    
   	    
   	    
	    
	}
}