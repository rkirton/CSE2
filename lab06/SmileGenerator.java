/////////////////////////////////////////////////////////////////
//Ryan Kirton
//lab06
//SmileGenerator
//
//
//
//

public class SmileGenerator{
    public static void main(String[] args){
        
        
        for (int i=1;i<6;i++){
            System.out.print(":)");
        }
        
        System.out.print("\n");
        
        int w=1;
        while (w<6){
            System.out.print(":)");
            w++;
        }
        
        System.out.print("\n");
        
        int count=1;
        do{
            System.out.print(":)");
            count++;
        }while(count<6);
        
        System.out.print("\n");
        
        int r=(int)(math.random()*100)+1;
        
        while (r>0){
            System.out.print(":)");
            r--;
        }
        
        
        
        
        
        
        
        
    }
}