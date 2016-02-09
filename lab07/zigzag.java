/////////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab07
//zigzag
//

import java.util.Scanner;//create scanner
    public class zigzag{//create public class
    	// main method required for every Java program
        public static void main(String[] args) {

        Scanner myScanner = new Scanner( System.in );//define and name scanner
 
   
        int nStars=0;//create int
 
        String answer="";//create string
        do{//start do while loop
            System.out.print("Enter an integer between 3 and 33: "); //will convert to hex
            while(myScanner.hasNextInt()){
                nStars = myScanner.nextInt();//accept user input 1
      	            while(nStars<3 || nStars>33){
   	                    System.out.println("please enter valid input: ");
   	                    nStars = myScanner.nextInt();//accept user input 1
   	                }		 //inner while
                break;
            }//outer while
            while (nStars==0){//start while loop
                System.out.println("please enter valid input: ");
   	            int integer = myScanner.nextInt();//accept user input 1
   	            nStars=integer;
   	            break;
            }//end while loop

            int space=0;//create int
            int max=0;//create int
            for (int counter=nStars; counter>=0; counter--){//start for loop
                System.out.print("*");
            }//end for loop
            for (int counter=nStars; counter>=0; counter--){//start for loop
                for(space=0; space<max; space++){//start another for loop
                    System.out.print(" ");
                }//end inner for loop
                System.out.println("*");
                max++;
            }//end outer for loop
            for (int counter=nStars; counter>=0; counter--){//start for loop
                System.out.print("*");
            }//end for loop
   			
   		    System.out.println("would you like the code to run again? (Y,y)");//print the statemnt
   		    answer= myScanner.next();
        }while(answer.equals("y") || answer.equals("Y"));//end do while loop
   			 
   			 
   			 
   			
    }//end main method
}//end public class