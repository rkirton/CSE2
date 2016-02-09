//////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab12
//

import java.util.Scanner;

public class lab12{
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the width");
        int w = myScanner.nextInt();
        System.out.println("Enter the height");
        int h = myScanner.nextInt();
        
        System.out.println("Enter the format (t for true, anything else false)");
        String f = myScanner.nextLine();
        String t = "t";
        
        boolean format = f==t;
        
        int[][] myArray = new int[h][];
        int num = 0;
        
        if (format == true){
            
            for(int i=0; i<=h; h++){
                for(int j=0; j<=w; j++){
                    num++;
                    myArray[i][j] = num;
                }
            }
            
            
        }//end if statement
        else{
            
            for(int i=0; i<=w; w++){
                for(int j=0; j<=h; h++){
                    num++;
                    myArray[i][j] = num;
                }
            }
            
        }//end else statement
        
        
        for(int i=0; i<=h; i++){
            for(int j=0; j<=w; j++){
                System.out.print("["+myArray[i][j]+"]");
            }
            System.out.print("\n");
        }
        
        
        
        
    }//end the method increasingMatrix
    
    
}//end public class