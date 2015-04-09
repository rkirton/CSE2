/////////////////////////////////////////////////////////////////
//Ryan Kirton
//hw08
//HW8
//
//This program should be able to excecute a game, prompting the user
//to make a choice at every point in the game.
//
//
//

import java.util.Scanner;//initialize a scanner

public class HW8{//create a class
     public static void giant() {//create the method "giant"
        System.out.println("                                 ---------                    ");//print
        System.out.println("                                |  /    \\|                   ");//print
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");//print
        System.out.println("                           H     -----------   H              ");//print
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");//print
        System.out.println("                           H    HHHHHHHHHHH    H                      ");//print
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");//print
        System.out.println("                                HHHHHHHHHHH                   ");//print
        System.out.println("                                HHH     HHH                   ");//print
        System.out.println("                               HHH       HHH                   ");//print
    }


     public static void cave() {//create the method "cave"
        System.out.println("                              *****   * * * * * * * *        ");//print
        System.out.println("                         ***         ***                      ");//print
        System.out.println("                      ***               ***                   ");//print
        System.out.println("                 |    ***               ***                   ");//print
        System.out.println("                 |    ***               ***                   ");//print
        System.out.println("             O __|__  ***               ***                   ");//print
        System.out.println("           ******l    ***               ***                   ");//print
        System.out.println("            * *       ***               ***                   ");//print
        System.out.println("           *   *      ********************* * * * * * *       ");//print
    }

    public static void box(){//create the method "box"
       System.out.println("                      *********************     *********************    *********************             ");//print
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");//print
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");//print
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");//print
        System.out.println("                     *********************     *********************    *********************               ");//print
    }

    public static String getInput(Scanner scan, String string){//create the method "getInput"
        
        String cC = scan.next();
        if (cC.equals("C") || cC.equals("c")){//initialize an if statemnt
            System.out.println("");//print
            return ("Keep Playing");
        }
        else{//in any other case
            System.out.println("Yea right LOSER!");//print
            System.exit(0);//close the program
            
        }
        
    }
    
    public static String getInput(Scanner scan, String string, int trial){//create the method "getInput"
        
        int hits = 0;//initialize int
        String aAeE = scan.next();//define aAeE as the next input
        while (hits<=10){//initialize while loop
            if (aAeE.equals("A") || aAeE.equals("a")){//start an if statement
                int hitOrMiss = (int)(Math.random()*2);//initialize hitOrMiss int
                if (hitOrMiss==1){//initialize if statement
                    System.out.println("Critical Hit!");//print the statment
                    hits++;//add one to trial
                }
                else{//start else statement
                    System.out.println("Gosh! How can you miss it!");//print the statment
                }
            }    
            if (aAeE.equals("E") || aAeE.equals("e")){//start if statement
                int escapeAttempt = (int)(((Math.random())*10)+1);//initialize int
                if (escapeAttempt==10){//initialize if statement
                    System.out.println("You successfully escaped!");//print the statment
                    System.exit(0);//close the program
                }
                else{//initialize else statement
                    System.out.println("Escape Failed!");//print the statment
                }
            
            }
            else{//initialize else statement
                System.out.println("Executed by the GIANT! Game Over!");//print the statment
            }
        }
        
        if (hits==10){//initialize if statement
            return("Congratulations! You SURVIVED! Get your REWARD!");//print the statment
        }
                
    }
    
    public static String getInput(Scanner scan){//start new method
        
        int prize = scan.nextInt();//initialize int
        switch (prize){//initialize swithc statements
            case 1: System.out.println("You win $1!");//print the statment
            case 2: System.out.println("You win $5!");//print the statment
            case 3: System.out.println("You win $10000000!");//print the statment
            default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");//print the statment
        }
        System.exit(0);//close the program
    }
    
    
    
}