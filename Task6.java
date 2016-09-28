
package task.pkg6;
import java.util.Scanner;
public class Task6 {
public static void main(String[] args) {
    
    Scanner in = new Scanner (System.in);
        System.out.println("What is the height of the rectangle?");
    int h = Integer.parseInt(in.nextLine());
        System.out.println("What is the width?");
    int w = Integer.parseInt(in.nextLine());
        System.out.println("The area is " + h*w);
    
       
    }
    
}
