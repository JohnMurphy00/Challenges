package task.pkg15;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner (System.in);
        System.out.println("What do you want to divide by?");
    int d = in.nextInt();
    int n = 0;
        while (n < 100){
            if (n % d != 0){
                System.out.println(n + " does not divide by " + d);
            }else{
                System.out.println(n + "/" + d + "=" + (n/d));
            } 
            n++;
        }
    }
}
