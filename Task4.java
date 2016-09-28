package task.pkg4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
    

        Scanner in = new Scanner (System.in);
        System.out.println("What is your number? ");
        int FN = Integer.parseInt(in.nextLine());
        if(FN>100){
            System.out.println("The number is bigger than 100");
        }else{
            System.out.println("The number is smaller than 100");
        }
        
        
        
        
        
    }
}
