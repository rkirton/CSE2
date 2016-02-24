////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw04
//ToHex
//
//This program should be able to take 3 inputs in the range of 0-255
//and convert them to hexadecimal.

import java.util.Scanner;//initialize scanner

public class ToHex{//create public class
    public static void main(String[] args){//create main method
        Scanner myScanner = new Scanner(System.in);//define and name scanner
        
        System.out.println("Please enter 3 numbers representing RGB values: ");//print statement
        double red = 0;//initialize variables
        double green = 0;
        double blue = 0;
        
        if(myScanner.hasNextInt()){//check if the first number is an integer
            red = myScanner.nextDouble();
            if (red>=0 && red<=255){}//check if number is in range
            else{
                System.out.println("Invalid input. Not in 0-255 range");
                System.exit(0);
            }
        }
        else{//if input isn't an int, exit program
            System.out.println("Invalid inupt. Must be integers.");
            System.exit(0);    
        }
        
        
        if(myScanner.hasNextInt()){//check if the second number is an int
            green = myScanner.nextDouble();
            if (green>=0 && green<=255){}//check if it's in range
            else{
                System.out.println("Invalid input. Not in 0-255 range");
                System.exit(0);
            }
        }
        else{//if it isn't an int exit the program
            System.out.println("Invalid inupt. Must be integers.");
            System.exit(0);    
        }
        
        
        
        if(myScanner.hasNextInt()){//check if the third input is an int
            blue = myScanner.nextDouble();
            if (blue>=0 && blue<=255){}//check if it's in the right range
            else{
                System.out.println("Invalid input. Not in 0-255 range");
                System.exit(0);
            }
        }
        else{//if it isn't an int, exit the program
            System.out.println("Invalid inupt. Must be integers.");
            System.exit(0);    
        }
        
        
        //initialize variables to be used in conversion
        String red1="0";
        String red2="0";
        int red3=0;
        int red4=0;
        
        //divide red by 16, and use that to find the first converted digit
        red3 = (int)(red/16);
        switch(red3){//based on what red3 is, the converted digit will fall under one of these cases
            case 0:
                red1 = "0";
                break;
            case 1:
                red1 = "1";
                break;
            case 2:
                red1 = "2";
                break;
            case 3:
                red1 = "3";
                break;
            case 4:
                red1 = "4";
                break;
            case 5:
                red1 = "5";
                break;
            case 6:
                red1 = "6";
                break;
            case 7:
                red1 = "7";
                break;
            case 8:
                red1 = "8";
                break;
            case 9:
                red1 = "9";
                break;
            case 10:
                red1 = "A";
                break;
            case 11:
                red1 = "B";
                break;
            case 12:
                red1 = "C";
                break;
            case 13:
                red1 = "D";
                break;
            case 14:
                red1 = "E";
                break;
            case 15:
                red1 = "F";
                break;
        }
        
        red4 = (int)(red)-(red3*16);//find the remainder after the first digit has been accounted for
        
        switch(red4){//based on what red4 is, the converted digit will fall under one of these cases
            case 0:
                red2 = "0";
                break;
            case 1:
                red2 = "1";
                break;
            case 2:
                red2 = "2";
                break;
            case 3:
                red2 = "3";
                break;
            case 4:
                red2 = "4";
                break;
            case 5:
                red2 = "5";
                break;
            case 6:
                red2 = "6";
                break;
            case 7:
                red2 = "7";
                break;
            case 8:
                red2 = "8";
                break;
            case 9:
                red2 = "9";
                break;
            case 10:
                red2 = "A";
                break;
            case 11:
                red2 = "B";
                break;
            case 12:
                red2 = "C";
                break;
            case 13:
                red2 = "D";
                break;
            case 14:
                red2 = "E";
                break;
            case 15:
                red2 = "F";
                break;
        }
        
        //initialize variables to be used in conversion
        String green1="0";
        String green2="0";
        int green3=0;
        int green4=0;
        
        green3 = (int)(green/16);//divide green by 16 to find first converted digit
        switch(green3){//based on what green3 is, the converted digit will fall under one of these cases
            case 0:
                green1 = "0";
                break;
            case 1:
                green1 = "1";
                break;
            case 2:
                green1 = "2";
                break;
            case 3:
                green1 = "3";
                break;
            case 4:
                green1 = "4";
                break;
            case 5:
                green1 = "5";
                break;
            case 6:
                green1 = "6";
                break;
            case 7:
                green1 = "7";
                break;
            case 8:
                green1 = "8";
                break;
            case 9:
                green1 = "9";
                break;
            case 10:
                green1 = "A";
                break;
            case 11:
                green1 = "B";
                break;
            case 12:
                green1 = "C";
                break;
            case 13:
                green1 = "D";
                break;
            case 14:
                green1 = "E";
                break;
            case 15:
                green1 = "F";
                break;
        }
        //find the remainder after the first digit has been accounted for to find the second
        green4 = (int)(green)-(green3*16);
        
        switch(green4){//based on what green4 is, the converted digit will fall under one of these cases
            case 0:
                green2 = "0";
                break;
            case 1:
                green2 = "1";
                break;
            case 2:
                green2 = "2";
                break;
            case 3:
                green2 = "3";
                break;
            case 4:
                green2 = "4";
                break;
            case 5:
                green2 = "5";
                break;
            case 6:
                green2 = "6";
                break;
            case 7:
                green2 = "7";
                break;
            case 8:
                green2 = "8";
                break;
            case 9:
                green2 = "9";
                break;
            case 10:
                green2 = "A";
                break;
            case 11:
                green2 = "B";
                break;
            case 12:
                green2 = "C";
                break;
            case 13:
                green2 = "D";
                break;
            case 14:
                green2 = "E";
                break;
            case 15:
                green2 = "F";
                break;
        }
        
        //initialize variables to be used in converting the number
        String blue1="0";
        String blue2="0";
        int blue3=0;
        int blue4=0;
        //blue divided by 16 will give the first digit
        blue3 = (int)(blue/16);
        switch(blue3){//based on what blue3 is, the converted digit will fall under one of these cases
            case 0:
                blue1 = "0";
                break;
            case 1:
                blue1 = "1";
                break;
            case 2:
                blue1 = "2";
                break;
            case 3:
                blue1 = "3";
                break;
            case 4:
                blue1 = "4";
                break;
            case 5:
                blue1 = "5";
                break;
            case 6:
                blue1 = "6";
                break;
            case 7:
                blue1 = "7";
                break;
            case 8:
                blue1 = "8";
                break;
            case 9:
                blue1 = "9";
                break;
            case 10:
                blue1 = "A";
                break;
            case 11:
                blue1 = "B";
                break;
            case 12:
                blue1 = "C";
                break;
            case 13:
                blue1 = "D";
                break;
            case 14:
                blue1 = "E";
                break;
            case 15:
                blue1 = "F";
                break;
        }
        //blue4 is the remainder after the first digit was taken, giving the second
        blue4 = (int)(blue)-(blue3*16);
        
        switch(blue4){//based on what blue4 is, the converted digit will fall under one of these cases
            case 0:
                blue2 = "0";
                break;
            case 1:
                blue2 = "1";
                break;
            case 2:
                blue2 = "2";
                break;
            case 3:
                blue2 = "3";
                break;
            case 4:
                blue2 = "4";
                break;
            case 5:
                blue2 = "5";
                break;
            case 6:
                blue2 = "6";
                break;
            case 7:
                blue2 = "7";
                break;
            case 8:
                blue2 = "8";
                break;
            case 9:
                blue2 = "9";
                break;
            case 10:
                blue2 = "A";
                break;
            case 11:
                blue2 = "B";
                break;
            case 12:
                blue2 = "C";
                break;
            case 13:
                blue2 = "D";
                break;
            case 14:
                blue2 = "E";
                break;
            case 15:
                blue2 = "F";
                break;
        }
        int redP = (int)(red);//convert the values to ints to clean them up when printing
        int greenP = (int)(green);
        int blueP = (int)(blue);
        
        //print the results
        System.out.println("The coversions are Red: "+(redP)+" to "+(red1)+""+(red2)+"");
        System.out.println("Green: "+(greenP)+" to "+(green1)+""+(green2)+"");
        System.out.println("Blue : "+(blueP)+" to "+(blue1)+""+(blue2)+"");
        
        
    }
}