///////////////////////////////////////////////////////
//Ryan Kirton
//hw12
//CSE2Linear
//
//This program takes 15 user inputs and puts them into an
//array.  It then does a binary search, scrambles the array,
//then does a linear search.
//

import java.util.Scanner;

public class CSE2Linear{
    public static void main(String[] args){
        //create scanner
        Scanner myScanner = new Scanner(System.in);
        //print
        System.out.println("Enter the 15 scores in acsending order:");
        //initialize variable
        int count = 0;
        int running = 0;
        boolean badInput1 = true;
        int array1[] = new int [15];
        int goodA = 0;
        //this while loop checks for good input
        while(count<15){
        //test input for validity
        while(badInput1){
            if(myScanner.hasNextInt()){
                goodA = myScanner.nextInt();
                if(goodA<0 || goodA>100){
                    System.out.println("Not within range. Try again.");
                    myScanner.nextLine();
                }
                else if(goodA<running){
                    System.out.println("Smaller than the last number.  Try again.");
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
        badInput1 = true;
        running = goodA;
        array1[count] = goodA;
        
        count++;
        }
        
        System.out.println("Your array is:");
        //print the array
        for(int i=0; i<15; i++){
            System.out.print(""+(array1[i])+" ");
        }
        System.out.println("");
        System.out.println("Enter a grade to be searched for: ");
        
        boolean badInput2 = true;
        int goodB = 0;
        //this while loop checks for good input
        while(badInput2){
            if(myScanner.hasNextInt()){
                goodB = myScanner.nextInt();
                if(goodB<0 || goodB>100){
                    System.out.println("Please enter an int within the range.");
                    myScanner.nextLine();
                }
                else{
                    badInput2 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        //initialize variables
        int binSearch = goodB;
        int binCount = 0;
        int upper = 14;
        int lower = 0;
        int marker = 7;
        boolean binBool = true;
        //this loop uses binary search and counts iterations
        while(binBool){
            binCount = binCount+1;
            if(array1[marker]>binSearch){
                 upper = marker-1;
            }
            if(array1[marker]<binSearch){
                lower = marker+1;
            }
            marker = (lower+upper)/2;
            if(array1[marker]==binSearch){
                System.out.println("It was found with "+(binCount)+" iterations");
                binBool = false;
            }
            if(upper<lower){
                System.out.println("It was not found with "+(binCount)+" iterations");
                binBool = false;
            }
        }
        
        
        System.out.println("Scrambled: ");
        //this for loop scrambles the array
        for(int i=0; i<15; i++){
            int rand = (int)(Math.random()*15);
            int hold = array1[i];
            array1[i] = array1[rand];
            array1[rand] = hold;
            
        }
        //this for loop prints the array
        for(int i=0; i<15; i++){
            System.out.print(array1[i]);
            System.out.print(" ");
        }
        System.out.println("");
        
        
        System.out.println("Enter a grade to be searched for: ");
        
        boolean badInput3 = true;
        int goodC = 0;
        //this while loop checks for good input
        while(badInput3){
            if(myScanner.hasNextInt()){
                goodB = myScanner.nextInt();
                if(goodB<0 || goodB>100){
                    System.out.println("Please enter an int within the range.");
                    myScanner.nextLine();
                }
                else{
                    badInput3 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        int linSearch = goodC;
        int linCount = 0;
        
        //this loop does a linear search
        for(int i=0; i<15; i++){
            linCount = linCount + 1;
            if(array1[i] == linSearch){
                System.out.println("It was found with "+(linCount)+" iterations");
            }
            else if(i==14){
                System.out.println("It wasn't found with "+(linCount)+" iterations");
            }
        }
        
        
        
    }
}