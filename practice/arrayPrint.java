import java.util.Scanner;

public class arrayPrint{
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        
        int[] array1 = new int[3];
        
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 10;
        
        
        for(int i=0; i<=2; i++){
        System.out.println(array1[i]);
        }
        
        
    }
}