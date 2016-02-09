//////////////////////////////////////////////
//Ryan Kirton
//lab04
//Cookiess

import java.util.Scanner;//create scanner

public class cookies{
    // main method required for every Java program
   	public static void main(String[] args) {
    Scanner myScanner = new Scanner( System.in );
    System.out.print("Enter the number of people who will attend: ");//print
    int people = myScanner.nextInt();//accept user input


    System.out.print("Enter the number of cookies you want: ");//print
    int cookies=myScanner.nextInt();//user input



    System.out.print("Enter the number of cookies per person: ");//print
    int cookiesPerPerson=myScanner.nextInt();//user input


    if(cookiesPerPerson<0){//if statement
        System.out.println("There is an invalid number of cookies");//print
        return;
    }

    if(people*cookiesPerPerson<cookies){//if statement
        System.out.println("You wont have enough cookies");//print
    }//end if
    else if(cookies%people==0){//else if
        System.out.println("You have enough cookies and they will be devided evenly");//print
    }//end else if
    else{//else statement
        System.out.println("you will have enough cookies but they won't be devided evenly");//print
    }//end else


}  //end of main method   
} //end of class