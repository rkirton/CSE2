///////////////////////////////////////////////////////
//Ryan Kirton
//hw12
//
//
//

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
    String answer="";
    do{
      System.out.print("Random input 10 ints [0-9]");
      num = randomInput();
      String out = "The original array is:";
      out += listArray(num);
      System.out.println(out);
 
      System.out.print("Enter the index ");
      index = scan.nextInt();
      newArray1 = delete(num,index);
      String out1="The output array is ";
      out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      System.out.println(out1);
 
      System.out.print("Enter the target value ");
      target = scan.nextInt();
      newArray2 = remove(num,target);
      String out2="The output array is ";
      out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      System.out.println(out2);
       
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static int[] randomInput(){//This creates an array with random digits
        int array1[] = new int [10];
        int rand;
        for(int i=0; i<10; i++){
            rand = (int)(Math.random()*10);
            array1[i] = rand;
        }
        return array1;
  }
  
  public static int[] delete(int list[], int pos){//this deletes one array member
      int length = 10;
      int array1[] = new int [length-1];
      
      for(int i=0; i<pos; i++){
          array1[i] = list[i];
      }
      for(int i=pos; i<length-1; i++){
          array1[i] = list[i+1];
      }
      return array1;
  }
  
  public static int[] remove(int list[], int target){//this removes all of a number from an array
      int len = list.length;//find original length
      int count = 0;
      
      for(int i=0; i<len; i++){//find instances of target
          if(list[i] == target){
              count++;
          }
      }
      
      int array1[] = new int[len-count];
      int skips = 0;
      
      for(int i=0; i<(len-count); i++){//transfer array members that aren't the target
          if(list[i] == target){
              i++;
              skips++;
          }
          else{
              array1[i] = list[i+skips];
          }
      }
      
      return array1;
      
  }
  
  
}
