package task.pkg18;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
    int d = 3;
    int e = 5;
    int t = 0;
    int n = 0;
    int x=0;
    int y =0;
    
        while (n < 1000){
            if (n % d == 0){
                y=n/d;
                System.out.println(y);
                t=t+y;
            }
            
            //-----------------
            
            if (n % e == 0){
                x = n/e;
                System.out.println(x);
                t=t+x;
            }
            
            //-----------------
            
            if (x == y){
            t=t-x;    
            }
            
            //-----------------
            
            n++;
            
            }
        
        System.out.println(t);
            
        
    }
    
}
