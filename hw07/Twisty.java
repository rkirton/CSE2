/////////////////////////////////////////////////////
//Ryan Kirton
//hw07
//Twisty
//
//This program should be able to take two ints from the user
//and print a pattern using those values as a length and width.
//

import java.util.Scanner;//create scanner

public class Twisty{//create public class
    public static void main(String[] args){//create main method
        
        Scanner myScanner = new Scanner(System.in);//define and name scanner
        
        System.out.println("Input your desired length:");//print statement
        
        
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
                else if(goodA>80){
                    System.out.println("Please enter an int less than 80.");
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
        
        int length = goodA;
        
        System.out.println("Input your desired width: ");
        boolean badInput2 = true;
        int goodB = 0;
        //this while loop checks for good input
        while(badInput2){
            if(myScanner.hasNextInt()){
                goodB = myScanner.nextInt();
                if(goodB<1){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else if(goodB>=length){
                    System.out.println("Please input an integer smaller than the length.");
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
        
        //set some variables to be used in the following loops
        int width = goodB;
        int lengthset = length;
        int runningHeight = 0;
        
        //this for loop prints the top half of the design
        for(int height=0;height<(width/2);height++){
            length = lengthset;//reset the length value
            int space = width - (height*2) - 2;
            while(length>0){//this while loop prints each line
                if(length>0){
                    for(int i=0;i<height;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("#");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<space;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("/");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<(2*height);i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("\\");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<space;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("#");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<height;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                
            }
            System.out.println("");
            runningHeight++;
        }
        
        if(width%2>0){//if width is odd, an additional line is needed
            length=lengthset;
            while(length>0){//this while loop prints the additional line
                if(length>0){
                    for(int i=0;i<width/2;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("#");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<2*(width/2);i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("\\");
                    length--;
                }
                if(length>0){
                    for(int i=0; i<width/2;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                
            }
            System.out.println("");
            runningHeight++;
            
        }
        
        
        //this for loop prints the bottom half of the pattern
        for(int height=(runningHeight);height<width;height++){
            length = lengthset;//reset length value
            int space = 0;
            if(width%2>0){//spacing for this part is different for odd/even widths
                space = 2*(height-((width/2)+1))+1;
            }
            else{
                space = 2*(height-width/2);
            }
            while(length>0){//this while loop prints each line
                if(length>0){
                    for(int i=0;i<(width-height)-1;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("/");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<space;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("#");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<(2*(width-height-1));i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("#");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<space;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                if(length>0){
                    System.out.print("\\");
                    length--;
                }
                if(length>0){
                    for(int i=0;i<(width-height)-1;i++){
                        System.out.print(" ");
                        length--;
                    }
                }
                
            }
            System.out.println("");
        }
        
        
        
    }
}