package task.pkg17;
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner (System.in);
        System.out.println("What is your number?");
    int n1 = in.nextInt();
    int n2 = n1 + n1;
    int c = 0;
        System.out.print(n1 + ", " + n2);
    while (c<9){
        int n3 = n1 + n2;
        System.out.print(", " + n3);
        n1=n2;
        n2=n3;
        c = c+1;
        }
    
    
    }
    
}
