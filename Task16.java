package task.pkg16;
import java.util.Scanner;
public class Task16 {
public static void main(String[] args) {
      
    Scanner in = new Scanner(System.in);
        System.out.println("What is your first number?");
    int fn = in.nextInt();
        System.out.println("What is your second number?");
    int sn = in.nextInt();
        System.out.println(fn + " To the power of " + sn + "=" + Math.pow(fn, sn));
   
    }
    
}
