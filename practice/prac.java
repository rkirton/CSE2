//Evan Vomund
//CSE 2
//code generates and multiplies two arrays generated randomly

import java.util.Random;
import java.util.Scanner;
public class prac{

public static int randomNumber(){//generates random number -10to 10
int negative=(int)((Math.random())*2);//negative or possitive
int number=0;
if (negative==0){//less
    number=(int)((Math.random())*10);//between zero and ten
}
else {
    number=(-1*(int)((Math.random())*10));//between -10 and zero
}
return number;//retruns random matrix
}



public static int[][] randomMatrix(int row, int colemn){//for binary source

//int size=row*colemn;

int[][] matrix=new int[row][];
        for (int j=0; j<row; j++){
            matrix[j]=new int[colemn];
for (int i=0; i<colemn; i++){
matrix[j][i] = randomNumber(); 

}
}
return matrix;
}//end randomMatrix

public static void print(int[][] matrix){
    int row=matrix.length;
    int colemn=matrix[1].length;
for (int j=0; j<row; j++){
for (int i=0; i<colemn; i++){
    if (i+1==colemn){
        System.out.println("  "+matrix[j][i]);
    }
else {
    System.out.print("   "+matrix[j][i]);
}

}
}
    
}//end print


public static int[][]matrixMultiply(int[][] matrixOne, int[][] matrixTwo){
int rowOne=matrixOne.length;
int colemnOne=matrixOne[1].length;
int rowTwo=matrixTwo.length;
int colemnTwo=matrixTwo[1].length;
int x=1;
int p=0;


if (rowOne!=colemnTwo){
    System.out.println("cannot multiply");

}
System.out.println("The dementions of the matrix are"+rowOne+"x"+rowTwo);
int[][] matrixFinal=new int[rowOne][];
        
        for (int j=0; j<rowOne; j++){
            
            matrixFinal[j]=new int[rowTwo];
            
for (int i=0; i<rowTwo; i++){

int number=0;
    for (x=0; x<rowOne; x++){
        
    
        number=number+(matrixOne[j][x]*matrixTwo[x][i]);
    
    }
matrixFinal[j][i] = number; 

}
}

return matrixFinal;
}//ent matrixMultiply

public static void main(String[] args){
    Scanner myScanner = new Scanner( System.in );
System.out.println("Enter the height of first matrix: ");
int rowone=myScanner.nextInt();
System.out.println("Enter the width of first matrix: ");
int colemnone=myScanner.nextInt();
int [][] matrix=randomMatrix(rowone, colemnone);
print(matrix);

System.out.println("Enter the height of second matrix: ");
int row=myScanner.nextInt();
System.out.println("Enter the width of second matrix: ");
int colemn=myScanner.nextInt();
int [][]matrixTwo=randomMatrix(row, colemn);
print(matrixTwo);
if (rowone!=colemn){
    System.out.println("cannot multiply");
    return;

}
int [][] matrixFinal=matrixMultiply(matrix, matrixTwo);
print(matrixFinal);
}//end main



}