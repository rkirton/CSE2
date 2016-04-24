////////////////////////////////////////////////////////
//Ryan Kirton
//lab12
//
//
//

import java.util.Scanner;

public class lab12{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for the 2d array: ");
        
        int rows = myScanner.nextInt();
        
        int array1[rows][];
        
        int a = (int)(Math.random()*rows);
        
        for(int i=0; i<rows; i++){
            array1[i][(int)(Math.random()*rows)];
        }
        
        for(int i=0; i<rows; i++){
            int j = array1[i].length;
            for(int k=0; k<j; k++){
                array1[i][k] = (int)(Math.random()*21);
            }
        }
        
        for(int i=0; i<rows; i++){
            int length = array1[i].length;
            for(int j=i+1; j<rows; j++){
                if(array1[j].length<array1[i]){
                    int temp[1];
                    temp[0] = array1[i];
                    array1[i] = array1[j];
                    array[j] = temp[0];
                }
                
            }
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<array[i].length; j++){
                for(int k=j+1; k<array1[i].length; k++){
                    if(array1[i][j]<array1[i][k]){
                        int temp = array1[i][j];
                        array1[i][j] = array1[i][k];
                        array1[i][k] = temp;
                    }
                    
                }
                
            }
        }
        
        System.out.println("Sorted array");
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<array1[i].length; j++){
                System.out.print(array1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        
        
        
        
    }
}