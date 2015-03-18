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
        
        if (mainNumber>=1 && mainNumber<=30){}//check for valid number
        else{//if not valid
            System.out.println("Ivalid int");//print the statement
            return;//close the program
        }
        
        System.out.println("FOR LOOP");//Pinr the statement
        
        
        for (int a=1; a<=mainNumber; a++){//initialize first for loop
            for (int b=a; b>0; b--){//create second for loop
                for (int c=1; c<=b; c++){//create third for loop

                    System.out.print(a);//print "a"
                    
                }
                
                System.out.print("\n");//go to the next line after the previous loop finishes
                
            }
            
            a++;//add one to "a" after the previous loop completes
            
                for (int x=1; x<=a; x++){//create another loop 
                    for (int y=1; y<=x; y++){//create one last loop
                        
                        System.out.print(a);//print "a"
                        
                    }
                    
                    System.out.print("\n");//go to the next line after the previous loop
                    
                }
                
        }
        
        
        System.out.println("\nWHILE LOOP");//start a new line then print the statement
        
        int a=1;//initialize int a as equal to 1
        while (a<=mainNumber){//create while loop
            int b=a;//initialize int b=a
            while (b>0){//start another while loop
                
                int c=1;//initialize c=1
                
                while (c<=b){//create another while loop
                    
                    System.out.print(a);//print a
                    
                    c++;//add one to c
                    
                }
                
                System.out.print("\n");//skip a line after the previous loop finishes
                b--;//subtract one from b after the previous loop finishes
                
            }
            
            a++;//add one to a after the previous loop finishes
            
            int x=1;//initialize x=1
            
            while (x<=a){//create a while loop
                int y=1;//initialize y=1
                
                while (y<=x){//create another while loop
                    
                    System.out.print(a);//print a
                    y++;//add one to y after the previous loop finishes
                    
                }
                
                System.out.print("\n");//skip to the next liine after the previous loop finishes
                
                x++;//add one to x after the previous loop finishes
                
            }
            
            a++;//add one to a after the previous loop finishes
        }
        
        
        System.out.println("\nDO WHILE LOOP");//start a new line then print the statement
        
        int A=1;//initialize int A=1
        do{//start do while loop
            int b=A;//initialize b+a
            do{//start another do while loop
                int c=1;//initialize c=1
                
                do{//start another do while loop
                    System.out.print(A);//print A
                    c++;//add one to c
                    
                } while (c<=b);//close do while loop
                
                System.out.print("\n");//skip to the next line after the previous loop finishes
                b--;//subtract one from b after the previous loop finishes
                
            }while (b>0);//end do while loop
            
            A++;//add one to A after the previous loop finishes
            
            
            int x=1;//initialize int x
            do{//start another do while loop
                int y=1;//initialize int y
                do{//start a do while loop
                    
                    System.out.print(A);//print A
                    y++;//add one to y
                    
                } while (y<=x);//close do while loop
                
                System.out.print("\n");//go to the next line after the previous loop finishes
                
                x++;//add one to x after the previous loop finishes
            }while (x<=A);//close do while loop
            
            A++;//add one to A after the previous loop finishes
            
        } while (A<=mainNumber);//close do while loop
        
        
        
    }
}