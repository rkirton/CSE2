

import java.util.Scanner;

public class sortPractice{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int[] array1 = new int[5];
        
        for(int i=0; i<=4; i++){
            array1[i] = (int)((Math.random())*20);
        }
        
        
        int min = array1[0];
        int spot = 0;
        
        for(int i=0; i<=4; i++){
            
            if(array1[i]<min){
                
                min = array1[i];
                
                array1[i] = array1[spot];
                array[spot] = 
                
                
            }
            
            
            
        }
        
        
    }
    
}