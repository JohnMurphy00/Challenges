package task.pkg12;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        
        //What letter
        //input letter
        //how many times
        //print letter number of times
        
        Scanner in = new Scanner(System.in);
            System.out.println("What letter do you wish to use?");
        String l = in.nextLine();
            System.out.println("How many times do you want it printed?");
        int t = in.nextInt();
        
        while (t > 0){
            System.out.print(l);
            t--;
        }
        
        
        }
        
    }
    

