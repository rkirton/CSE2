//////////////////////////////////////////////
//Ryan Kirton
//hw09
//Games
//
//This program should be able to prompt the user to pick
//one of three games.  Each game is a separate method.  If 
//user inputs something that isn't a game name,
//it automatically exits the program.
//

import java.util.Scanner;//create scanner

public class Games{//public class
    public static void main(String[] args){//main method
        
        Scanner myScanner = new Scanner(System.in);//define and name scanner
        
        System.out.println("Welcome to Ryan's game center");
        System.out.println("Please choose a game by entering one of the following:");
        System.out.println("guessTheBox, spinTheWheel, scrambler");
        
        //strings for comparison to user input
        String first = "guessTheBox";
        String second = "spinTheWheel";
        String third = "scrambler";
        //take user input
        String choice = myScanner.next();
        //check input against strings
        if(choice.equals(first)){
            guessTheBox();//go to first game
        }
        else if(choice.equals(second)){
            spinTheWheel();//go to second game
        }
        else if(choice.equals(third)){
            scrambler();//go to third game
        }
        else{//if none were entered, exit the program
            System.out.println("Not a valid input. Shutting down.");
            System.exit(0);
        }
    
        
        
    }
    
    public static void guessTheBox(){//method for first game
        Scanner myScanner = new Scanner(System.in);
        int box = (int)(Math.random()*3+1);//create a random number for the correct box
        
        System.out.println("Please choose box 1,2 or 3.");
        
        boolean badInput1 = true;
        int goodA = 0;
        //this while loop checks for good input
        while(badInput1){
            if(myScanner.hasNextInt()){
                goodA = myScanner.nextInt();
                if(goodA<0){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else if(goodA<1 || goodA>3){
                    System.out.println("Please enter an int within the range.");
                    myScanner.nextLine();
                }
                else{
                    badInput1 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        if(goodA == box){//If the good user input is equal to the random box number they win
            System.out.println("Congratulations! You picked correctly! You win!");
        }
        else{//otherwise they lose
            System.out.println("Sorry wrong box it was actually "+(box)+" better luck next time.");
        }
        
        return;//exit the method
        
    }
    
    public static void spinTheWheel(){//method for second game
        Scanner myScanner = new Scanner(System.in);
        int wheel = (int)(Math.random()*5)+1;//random int for wheel number
        int randColor = (int)(Math.random()*2);//random int for wheel color
        String color = "0";
        switch(randColor){//based on the random number set the color
            case 0:
                color = "red";
                break;
            case 1:
                color = "black";
                break;
        }
        
        
        
        System.out.println("Please enter red or black"); 
        //strings for comparison to user input
        String choice1 = "red";
        String choice1a = "Red";
        String choice2 = "black";
        String choice2a = "Black";
        
        boolean badInputA = true;
        String goodB = "0";
        //this while loop checks for good input
        while(badInputA){
            goodB = myScanner.next();
            if(goodB.equals(choice1)){
                badInputA = false;
            }
            else if(goodB.equals(choice2)){
                badInputA = false;
            }
            else if(goodB.equals(choice1a)){
                goodB = "red";
                badInputA = false;
            }
            else if(goodB.equals(choice2a)){
                goodB = "black";
                badInputA = false;
            }
            else{
                System.out.println("Bad input please try again.");
            }
        }
        String colorChoice = goodB;
        
        boolean rightColor = false;
        if(colorChoice.equals(color)){//if user input matches random color, make "rightcolor" true
            rightColor = true;
        }
        
        
        
        
        
        System.out.println("Please enter an int between 1 and 5");
        boolean badInput1 = true;
        int goodA = 0;
        //this while loop checks for good input
        while(badInput1){
            if(myScanner.hasNextInt()){
                goodA = myScanner.nextInt();
                if(goodA<0){
                    System.out.println("Not a positive integer.  Try again.");
                    myScanner.nextLine();
                }
                else if(goodA<1 || goodA>5){
                    System.out.println("Please enter an int within the range.");
                    myScanner.nextLine();
                }
                else{
                    badInput1 = false;
                    break;
                    }
            }
            else{
                System.out.println("Not an int.  Try again.");
                myScanner.nextLine();
            }
        }
        
        boolean rightNum = false;
        if(goodA == wheel){//if user input matches random number, "rightnum" is true
            rightNum = true;
        }
        
        if(rightNum && rightColor){//if both rightnum and rightcolor are true, the user wins
            System.out.println("Congratulations! You guessed correctly!");
        }
        else{//otherwise the user loses
            System.out.println("Sorry you lost it was actually "+(color)+""+(wheel)+" please try again later.");
        }
        
        
        return;//exit the method
        
    }
    
    
    public static void scrambler(){//method for third game
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a word to be scrambled:" );
        String userWord = myScanner.next();//take user word
        
        int nLetters = userWord.length();//count letters in word
        
        char[] mixer = userWord.toCharArray();//create char array to store the word
        
        
        
        for(int i=0; i<nLetters-1; i++){//for loop to mix letters
            //random number to randomly mix letters
            int j = (int)(Math.random()*(nLetters));
            
            //swap two letters
            char temp = mixer[i];
            mixer[i] = mixer[j];
            mixer[j] = temp;
            
            
        }
        
        //print out scrambled word
        System.out.println("The word is: "+ new String(mixer));
        
        
        
        
        
        
        return;//exit the method
        
    }
    
    
    
    
}