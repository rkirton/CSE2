//
//
//
//
//
//

import java.util.Scanner;

public class wavespract{
    public static void main (String[] args){
        
        Scanner myScanner=new Scanner (System.in);
        
        System.out.println("Enter a number between 1 and 30: ");
        int mainNumber = myScanner.nextInt();
        
        System.out.println("WHILE LOOP");
        
        int m = mainNumber;
        
        int x=0;
        
        while (m>0){
            
            x++;
            
            while (x==1){
                System.out.println("1");
                x++;
            }
            while (x==2){
                System.out.println("2");
                System.out.println("22");
                x++;
            }
            while (x==3){
                System.out.println("333");
                System.out.println("33");
                System.out.println("3");
                x++;
            }
            while (x==4){
                System.out.println("4");
                System.out.println("44");
                System.out.println("444");
                System.out.println("4444");
                x++;
            }
            
            
            
            
            
            
            m--;
        }
        
        
        
    }
}