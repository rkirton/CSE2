////////////////////////////////////////////
//Ryan Kirton
//hw03
//Bicycle
//
//This program should be able to take input from the user giving
//the number of seconds and counts for a bicylcle ride and be able
//to give the total ditance in miles, the total time in minutes
//and the average mph.
//

import java.util.Scanner; //create a new scanner

public class Bicycle{ //public class always required
    public static void main(String[] args)   { //main string always required
        Scanner myScanner; //define new Scanner as myScanner
        myScanner=new Scanner(System.in); //define scanner input
        
        System.out.print("Enter the number of seconds: "); //Print the statement
        int nSeconds=myScanner.nextInt(); //define nSeconds as the input given by user
        
        System.out.print("Enter the number of counts: "); //Print the statement
        int nCounts=myScanner.nextInt(); //define nCounts as the input given by user
        
        double wheelDiameter=27.0; //define wheel diameter
        double PI=3.14159; //define PI
        double feetPerMile=5280; //define feetpermile
        double inchesPerFoot=12; //define inches per foot
        double secondsPerMinute=60; //define seconds per minute
        double minutesPerHour=60; //define minutes per hour
        double totalDistance; //create variable total distance
        
        totalDistance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile; //create total distance equation
        
        totalDistance=(int)(totalDistance*100)/100.0;//limit the number of digits given for total distacne
        
        System.out.println("The distance was "+totalDistance+" miles and took "+nSeconds/secondsPerMinute+" minutes");
        //Print the distance and time taken
        
        double averageSpeed;//create variable average speed
        double totalTime;//create variable total time
        totalTime=nSeconds/secondsPerMinute/minutesPerHour;//create equation for total time using the seconds given earlier
        averageSpeed=totalDistance/totalTime;//create equation for average speed
        double cleanAverageSpeed; //create variable clean average speed
        cleanAverageSpeed=(int)(averageSpeed*1000)/1000.00;//limit the number of digits given for average speed
        
        
        System.out.println("The average mph was "+cleanAverageSpeed+"");//print the average speed
        
        
        
        
        
        
    }
}