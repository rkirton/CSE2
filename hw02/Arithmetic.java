///////////////////////////////////////
//Ryan Kirton
//hw02
//Arithmetic
//
//This program should be able to take the number of items input with
//their price and calculate the total cost of each item with tax
//and also the grand total of all the items together.
//

public class Arithmetic{
    public static void main (String[] args){
        
        //initialize variables for the number and cost of each item
        int numPants = 3;
        double pantsPrice$ = 34.98;
        int numShirts = 2;
        double shirtPrice$ = 24.99;
        int numBelts = 1;
        double beltCost$ = 33.99;
        double paSalesTax = 0.06;
        
        //print the number and cost of each item
        System.out.println("There were "+(numPants)+" pairs of pants purchased at "+(pantsPrice$)+" per pair");
        System.out.println("There were "+(numShirts)+" shirts purchased at "+(shirtPrice$)+" per shirt");
        System.out.println("There were "+(numBelts)+" belts purchased at "+(beltCost$)+" per belt");
        
        
        //calculate pants cost
        double origPantsCost$= numPants*pantsPrice$;
        double taxPants$ = origPantsCost$*paSalesTax;
        double totalPants$ = taxPants$ + origPantsCost$;
        taxPants$ = (int)(taxPants$*100)/100.0;
        //print pants cost
        System.out.println("Subtotal pants cost is "+(origPantsCost$)+" with a tax of "+(taxPants$)+" ");
        
        //calculate shirts cost
        double origShirtCost$= numShirts*shirtPrice$;
        double taxShirts$ = origShirtCost$*paSalesTax;
        double totalShirts$ = taxShirts$ + origShirtCost$;
        taxShirts$ = (int)(taxShirts$*100)/100.0;
        //print shirts cost
        System.out.println("Subtotal shirts cost is "+(origShirtCost$)+" with a tax of "+(taxShirts$)+" ");
        //calculate belts cost
        double origBeltCost$= numBelts*beltCost$;
        double taxBelts$ = origBeltCost$*paSalesTax;
        double totalBelts$ = taxBelts$ + origBeltCost$;
        taxBelts$ = (int)(taxBelts$*100)/100.0;
        //print belts cost
        System.out.println("Subtotal belts cost is "+(origBeltCost$)+" with a tax of "+(taxBelts$)+" ");
        
        //calculate total costs
        double origTotal$ = origBeltCost$ + origPantsCost$ + origShirtCost$;
        double taxTotal$ = taxBelts$ + taxPants$ + taxShirts$;
        double totalCost$ = totalBelts$ + totalPants$ + totalShirts$;
        //limit decimal point
        origTotal$ = (int)(origTotal$*100)/100.0;
        taxTotal$ = (int)(taxTotal$*100)/100.0;
        totalCost$ = (int)(totalCost$*100)/100.0;
        //print total costs
        System.out.println("The total cost before tax was "+(origTotal$)+" ");
        System.out.println("The total tax was "+(taxTotal$)+" ");
        System.out.println("The grand total was "+(totalCost$)+" ");
        
        
    }
}//end of program