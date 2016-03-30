////////////////////////////////////////////////////
//Ryan Kirton
//lab07
//Bowtie

import java.util.Scanner;

public class Bowtie{
    public static void main (String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        
        System.out.println("Input your desired length:");//print statement
        
        
        boolean badInput1 = true;
        int goodA = 0;
        //this while loop checks for good input
        while(badInput1){
            if(myScanner.hasNextInt()){
                goodA = myScanner.nextInt();
                if(goodA%2<1){
                    System.out.println("Please enter an odd number.");
                    myScanner.nextLine();
                }
                else if(goodA>33 || goodA<3){
                    System.out.println("Please enter an int between 3 and 33.");
                    myScanner.nextLine();
                }
                else{
                    badInput1 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        int nStars = goodA;
        
        
        for(int i=0;i<nStars-1;i++){
            
            for(int j=0;j<nStars-(2*i);j++){
                
                
                System.out.print("*");
                
            }
            System.out.println("");
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
/*        for(int i=0; i<nStars; i++){
            if(i<5){
                for(int j=0; j<(nStars-(2*i)); j++){
                    System.out.print("*");
                }
            }
            else if(i>=5){
                for(int j=0; j<)
            }
            System.out.println("");
            
        }
        
        System.out.println("");
*/        
        
        
    }
}