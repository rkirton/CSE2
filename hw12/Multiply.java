///////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw12
//Multiply
//
//This program should be able to take user input for array dimensions and
//create random arrays.  It should then be able to multiply these arrays and
//output the resulting array.

import java.util.Scanner;//create scanner

public class Multiply{//create public class
    
    public static int[][] randomMatrix(int h, int w){//create randomMatrix method
        
        int[][] matrix1 = new int[h][];//create matrix of height h
        
        for(int i=0; i<=h; i++){//start for loop
            
            for(int j=0; j<=w; j++){//start embedded for loop
                matrix1[i][j] = (int)(((Math.random())*22)-11);//create random values for the matrix
                
            }//end second for loop
        }//end first for loop
        
        return matrix1;//return the matrix "matrix1"
        
    }//end random method
    
    public static int[][] matrixMultiply(int[][] mainMatrix, int h2, int w2){//create method matrixMultiply
        
        int[][] randArray = new int[h2][];//create a new array of height h
        
        int[][] finalArray = new int[h2][];//create array
        
        for(int i = 0; i<=h2; i++){//use loop to start final array values at 0
            for(int j=0; j<=w2; j++){
                finalArray[i][j] = 0;
            }
        }
        
        
        
        for(int i=0; i<=h2; i++){//use loop to create random array
            for(int j=0; j<=w2; j++){
                
                randArray[i][j] = (int)(((Math.random())*22)-11);
                
            }
        }
        
        
        for(int i=0; i<=h2; i++){//use loop to multiply arrays
            for(int j=0; j<=w2; j++){
                
                finalArray[i][j] = mainMatrix[i][j]*randArray[i][j];
                
            }
        }
        
        
        return finalArray;//return the value
        
        
        
        
    }//end multiply method
    
    public static void main(String[] args){//create main method
        
        Scanner myScanner = new Scanner(System.in);//name and define scanner
        
        System.out.println("Enter a matrix height");//print the statement
        int h = 0;
        
        //check to see if h is valid
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                h = myScanner.nextInt();//user input
                if (h<1){
                    System.out.print("invalid input, enter new input: ");
                    continue;
                }
                else{
                    i=-4;
                    break;
                }
            }
            else{
                System.out.print("invalid input, enter new input: ");
                continue;
            }
   	    }
        
        
        
        System.out.println("Enter a matrix width");//print the statement
        int w = 0;
        
        //chekc to see if w is valid
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                w = myScanner.nextInt();//user input
                if (w<1){
                    System.out.print("invalid input, enter new input: ");
                    continue;
                }
                else{
                    i=-4;
                    break;
                }
            }
            else{
                System.out.print("invalid input, enter new input: ");
                continue;
            }
   	    }
        
        
        System.out.println("Enter a height for the second matrix: ");
        int h2 = 0;
        
        //check to see if h2 is valid
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                h2 = myScanner.nextInt();//user input
                if (h2<1 || h2 != h){
                    System.out.print("invalid input, enter new input: ");
                    continue;
                }
                else{
                    i=-4;
                    break;
                }
            }
            else{
                System.out.print("invalid input, enter new input: ");
                continue;
            }
   	    }
        
        
        
        
        System.out.println("Enter a width for the second matrix: ");
        int w2 = 0;
        
        //check to see if w2 is valid
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                w2 = myScanner.nextInt();//user input
                if (w2<1 || w2 != w){
                    System.out.print("invalid input, enter new input: ");
                    continue;
                }
                else{
                    i=-4;
                    break;
                }
            }
            else{
                System.out.print("invalid input, enter new input: ");
                continue;
            }
   	    }
        
        
        
        int[][] mainMatrix = randomMatrix(h, w);//create matrix "mainMatrix" as returned value form randomMatrix
        
        
        
        int[][] multipliedMatrix = matrixMultiply(mainMatrix, h2, w2);
        //create matrix "multipliedMatrix" as returned value from matrixMultiply
        
        for(int i=0; i<=h; i++){//use loop to print final matrix
            for(int j=0; j<=w; j++){
                System.out.print(multipliedMatrix[i][j]+" ");
            }
            System.out.print("\n");
            
        }
        
        
        
    }//end main method
    
    
}//end public class


//For the life of me I can't figure out why my code won't work.
//I've been even more careful than usual to check things like
//user input, but for some reason the random matrix method keeps
//getting tripped up.  Sorry. Any enlightenment when grading this
//would be much appreciated.