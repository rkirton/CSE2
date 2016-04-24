///////////////////////////////////////////////////////
//Ryan Kirton
//lab11
//
//
//

import java.util.Scanner;

public class search{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        
        int array1[] = new int [50];
        int array2[] = new int[50];
        
        for(int i=0;i<50;i++){
            array1[i] = (int)(Math.random()*101);
        }
        
        int rand = (int)(Math.random()*101);
        int rand1;
        for(int i=0;i<50;i++){
            array2[i] = rand;
            rand1 = (int)(Math.random()*101);
            rand = rand + rand1;
            
        }
        
        int min1 = array1[0];
        int max1 = array1[0];
        int min2 = array2[0];
        int max2 = array2[0];
        
        for(int i=1;i<50;i++){
            if(array1[i]<min1){
                min1 = array1[i];
            }
            if(array1[i]>max1){
                max1 = array1[i];
            }
            if(array2[i]<min2){
                min2 = array2[i];
            }
            if(array2[i]>max2){
                max2 = array2[i];
            }
            
        }
        
        
        
        
        System.out.println("The max of array1 is: "+(max1)+"");
        System.out.println("The min of array1 is: "+(min1)+"");
        System.out.println("The max of array2 is: "+(max2)+"");
        System.out.println("The min of array2 is: "+(min2)+"");
        System.out.println("Enter an int");
        
        int search = myScanner.nextInt();
        
        
        
        
    }
}