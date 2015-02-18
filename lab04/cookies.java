//////////////////////////////////////////////
//Ryan Kirton
//lab04
//Cookies
//
//
//
//


import java.util.Scanner; //create scanner

public class cookies{
    public static void main(String[] args)  {
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter the number of people: ");
        if (myScanner.hasNextInt()){
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        int totalPeople=myScanner.nextInt();
        
        System.out.print("Enter the number of cookies you are planning to buy: ");
        if (myScanner.hasNextInt()){
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        int totalCookies=myScanner.nextInt();
        
        System.out.print("How many cookies do you want each person to have? ");
        if (myScanner.hasNextInt()){
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
        int cookiesPerPerson=myScanner.nextInt();
        
        double a;
        a=totalPeople*cookiesPerPerson;
        
        double b;
        b=totalCookies/cookiesPerPerson;
        
        double c;
        c=totalCookies-a;
        
        double d;
        d=totalCookies-totalPeople
        
        if (d>=0){
        }
        else{
            System.out.print("You do not have enough cookies");
            return;
        }
        
        if ()
        
        
        
        
        
        
        
    }
}