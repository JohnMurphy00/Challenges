
package task.pkg8;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        
        //This gains the base details of what they want to do.
        Scanner in = new Scanner(System.in);
            System.out.println("What is your first number?");
        int fn = Integer.parseInt(in.nextLine());
            System.out.println("What is your second number?");
        int sn = Integer.parseInt(in.nextLine());
            System.out.println("Input which you would like to perform.");
            System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        String an = in.nextLine();
            
        //These are to check which operation they would like to perform.
        if(an.contains("Divide")){
            System.out.println(fn/sn);
        }
        
        if(an.contains("Multiply")){
            System.out.println(fn*sn);
        }
        
        if(an.contains("Add")){
            System.out.println(fn+sn);
        }
        
        if(an.contains("Subtract")){
            System.out.println(fn-sn);
        }
         
            
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
