/////////////////////////////////////
//Ryan Kirton
//lab02
//Cyclometer
//
//Given the time elapsed and number of front wheel rotations
//recorded by a cyclometer, this program should be able to 
//print the number of minutes for each trip, print the number
//of counts for each trip, print the distance in miles, and
//print the distance of the two trips combined.

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args)  {
     
     //input data
     int secsTrip1=480;  //input seconds for trip 1
     int secsTrip2=3220;  // input seconds for trip 2
     int countsTrip1=1561;  //input counts for trip 1
     int countsTrip2=9037;  //input counts for trip 2
     
     double wheelDiameter=27.0; //input wheel diameter
     double PI=3.14159; //input pi
     double feetPerMile=5280; //input feet per mile
     double inchesPerFoot=12; //input inches per foot
     double secondsPerMinute=60; //input seconds per minute
     double distanceTrip1, distanceTrip2, totalDistance; //crete variables
     
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
    
     System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
    
     
    //run the calculations; store the values.  Document
    //your calculations here.  What are you calculating?
    //
    //
    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI)
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance = distanceTrip2 + distanceTrip1;
    
    //print out the output data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    
     
        
    } //end of main method
    
} //end of class