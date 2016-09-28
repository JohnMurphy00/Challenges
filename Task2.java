
package task.pkg2;
import java.util.Scanner;
public class Task2 {

    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner (System.in);
        
    System.out.println("What is your first number?");
    int FN = Integer.parseInt(Input.nextLine());
    System.out.println("What is your second number?");
    int SN = Integer.parseInt(Input.nextLine());
    System.out.println("The answer is " +FN/SN);
    
        
    }
    
}
