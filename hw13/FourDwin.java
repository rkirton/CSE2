/////////////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw13
//FourDwin
//
//
//

import java.util.Scanner;//create scanner

public class FourDwin{//create public class
    
    public static statArray(){//create method statArray
        
    }//end method statArray
    
    public static sort4DArray(){//create method sort4DArray
        
    }//end method sort4DArray
    
    public static sort3DArray(){//create method sort3DArray
        
    }//end method sort3DArray
    
    public static printArray(){//create method printArray
        
    }//end method printArray
    
    
    
    
    public static void main(String[] args){//create main method
        
        double[][][] mainArray new double [3][][];
        
        Scanner myScanner = new Scanner(System.in);//name and define scanner
        
        System.out.println("Enter an integer X: ");//print
        
        int X = 0;
        
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                X = myScanner.nextInt();//user input
                if (X<1){
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
        
        int Y = 0;
        
        System.out.println("Enter an integer Y where Y > X: ");//print
        
        for (int i=1; i>0; i++){
            if (myScanner.hasNextInt()){//test if it is an int
                Y = myScanner.nextInt();//user input
                if (Y<1 || Y <= X){
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
        
        for(int i = 0; i<=2; i++){
            
            mainArray[i] = new int[X];
            
            for(j = 0; j<=X-1; j++){
                
                mainArray[i][j] = new int [Y];
                
                for(int k=0; k<=Y-1; k++){
                    
                    mainArray[i][j][k] = (int)((Math.random())*300);
                    
                    
                }
                
                
            }
            
            
        }
        
        
        
        
    }//end main method
    
    
    
    
}//end public class