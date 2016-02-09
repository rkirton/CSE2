/////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab06
//SmileGenerator

import java.util.Random;

public class SmileGenerator{
    public static void main(String[] args){
        Random rand = new Random();
        
        for (int counter=1; counter<=5; counter++){
            if (counter<5){
                System.out.print(":)");
            }//if
            else{
                System.out.println(":)");   
            }//else
       
        }//for
       
        System.out.print("\n");
   
   	    int smilesNum=(int)(rand.nextDouble()*99+1); // 1-99 random number
   	    for (int num=1; num<=smilesNum; num++){
   	        if (num%30==0){
   	            System.out.println(":)");
   	        }
   	        else{
   	            System.out.print(":)");
   	        }
   		}
   	    
   	    System.out.print("\n\n");
   	    
   	    int row=1;
   	    int inc=0;
   	    for (int increasing=1; increasing<smilesNum; increasing++){
   	        if (increasing==row){
   	            System.out.println(":)");
   	        
   	            inc+=1;
   	            row=row+inc;
   	        }
   	        else{
   	            System.out.print(":)");
   	       
   	        }
   	    }
        
        System.out.print("\n\n");
    }
}