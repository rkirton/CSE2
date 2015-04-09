//////////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw10
//Remove Elements
//
//This program should be able to output an array of ten random
//digits.  Then it prompts the user to remove one of the places in
//the array.  Then it prompts the user to remove a particular number
//from the array. Finally it will print the final array.
//
//

import java.util.Scanner;//create scanner



public class RemoveElements{//create class
    public static void main (String[] args){//create main method
        Scanner scan = new Scanner(System.in);//name and define the scanner myScanner
        int num[]=new int[10];//initialize array
        int newArray1[];//initialize array
        int newArray2[];//initialize array
        int index,target;//initialize ints
	    String answer="";
	    do{//start do while loop
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = "The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
  	        System.out.print("Enter the index ");
  	        index = scan.nextInt();
  	        newArray1 = delete(num,index);
  	        String out1="The output array is ";
  	        out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out1);
 
            System.out.print("Enter the target value ");
  	        target = scan.nextInt();
  	        newArray2 = remove(num,target);
  	        String out2="The output array is ";
  	        out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	        System.out.println(out2);
  	 
  	        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	        answer=scan.next();
	        }while(answer.equals("Y") || answer.equals("y"));//end do while loop
  }//main method end
 
    public static String listArray(int num[]){//start method listArray
        String out="{";//print
        for(int j=0;j<num.length;j++){//start for loop
            if(j>0){//start if statement
                out+=", ";//print a comma for each number
            }
            out+=num[j];
	    }
	    out+="} ";
	    return out;//return "out"
    }//listArray method end
    
    public static int[] randomInput(){//start method randomInput
        int[] rand = new int[10];//start array
        int i = 1;//start int
        
        for(i=0; i<=9; i++){//start for loop
            int randInts = (int)((Math.random())*10);//create random ints
            rand[i] = randInts;//put ints in array
        }
        
        return rand;//return "rand"
        
    }
    
    public static int[] delete(int[] list, int place){//start method delete
        
        int[] deleteInt = new int[9];//start array
        
        for (int z=0; z<place-1; z++){//start for loop
            deleteInt[z] = list[z];//put numbers in array
        }
        
        for (int z=place; z<9; z++){//start for loop
            deleteInt[z-1] = list[z];
        }
        
        return deleteInt;//return "deleteInt"
    }
    
    public static int[] remove(int[] list, int target){//start method remove
        int a = 0;//start int
        int a1 = 0;//start int
        int a2 = 10-a;//start int
        for (int b=0; b<9; b++){//start for loop
            if (list[b]==target){//start if statement
                a++;//add one to a
            }
        }
        
        
        int[] removeValue = new int[a2];//start array
        for (int c=0; c<a2; c++){//start for loop
            if(list[c] != target){//start if statement
                removeValue[c-a1] = list[c];//add values to array
            }
            else{//start else statement
                a1++;//add one to a1
            }
        }
        
        return removeValue;//return removeValue
        
    }
    
    
    
    
}//class end