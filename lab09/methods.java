/////////////////////////////////////////////////////////done
//Ryan Kirton
//lab09
//
//methods
//This program will be able to generate random numbers
//which will correspond to different words to create 
//a sentence.


import java.util.Random;//create random number generator
public class methods{//create public class
    public static String adjictive(){//create method "adjective"
    
    Random randomGenerator = new Random();//define and name number generator
    int randomInt = randomGenerator.nextInt(10);//create int
    String adj=("");//create string
    switch (randomInt){//create switch statements, picking them based on the random number
        case 0: adj=("pink ");
        break;
        case 1: adj= ("blue ");
        break;
        case 2: adj= ("big ");
        break;
        case 3: adj=("small ");
        break;
        case 4: adj=("black ");
        break;
        case 5: adj=("collorful ");
        break;
        case 6: adj=("sticky ");
        break;
        case 7: adj=("dirty ");
        break;
        case 8: adj=("shiny ");
        break;
        case 9: adj=("flimsy ");
        break;
        }
    return adj;//return the value
    }//end method
    
    public static String subject(){//start method "subject"
    Random randomGenerator = new Random();//define and name number generator
    int randomInt = randomGenerator.nextInt(10);//create int
    String subj=("");//create string
    switch (randomInt){//create swtich statements
        case 0: subj=("The man ");
        break;
        case 1: subj=("I ");
        break;
        case 2: subj=("The woman ");
        break;
        case 3: subj=("The boy ");
        break;
        case 4: subj=("The girl ");
        break;
        case 5: subj=("The professor ");
        break;
        case 6: subj=("The assistant ");
        break;
        case 7: subj=("The teacher ");
        break;
        case 8: subj=("George Washington ");
        break;
        case 9: subj=("Steve Jobs ");
        break;
    }
    return subj;//return the value
    }//end method

    public static String verb(){//create method "verb"
    Random randomGenerator = new Random();//define and name random number generator
    int randomInt = randomGenerator.nextInt(10);//create random int
    String verb=("");//create string
    switch (randomInt){//create swithc statements
        case 0: verb=("set fire to ");
        break;
        case 1: verb=("broke ");
        break;
        case 2: verb=("threw ");
        break;
        case 3: verb=("tossed ");
        break;
        case 4: verb=("threw away ");
        break;
        case 5: verb=("invented ");
        break;
        case 6: verb=("shattered ");
        break;
        case 7: verb=("juggled ");
        break;
        case 8: verb=("licked ");
        break;
        case 9: verb=("ate ");
        break;
    }
    return verb;//return the value
    
        
    }//end method

public static String object(){//create method "object"
Random randomGenerator = new Random();//define and name random number generator
int randomInt = randomGenerator.nextInt(10);//create random int
String obj=("");//create string
switch (randomInt){//create switch statement
case 0: obj=("glasses ");
break;
case 1: obj=("ball ");
break;
case 2: obj=("pen ");
break;
case 3: obj=("car ");
break;
case 4: obj=("phone ");
break;
case 5: obj=("laptop ");
break;
case 6: obj=("book ");
break;
case 7: obj=("computer ");
break;
case 8: obj=("rock ");
break;
case 9: obj=("water bottle ");
break;
}
return obj;//return the value
}//end the method

public static void main (String[] args) {//create main method

    //look to each respective method for the values to be put in the sentence
    String subj=subject();
    String verb=verb();
    String verbTwo=verb();
    String adj=adjictive();
    String adjTwo=adjictive();
    String obj=object();
    String objTwo=object();
    System.out.print(subj+verb+"the "+adj+obj+"and "+verbTwo+"the "+adjTwo+objTwo);
    
    System.out.print("\n");
}
}