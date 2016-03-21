//////////////////////////////////////////////
//Ryan Kirton
//hw07
//Triangles
//
//This program should be able to take an input from the user
//within the range of 5 to 30 and print out a pattern based on
//that value.  It should do this 3 times, each using a different kind
//of loop.
//

import java.util.Scanner;//create scanner

public class Triangles{//create public class
    public static void main(String[] args){//create main method
        
        Scanner myScanner = new Scanner(System.in);//define and name scanner
        
        System.out.println("Enter an integer between 5 and 30");//prompt user for input
        
        boolean badInput1 = true;
        int goodA = 0;
        //this while loop checks for good input
        while(badInput1){
            if(myScanner.hasNextInt()){
                goodA = myScanner.nextInt();
                if(goodA<1){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else if(goodA<5 || goodA>30){
                    System.out.println("Please enter an int within the range.");
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
        
        int num = goodA;
        int setNum = num;
        //prints using for loop(top half)
        System.out.println("FOR LOOP: ");
        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        for(int i=num-1;i>0;i--){//(bottom half)
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("WHILE LOOP");
        int x = 1;
        int y = 0;
        while(x<=num){//prints using while loop(top half)
            y = 0;
            while(y<x){
                System.out.print(x);
                y++;
            }
            System.out.println("");
            x++;
        }
        x=num-1;
        while(x>0){//(bottom half)
            y=0;
            while(y<x){
                System.out.print(x);
                y++;
            }
            System.out.println("");
            x--;
        }
        System.out.println("");
        
        System.out.println("DO WHILE");
        x=1;
        y=0;
        do{//prints using do while loops(top half)
            do{
                System.out.print(x);
                y++;
            }while(y<x);
            y=0;
            System.out.println("");
            x++;
        }while(x<=num);
        x=num-1;
        y=0;
        do{//(bottom half)
            do{
                System.out.print(x);
                y++;
            }while(y<x);
            y=0;
            System.out.println("");
            x--;
        }while(x>0);
        
        
    }
}