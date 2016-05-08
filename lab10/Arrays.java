////////////////////////////////////////////////////done
//Ryan Kirton
//lab10
//Arrays
//
//This program takes student names fromt he user and creates
//random grades in an array for them.
//

import java.util.Scanner;//create scanner

public class Arrays{//public class
    public static void main(String[] args){//main method
        
    Scanner myScanner = new Scanner(System.in);//name scanner
        
        int rand = (int)((Math.random()*6)+5);//create random int
        //for number of students
        
        String students[] = new String [rand];//create student name array
        System.out.println("Enter "+(rand)+" student names:");
        
        for(int i=0; i<rand; i++){//place names in array
            students[i] = myScanner.nextLine();
            
        }
        
        int grades[] = new int [rand];//cretae array for grades
        
        for(int i=0; i<rand; i++){//place grades in array
            grades[i] = (int)(Math.random()*101);
            
        }
        
        System.out.println("The grades of the "+(rand)+" students are: ");
        
        for(int i=0; i<rand; i++){//print out each name and grade
            System.out.print(students[i]);
            System.out.print(": "+(grades[i])+" ");
            System.out.println("");
        }
        
        
        
    }
}