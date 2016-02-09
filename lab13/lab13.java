////////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab13
//
//
//
//

import java.util.Scanner;//create scanner

public class lab13{//create public class
    
    public static void main(String[] args){//create main method
        
        Scanner myScanner = new Scanner(System.in);//define and name scanner
        
        int[][] mainArray = new int[5][];//create array
        
        for(int i=0; i<=4; i++){
            int k = i*3+5;
            
            for(int j = 0; j<=k; j++){
                
                mainArray[i] = new int[k];
                
                mainArray[i][k] = (int)((Math.random())*40);
                
            }
            
        }
        
        int[][] sortedArray = sort(mainArray);
        
        
        
        
        
    }//end main method
    
    
    public static int[] sort(int mainArray){//create method sort
        
        
        
        for(int i=0; i<=4; i++){
            int k = i*3+5;
            
            int max = mainArray[i][0];
            
            for(int j = 0; j<=k; j++){
                
                if(mainArray[i][j]>max){
                    
                    
                    
                    
                }
                
            }
                
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
    }//end method sort
    
    
}//end public class