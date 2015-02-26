////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw05
//To Hex
//
//This program should be able to take three decimal numbers representing
//RGB values and convert them to hexadecimal.
//
//

import java.util.Scanner;//create scanner

public class ToHex{//class always required
    public static void main(String[] args){//main method always required
        Scanner myScanner=new Scanner(System.in);//name and define new scanner
        
        System.out.print("Enter the three numbers representing RGB values \n");//print the statement
        int r=myScanner.nextInt();//create int r as 1st user input
        int g=myScanner.nextInt();//create int g as next user input
        int b=myScanner.nextInt();//create int b as last user input
        
        StringBuilder redHex=new StringBuilder();//create string redHex to be built upon
        
        int red1st=r/16;//define 1st hex digit
        int red2nd=r%16;//define 2nd hex digit
        
        
        switch (red1st){//if the first red digit equals the following cases, append the digit or letter following that case
            case 0:
                redHex.append("0");
                break;
            case 1:
                redHex.append("1");
                break;
            case 2:
                redHex.append("2");
                break;
            case 3:
                redHex.append("3");
                break;
            case 4:
                redHex.append("4");
                break;
            case 5:
                redHex.append("5");
                break;
            case 6:
                redHex.append("6");
                break;
            case 7:
                redHex.append("7");
                break;
            case 8:
                redHex.append("8");
                break;
            case 9:
                redHex.append("9");
                break;
            case 10:
                redHex.append("A");
                break;
            case 11:
                redHex.append("B");
                break;
            case 12:
                redHex.append("C");
                break;
            case 13:
                redHex.append("D");
                break;
            case 14:
                redHex.append("E");
                break;
            case 15:
                redHex.append("F");
                break;
        }
        switch (red2nd){//if the second red digit equals the following cases, append the digit or letter following that case
            case 0:
                redHex.append("0");
                break;
            case 1:
                redHex.append("1");
                break;
            case 2:
                redHex.append("2");
                break;
            case 3:
                redHex.append("3");
                break;
            case 4:
                redHex.append("4");
                break;
            case 5:
                redHex.append("5");
                break;
            case 6:
                redHex.append("6");
                break;
            case 7:
                redHex.append("7");
                break;
            case 8:
                redHex.append("8");
                break;
            case 9:
                redHex.append("9");
                break;
            case 10:
                redHex.append("A");
                break;
            case 11:
                redHex.append("B");
                break;
            case 12:
                redHex.append("C");
                break;
            case 13:
                redHex.append("D");
                break;
            case 14:
                redHex.append("E");
                break;
            case 15:
                redHex.append("F");
                break;
        }
        
        StringBuilder greenHex=new StringBuilder();//create greenHex to be built upon
        
        int green1st=g/16;//define first green hex digit
        int green2nd=g%16;//define second green hex digit
        
        
        switch (green1st){//if the first green digit equals the following cases, append the digit or letter following that case
            case 0:
                greenHex.append("0");
                break;
            case 1:
                greenHex.append("1");
                break;
            case 2:
                greenHex.append("2");
                break;
            case 3:
                greenHex.append("3");
                break;
            case 4:
                greenHex.append("4");
                break;
            case 5:
                greenHex.append("5");
                break;
            case 6:
                greenHex.append("6");
                break;
            case 7:
                greenHex.append("7");
                break;
            case 8:
                greenHex.append("8");
                break;
            case 9:
                greenHex.append("9");
                break;
            case 10:
                greenHex.append("A");
                break;
            case 11:
                greenHex.append("B");
                break;
            case 12:
                greenHex.append("C");
                break;
            case 13:
                greenHex.append("D");
                break;
            case 14:
                greenHex.append("E");
                break;
            case 15:
                greenHex.append("F");
                break;
        }
        
        switch (green2nd){//if the second green digit equals the following cases, append the digit or letter following that case
            case 0:
                greenHex.append("0");
                break;
            case 1:
                greenHex.append("1");
                break;
            case 2:
                greenHex.append("2");
                break;
            case 3:
                greenHex.append("3");
                break;
            case 4:
                greenHex.append("4");
                break;
            case 5:
                greenHex.append("5");
                break;
            case 6:
                greenHex.append("6");
                break;
            case 7:
                greenHex.append("7");
                break;
            case 8:
                greenHex.append("8");
                break;
            case 9:
                greenHex.append("9");
                break;
            case 10:
                greenHex.append("A");
                break;
            case 11:
                greenHex.append("B");
                break;
            case 12:
                greenHex.append("C");
                break;
            case 13:
                greenHex.append("D");
                break;
            case 14:
                greenHex.append("E");
                break;
            case 15:
                greenHex.append("F");
                break;
        }
        
        StringBuilder blueHex=new StringBuilder();//create blueHex to be added upon
        
        int blue1st=b/16;//define first blue hex digit
        int blue2nd=b%16;//define second blue hex digit
        
        
        switch (blue1st){//if the first blue digit equals the following cases, append the digit or letter following that case
            case 0:
                blueHex.append("0");
                break;
            case 1:
                blueHex.append("1");
                break;
            case 2:
                blueHex.append("2");
                break;
            case 3:
                blueHex.append("3");
                break;
            case 4:
                blueHex.append("4");
                break;
            case 5:
                blueHex.append("5");
                break;
            case 6:
                blueHex.append("6");
                break;
            case 7:
                blueHex.append("7");
                break;
            case 8:
                blueHex.append("8");
                break;
            case 9:
                blueHex.append("9");
                break;
            case 10:
                blueHex.append("A");
                break;
            case 11:
                blueHex.append("B");
                break;
            case 12:
                blueHex.append("C");
                break;
            case 13:
                blueHex.append("D");
                break;
            case 14:
                blueHex.append("E");
                break;
            case 15:
                blueHex.append("F");
                break;
        }
        
        switch (blue2nd){//if the second blue digit equals the following cases, append the digit or letter following that case
            case 0:
                blueHex.append("0");
                break;
            case 1:
                blueHex.append("1");
                break;
            case 2:
                blueHex.append("2");
                break;
            case 3:
                blueHex.append("3");
                break;
            case 4:
                blueHex.append("4");
                break;
            case 5:
                blueHex.append("5");
                break;
            case 6:
                blueHex.append("6");
                break;
            case 7:
                blueHex.append("7");
                break;
            case 8:
                blueHex.append("8");
                break;
            case 9:
                blueHex.append("9");
                break;
            case 10:
                blueHex.append("A");
                break;
            case 11:
                blueHex.append("B");
                break;
            case 12:
                blueHex.append("C");
                break;
            case 13:
                blueHex.append("D");
                break;
            case 14:
                blueHex.append("E");
                break;
            case 15:
                blueHex.append("F");
                break;
        }
        
        
        
        System.out.print("Red= "+redHex+"\n");//print red in hexadecimal
        System.out.print("Green= "+greenHex+"\n");//print green in hexadecimal
        System.out.print("Blue= "+blueHex+"\n");//print blue in hexadecimal
        
        
        
    }
}