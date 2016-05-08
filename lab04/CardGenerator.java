///////////////////////////////////////////////////////done
//Ryan Kirton
//lab04
//
//This will be able to generate a random number which will
//correspond to a random card.



public class CardGenerator{//public class
    public static void main(String[] args){//main method
        
        int rand = (int)((Math.random()*52)+1);//create random number
        String suit = "0";//create string for suit
        
        if(rand>0 && rand<=13){//these if statements determine suit based on range
            suit = "diamonds";
        }
        else if(rand>=14 && rand<=26){
            suit = "clubs";
        }
        else if(rand>=27 && rand<=39){
            suit = "hearts";
        }
        else if(rand>=40 && rand<=52){
            suit = "spades";
        }
        
        String num = "0";//create string for card num
        int rem = rand%13;//this finds the remainder, which tells the number card
        
        switch(rem){//this switch statement determines the number in the suit
            case 0:
                num = "K";
                break;
            case 1:
                num = "A";
                break;
            case 2:
                num = "2";
                break;
            case 3:
                num = "3";
                break;
            case 4:
                num = "4";
                break;
            case 5:
                num = "5";
                break;
            case 6:
                num = "6";
                break;
            case 7:
                num = "7";
                break;
            case 8:
                num = "8";
                break;
            case 9:
                num = "9";
                break;
            case 10:
                num = "10";
                break;
            case 11:
                num = "J";
                break;
            case 12:
                num = "Q";
                break;
        }
        
        System.out.println("You picked the "+(num)+" of "+(suit)+"");//print out the suit and number
        
        
        
        
        
    }
}