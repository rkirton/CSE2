/////////////////////////////////////////////////////////////////
//Ryan Kirton
//Lab11
//searchArrays
//
//

import java.util.Scanner;//create scanner
import java.util.Random;//create random number generator
public class searchArrays{//create public class

public static void main(String[] args) {//generate random array
//Random numGen = new Random();//to import random numbers
	int[] randomInputs=new int [50];//size 10 array
	int i=1;//for count
	for(i=0; i<=49; i++){//create for loops
		int random=(int) ((Math.random())*100);//random numbers in array
		randomInputs[i]=random;
	}
	int max=0;//create int
	int min=100;//create int
	for(i=0; i<=49; i++){//start for loop
	    if (randomInputs[i]<min){//start if statement
		    min=randomInputs[i];
	    }
    
	    else if (randomInputs[i]>max){//start else if
		    max=randomInputs[i];
	    }
	}
	System.out.println("The maximum of array1 is: "+max);//print
	System.out.println("The minimum of array1 is: "+min);//print
	
	
	
	int[] orderInputs=new int [50];//create array
	int count=0;//create int
	for(i=0; i<=49; i++){//create for loop
		int random=(int) ((Math.random())*100);//random numbers in array
		count+=random;
		orderInputs[i]=count;
    }
    System.out.println("The maximum of array2 is: "+orderInputs[49]);//print statement
    System.out.println("The minimum of array2 is: "+orderInputs[0]);//print statement

	Scanner scan=new Scanner(System.in);//define and name scanner
	System.out.println("Enter an int: ");//print
	int search=scan.nextInt();//user input
	
	
    int lowerBound = 0;//initialize int
    int upperBound = 14;//initialize int
    
    int position;//initialize int
    int count2 = 1;//initialize int
        
    position = (lowerBound + upperBound)/2;//define position
        
    while((orderInputs[position] != search) && (lowerBound<=upperBound)){//initialize and run while loop
        //the following are used to determine whether the bounds need to increase or decrease
        if(orderInputs[position]>search){
            upperBound = position - 1;
        }
        else{
            lowerBound = position + 1;
        }
        //this sets new bounds
        position = (lowerBound + upperBound)/2;
            
            
            
    }
        
    if(lowerBound <= upperBound){
        System.out.println(search+ " was found in the list between "+orderInputs[lowerBound]+" and "+orderInputs[upperBound]);//print
        
    }
    else{
        System.out.println(search+ " was not found in the list between "+orderInputs[upperBound]+" and "+orderInputs[lowerBound]);//print
    }
    
    
    
}//end method
}//end class















//DONE NOT CHECKED