//////////////////////////////////////////////////////////////////////////////
//Ryan Kirton
//waves
//This program should be able to take a number between 1 and 30 from the user
//and be able to print out "waves" corresponding to that number. Every even number
//up to the input should create the formation of a wave while every odd number 
//will create the deformation of a wave.
//EXAMPLE (if 4 is entered)
/*  
    1
    2
    22
    333
    33
    3
    4444
*/
//This will be done three times, one each with for loops, while loops and do while
//loops.
//
//

import java.util.Scanner;//create scanner

public class waves{//public class always required
    public static void main(String[] args){//main method always required
        
        Scanner myScanner=new Scanner(System.in);//define and name scanner
        
        System.out.println("Enter an int between 1 and 30: ");//Print the statement
        int mainNumber = myScanner.nextInt();//define "mainNumber" as the user input
        
        System.out.println("FOR LOOP");//Pinr the statement
        
        
        for (int a=1; a<=mainNumber-1; a++){
            for (int b=a; b>0; b--){
                for (int c=1; c<=b; c++){
                    
                    System.out.print(a);
                    
                }
                
                System.out.print("\n");
                
            }
            
            a++;
            
                for (int x=1; x<=a; x++){
                    for (int y=1; y<=x; y++){
                        
                        System.out.print(a);
                        
                    }
                    
                    System.out.print("\n");
                    
                }
                
        }
        
        
        System.out.println("\nWHILE LOOP");//start a new line then print the statement
        
        int a=1;
        while (a<=mainNumber){
            int b=a;
            while (b>0){
                
                int c=1;
                
                while (c<=b){
                    
                    System.out.print(a);
                    
                    c++;
                    
                }
                
                System.out.print("\n");
                b--;
                
            }
            
            a++;
            
            int x=1;
            
            while (x<=a){
                int y=1;
                
                while (y<=x){
                    
                    System.out.print(a);
                    y++;
                    
                }
                
                System.out.print("\n");
                
                x++;
                
            }
            
            a++;
        }
        
        
        System.out.println("\nDO WHILE LOOP");//start a new line then print the statement
        
        int A=1;
        do{
            int b=A;
            do{
                int c=1;
                
                do{
                    System.out.print(A);
                    c++;
                    
                } while (c<=b);
                
                System.out.print("\n");
                b--;
                
            }while (b>0);
            
            A++;
            
            
            int x=1;
            do{
                int y=1;
                do{
                    
                    System.out.print(A);
                    y++;
                    
                } while (y<=x);
                
                System.out.print("\n");
                
                x++;
            }while (x<=A);
            
            A++;
            
        } while (A<=mainNumber);
        
        
        
    }
}