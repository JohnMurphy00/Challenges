package task.pkg5;
import java.util.Scanner;
public class Task5 {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
        System.out.println("What is your test score?");
    int ts = Integer.parseInt(in.nextLine());
    
    if (ts>20){
        System.out.println("You will achieve an A");
    }
    
    if (ts>10 && ts<19){
        System.out.println("You will get a C");
        }
    
    if (ts<10) {
        System.out.println("You have failed the test");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
