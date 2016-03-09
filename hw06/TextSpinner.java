//////////////////////////////////////////////////////
//Ryan Kirton
//hw06
//TextSpinner
//
//This program should be able to create a cursor spinner.
//


public class TextSpinner{//public class
    public static void main(String[] args){//main method
        
        int a=1;//set a equal to 1
        
        while(a>0){//since a will always be greater than 0,
                    //this will run to infinity
            System.out.print("/");//these print statements print out
            System.out.print("\b");//each component of the spinner,
            System.out.print("-");//delete it, and then print the next one.
            System.out.print("\b");
            System.out.print("\\");
            System.out.print("\b");
            System.out.print("|");
            System.out.print("\b");
        }
        
        
        
        
        
        
        
    }
}