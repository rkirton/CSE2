///////////////////////////////////////////////////////done
//Ryan Kirton
//lab11
//
//This program creates 2 random arrays, and prints out each
//min and max.  Then it takes input from the user, searches 
//for it, and tells whether it was found and what number was
//above and below
//

import java.util.Scanner;//create scanner

public class search{//public class
    public static void main(String[] args){//main method
        
        Scanner myScanner = new Scanner(System.in);//define scanner
        
        
        int array1[] = new int [50];//create 2 arrays
        int array2[] = new int[50];
        
        for(int i=0;i<50;i++){//fill array 1
            array1[i] = (int)(Math.random()*101);
        }
        
        int rand = (int)(Math.random()*101);
        int rand1;
        for(int i=0;i<50;i++){//fill array 2
            array2[i] = rand;
            rand1 = (int)(Math.random()*101);
            rand = rand + rand1;
            
        }
        //create ints for min and max
        int min1 = array1[0];
        int max1 = array1[0];
        int min2 = array2[0];
        int max2 = array2[49];
        
        for(int i=1;i<50;i++){//find min and max
            if(array1[i]<min1){
                min1 = array1[i];
            }
            if(array1[i]>max1){
                max1 = array1[i];
            }
        }
        System.out.println("The max of array1 is: "+(max1)+"");//print mins and maxes
        System.out.println("The min of array1 is: "+(min1)+"");
        System.out.println("The max of array2 is: "+(max2)+"");
        System.out.println("The min of array2 is: "+(min2)+"");
        
        //searching for int
        System.out.println("Enter an int to be searched for: ");
        boolean badInput2 = true;
        int goodB = 0;
        //this while loop checks for good input
        while(badInput2){
            if(myScanner.hasNextInt()){
                goodB = myScanner.nextInt();
                if(goodB<0){
                    System.out.println("Please enter a positive int.");
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
        
        int upper = 49;
        int lower = 0;
        int marker = 25;
        boolean binBool = true;
        //this loop uses binary search and counts iterations
        while(binBool){
            if(array2[marker]>binSearch){
                 upper = marker-1;
            }
            if(array2[marker]<binSearch){
                lower = marker+1;
            }
            marker = (lower+upper)/2;
            if(array2[marker]==binSearch){
                System.out.println("It was found");
                binBool = false;
            }
            if(upper<lower){
                System.out.println("It was not found");//print above+below
                System.out.println("The number above was "+(array2[marker+1])+"");
                System.out.println("The number below was "+(array2[marker])+"");
                binBool = false;
            }
        }
        
        
        
        
        
        
    }
}