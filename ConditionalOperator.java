import java.util.Scanner;

public class ConditionalOperator{
     public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
     
       System.out.print(" Enter your Score: ");
            int score = input.nextInt();
   
      System.out.print(score>=60 ? "PASSED":"FAILED");
   
     }


}