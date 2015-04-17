////////////////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw11
//CSE2Linear
//
//This program should be able to take 15 numbers from the user, sort them,
//find a given number, scramble them, then find another number.
//
//

import java.util.Scanner;//create scanner
import java.util.Random;//create random generator
import java.util.Arrays;//create array manipulator

public class CSE2Linear{//create public class
    
    public static void main (String[] args){//create main method
    
    Scanner myScanner = new Scanner(System.in);//define and name scanner
    
    System.out.println("Enter 15 ints for final grades in CSE2:");//print the statement
    int[] grades = new int[15];//create array to store the grades
    
    for (int i = 0; i<=14; i++){//start for loop
        
        grades[i] = myScanner.nextInt();//for every umber entered store it in the grades array
       
            
    }//end for loop
    
    Arrays.sort(grades);//create sorter
    
    
    System.out.print("The grades, sorted, are: ");//print
    for (int i = 0; i<=14; i++){//start and run for loop
        System.out.print(grades[i]);
        System.out.print(", ");
    }
    
    System.out.println("\nEnter a grade to search for: ");//print
    int search = myScanner.nextInt();//create int
   
    int iterations = firstSearch(grades, search);//create int and look for returned value from firstSearch
    
    System.out.println(" with " +iterations+ " iterations");//print
    System.out.println("Scrambled:");//print
    
    int[] scrambled = scramble(grades);//create scrambled and look for returned value from scramble
    
    for (int i = 0; i<=14; i++){//run for loop
        System.out.print(scrambled[i]);
        System.out.print(", ");
    }
    
    System.out.println("");//print
    System.out.println("Enter a grade to search for: ");//print
    int linearFind = myScanner.nextInt();//create int
    
    int linear = secondSearch(grades, linearFind);//create linear and look for returned value from secondSearch
    
    System.out.println(" in the list with "+linear+" iterations");//print
    
    }//end main method
    
    
    public static int firstSearch(int[] grades, int search){//create method "firstSearch"
        int lowerBound = 0;//initialize int
        int upperBound = 14;//initialize int
    
        int position;//initialize int
        int count = 1;//initialize int
        
        position = (lowerBound + upperBound)/2;
        
        while((grades[position] != search) && (lowerBound<=upperBound)){//initialize and run while loop
            //the following are used to determine whether the bounds need to increase or decrease
            if(grades[position]>search){
                upperBound = position - 1;
            }
            else{
                lowerBound = position + 1;
            }
            //this sets new bounds
            position = (lowerBound + upperBound)/2;
            
            if((grades[position] != search) && (lowerBound<=upperBound)){
            count++;//adds one if loop is ging to continue
            }
            else{//does nothing
            }
            
            
        }
        
        if(lowerBound <= upperBound){
            System.out.print(search+ " was found in the list");
        }
        else{
            System.out.print(search+ " was not found in the list");
        }
        
        return count;//return value count
        
        
        
    }//end method firstSeach
    
    
    
    public static int[] scramble(int[] grades){//create method "scramble"
        
        Random rand = new Random();//create random number generator rand
        
        for (int i = 0; i<=14; i++){//initialize and run through for loop
            int randomSpot = rand.nextInt(14);
            int z = grades[i];
            grades[i] = grades[randomSpot];
            grades[randomSpot] = z;
        }
        
        return grades;//return value grades
        
        
    }//end method scramble
    
    
    
    public static int secondSearch(int[] grades, int linearFind){//create method "secondSearch"
        
        int count = 1;//initialize and set count to 1
        
        for (int i = 0; i<=14; i++){//start for loop
            
            if (grades[i] == linearFind){//start if statement
                System.out.print(linearFind+ " was found");//print the statement
                break;//break from for loop
                
            }
            if (i==14){//start if statement
                System.out.print(linearFind+ " was not found");//print statement
                break;//break for for loop
            }
            count++;//add one to count
            
        }
        
        return count;//return count
        
    }//end method secondSearch
    
    
    
}//end public class