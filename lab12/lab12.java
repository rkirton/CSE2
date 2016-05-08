////////////////////////////////////////////////////////
//Ryan Kirton
//lab12
//

import java.util.Scanner;//create scanner

public class lab12{//public class
    public static void main(String[] args){//main method
        
        Scanner myScanner = new Scanner(System.in);//name scanner
        //print statement
        System.out.println("Enter the number of rows for the 2d array: ");
        
        int rows = myScanner.nextInt();
        //create array
        int[][] array1 = new int[rows][];
        
        int a = (int)(Math.random()*(rows-1)+1);
        //ranodmize columns
        for(int i=0; i<rows; i++){
            array1[i] = new int[(int)(Math.random()*(rows-1)+1)];
        }
        //randomize array inputs
        for(int i=0; i<rows; i++){
            int j = array1[i].length;
            for(int k=0; k<j; k++){
                array1[i][k] = (int)(Math.random()*21);
            }
        }
        //print array
        System.out.println("Unsorted Array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<array1[i].length; j++){
                System.out.print(array1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        //sort each array row
        for(int i=0; i<rows; i++){
            for(int j=0; j<array1[i].length; j++){
                for(int k=j+1; k<array1[i].length; k++){
                    if(array1[i][k]<array1[i][j]){
                        int temp = array1[i][j];
                        array1[i][j] = array1[i][k];
                        array1[i][k] = temp;
                    }
                }
            }
        }
        //print array
        System.out.println("Sorted Array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<array1[i].length; j++){
                System.out.print(array1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        //sort array by row length
        for(int i=0; i<rows; i++){
            int length = array1[i].length;
            for(int j=i+1; j<rows; j++){
                if(array1[j].length < array1[i].length){
                    int[][] temp = new int[1][];
                    int[][] temp1 = new int[1][];
                    temp[0] = array1[i];
                    temp1[0] = temp[0];
                    array1[i] = array1[j];
                    array1[j] = temp1[0];
                }
                
            }
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<array1[i].length; j++){
                for(int k=j+1; k<array1[i].length; k++){
                    if(array1[i][j]<array1[i][k]){
                        int temp = array1[i][j];
                        array1[i][j] = array1[i][k];
                        array1[i][k] = temp;
                    }
                    
                }
                
            }
        }
        //print array
        System.out.println("Rearranged array");
        
        for(int i=0; i<rows; i++){
            for(int j=array1[i].length-1; j>=0; j--){
                System.out.print(array1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("Enter an int to be searched for: ");
        
        int search = myScanner.nextInt();
        int col = 0;
        int row = 0;
        boolean bool = false;
        //search for int
        for(int i=0; i<rows; i++){
            for(int j=0; j<array1[i].length; j++){
                if(bool){
                    
                }
                else if(search == array1[i][j]){
                    row = i+1;
                    col = j+1;
                    System.out.print("Found at row "+(row)+" column "+(col)+" ");
                    bool = true;
                }
                else if(i==rows-1 && j==array1[i].length-1){
                    System.out.println("Not found");
                }
            }
        }
        
        System.out.println("");
        
        
    }
}