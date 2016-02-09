///////////////////////////////////////////////////////////////
//Ryan Kirton
//lab05
//SpaceExploration
//
//

public class SpaceExploration{//public class
    public static void main(String[] args){//main method
        
        
        int year = (int)(Math.random()*10+2000);//create random number
        
        System.out.println("Timeline of space from 2000 to "+year);//print the statement
        
        switch (year){//use switch statements
            case 2010://different cases based on what the random nuber is
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
   	        case 2009:
   	        case 2008:   	        
   	            System.out.println("2008: Kepler launched to study deep space");
            case 2007:
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005: Spacecraft collies with comet");
            case 2004:
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
   	        break;
        }
        
        
    }//end main method
}//end public class