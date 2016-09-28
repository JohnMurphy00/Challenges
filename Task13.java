package task.pkg13;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    boolean answer = true;
    while(answer = true){
        
    System.out.println("What is your first number?");
    String fn = in.nextLine();
    int nfn = Integer.parseInt(fn);
        
    System.out.println("What is your second number?");
    String sn = in.nextLine();
    int nsn = Integer.parseInt(sn);
    
    if (fn == "stop"){
        break;
    }
        
    if (sn == "stop"){
        break;
    }
    
        System.out.println((nfn+nsn));
            
            
            
    }
  } 
}
