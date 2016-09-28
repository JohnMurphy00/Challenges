package task.pkg11;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
            System.out.println("What number do you want to end at?");
        int end = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < end; i++) {
            System.out.println(i);
            
        }
       
    }
    
}
