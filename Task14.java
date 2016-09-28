package task.pkg14;
import java.util.Scanner;
import java.util.Random;
public class Task14 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    Random rn = new Random();
    int r = rn.nextInt(100)+1;
        System.out.println("Guess the Number Between 1 and 100 : ");
   
    
    boolean loop = true;
    while (loop == true){
    int g = in.nextInt();
    if ( g < r){
        System.out.println("Too Small");
    }
    
    if (g > r){
        System.out.println("Too Big");
    }
    
    if (g == r){
        System.out.println("You Guessed Correct");
        break;
    }
    
         }
        
    }
    
}
