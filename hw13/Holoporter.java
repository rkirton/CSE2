///////////////////////////////////////////////////////
//Ryan Kirton
//hw13
//Holoporter
//
//This program has several functions.  It essentially
//manipulates a random 3d array in different ways.
//

import java.util.Scanner;

public class Holoporter{//public class
    public static void main(String[] args){//main method
        
        Scanner myScanner = new Scanner(System.in);//name scanner
        
        
        String[][][] array = soRandom();//create main array
        //fill main array
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                for(int k=0; k<array[i][j].length; k++){
                    array[i][j][k] = coder();
                }
            }
        }
        //print array
        print(array);
        //create random container
        String[][][] container = soRandom();
        //this complicated if statement fills the container with 
        //array values, and fills any extra spaces with $$$$$$
        if(array.length<container.length){
            for(int i=0; i<array.length; i++){
                if(array[i].length<container[i].length){
                    for(int j=0; j<array[i].length; j++){
                        if(array[i][j].length<container[i][j].length){
                            for(int k=0; k<array[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                            for(int k=array[i][j].length; k<container[i][j].length; k++){
                                container[i][j][k] = "$$$$$$";
                            }
                        }
                        else{
                            for(int k=0; k<container[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                            
                        }
                        
                    }
                    for(int j=array[i].length; j<container[i].length; j++){
                        for(int k=0; k<container[i][j].length; k++){
                            container[i][j][k] = "$$$$$$";
                        }
                    }
                }
                else{
                    for(int j=0; j<container[i].length; j++){
                        if(array[i][j].length<container[i][j].length){
                            for(int k=0; k<array[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                            for(int k=array[i][j].length; k<container[i][j].length; k++){
                                container[i][j][k] = "$$$$$$";
                            }
                            
                        }
                        else{
                            for(int k=0; k<container[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                        }
                    }
                }
                
            }
            for(int i=array.length; i<container.length; i++){
                for(int j=0; j<container[i].length; j++){
                    for(int k=0; k<container[i][j].length; k++){
                        container[i][j][k] = "$$$$$$";
                    }
                }
            }
        }
        else{
            for(int i=0; i<array.length; i++){
                if(array[i].length<container[i].length){
                    for(int j=0; j<array[i].length; j++){
                        if(array[i][j].length<container[i][j].length){
                            for(int k=0; k<array[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                            for(int k=array[i][j].length; k<container[i][j].length; k++){
                                container[i][j][k] = "$$$$$$";
                            }
                        }
                        else{
                            for(int k=0; k<container[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                            
                        }
                        
                    }
                    for(int j=array[i].length; j<container[i].length; j++){
                        for(int k=0; k<container[i][j].length; k++){
                            container[i][j][k] = "$$$$$$";
                        }
                    }
                }
                else{
                    for(int j=0; j<container[i].length; j++){
                        if(array[i][j].length<container[i][j].length){
                            for(int k=0; k<array[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                            for(int k=array[i][j].length; k<container[i][j].length; k++){
                                container[i][j][k] = "$$$$$$";
                            }
                            
                        }
                        else{
                            for(int k=0; k<container[i][j].length; k++){
                                container[i][j][k] = array[i][j][k];
                            }
                        }
                    }
                }
                
            }
        }//end of if else
        
        print(container);
        
        sampling(array);
        percentage(array,container);
        String[][][] reorder = frankenstein(array);
        
        print(reorder);
        System.out.println("ALL DONE.");
        
        
        
        
    }//end of main method
    
    public static String[][][] soRandom(){//This method creates a random3d array
        
        int rand1 = (int)(Math.random()*10+1);
        
        String[][][] array1 = new String[rand1][][];
        
        for(int i=0; i<rand1; i++){
            array1[i] = new String[(int)(Math.random()*10+1)][];
        }
        for(int i=0; i<rand1; i++){
            for(int j=0; j<array1[i].length; j++){
                array1[i][j] = new String[(int)(Math.random()*10+1)];
            }
        }
        return array1;
        
    }
    
    public static String coder(){//this method gives a value XXYYYY where x's are 
    //random letters and y's are random numbers
        
        String build = "";
        
        for(int i=0; i<6; i++){
            int rand;
            String add = "";
            if(i<2){//random letters
                rand = (int)(Math.random()*26);
                switch (rand){
                    case 0:
                        add = "A";
                        break;
                    case 1:
                        add = "B";
                        break;
                    case 2:
                        add = "C";
                        break;
                    case 3:
                        add = "D";
                        break;
                    case 4:
                        add = "E";
                        break;
                    case 5:
                        add = "F";
                        break;
                    case 6:
                        add = "G";
                        break;
                    case 7:
                        add = "H";
                        break;
                    case 8:
                        add = "I";
                        break;
                    case 9:
                        add = "J";
                        break;
                    case 10:
                        add = "J";
                        break;
                    case 11:
                        add = "K";
                        break;
                    case 12:
                        add = "M";
                        break;
                    case 13:
                        add = "N";
                        break;
                    case 14:
                        add = "O";
                        break;
                    case 15:
                        add = "P";
                        break;
                    case 16:
                        add = "Q";
                        break;
                    case 17:
                        add = "R";
                        break;
                    case 18:
                        add = "S";
                        break;
                    case 19:
                        add = "T";
                        break;
                    case 20:
                        add = "U";
                        break;
                    case 21:
                        add = "V";
                        break;
                    case 22:
                        add = "W";
                        break;
                    case 23:
                        add = "X";
                        break;
                    case 24:
                        add = "Y";
                        break;
                    case 25:
                        add = "Z";
                        break;
                    
                }
                
            }
            else{//random numbers
                rand = (int)(Math.random()*10);
                switch (rand){
                    case 0:
                        add = "0";
                        break;
                    case 1:
                        add = "1";
                        break;
                    case 2:
                        add = "2";
                        break;
                    case 3:
                        add = "3";
                        break;
                    case 4:
                        add = "4";
                        break;
                    case 5:
                        add = "5";
                        break;
                    case 6:
                        add = "6";
                        break;
                    case 7:
                        add = "7";
                        break;
                    case 8:
                        add = "8";
                        break;
                    case 9:
                        add = "9";
                        break;
                }
            }
            build += add;
            
        }
        
        return build;
        
    }
    
    public static void print(String[][][] array1){
        
        for(int i=0; i<array1.length; i++){
            if(i>0){
                System.out.print("---");
            }
            for(int j=0; j<array1[i].length; j++){
                if(j>0){
                    System.out.print("|");
                }
                System.out.print("[");
                for(int k=0; k<array1[i][j].length; k++){
                    if(k>0){
                        System.out.print(", ");
                    }
                    System.out.print(array1[i][j][k]);
                }
                System.out.print("]");
            }
        }
        System.out.println("");
        return;
        
        
    }
    
    public static void sampling(String[][][] molecule){//this looks for user given code
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a code to be searched for: ");
        String search = myScanner.next();
        boolean check = false;
        int x = 0;
        int y = 0;
        int z = 0;
        
        for(int i=0; i<molecule.length; i++){
            for(int j=0; j<molecule[i].length; j++){
                for(int k=0; k<molecule[i][j].length; k++){
                    if(molecule[i][j][k].equals(search)){
                        check = true;
                        x=i;
                        y=j;
                        z=k;
                    }
                }
            }
        }
        
        if(check){
            System.out.print(x);
            System.out.print(y);
            System.out.print(z);
            System.out.println("");
        }
        else{
            System.out.println("Not found");
        }
        return;
        
        
        
    }
    
    public static void percentage(String[][][] array1, String[][][] array2){//this returns
    //the percent different between the originial and the container
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                for(int k=0; k<array1[i][j].length; k++){
                    count1++;
                }
            }
        }
        for(int i=0; i<array2.length; i++){
            for(int j=0; j<array2[i].length; j++){
                for(int k=0; k<array2[i][j].length; k++){
                    count2++;
                }
            }
        }
        
        int percent = (count2-count1)/count1;
        System.out.println("Percentage change: "+(percent)+"%");
        
        
    }
    
    public static String[][][] frankenstein(String[][][] array1){//this reorders the array
        
        for(int i=0; i<array1.length; i++){
            for(int i1=i+1; i1<array1.length; i1++){
                if(array1[i1].length<array1[i].length){
                    String[][][] temp = new String[1][][];
                    temp[0] = array1[i1];
                    array1[i1] = array1[i];
                    array1[i] = temp[0];
                }
            }
            
        }
        
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                for(int j1=j+1; j1<array1[i].length; j++){
                    if(array1[i][j1].length<array1[i][j].length){
                        String[][][] temp = new String[1][1][];
                        temp[0][0] = array1[i][j];
                        array1[i][j] = array1[i][j1];
                        array1[i][j1] = temp[0][0];
                    }
                }
            }
        }
        
        return array1;
        
        
    }
    
    
    
    
    
}