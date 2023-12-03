import java.util.Scanner;

public class SeperationOfIntergers1{
public static void main(String[] args){
     Scanner scr = new Scanner(System.in);

  System.out.println("Enter A Number from 0 to 10000");
    int userInput = scr.nextInt();
 
    int firstDigit = userInput/10000;
    int theRemainder = userInput%10000;
    int  secondDigit = theRemainder/1000;
    int  theRemainder2 = theRemainder%1000;
    int thirdDigit = theRemainder2/100;
    int theRemainder3 = theRemainder2%100;
    int forthDigit = theRemainder3/10;
    int theRemainder4 = theRemainder3%10;
    int fifthDigit = theRemainder4%10;
     

    int  firstDigit1 = userInput/1000;
    int  remainder1 = userInput%1000;
    int secondDigit1 = remainder1/100;
    int remainder11 = remainder1%100;
    int thirdDigit1 = remainder11/10;
    int remainder12 = remainder11%10;
    int forthDigit1 = remainder12%10;

     int firstDigit2 = userInput/100;
    int remainder2 = userInput%100;
    int secondDigit2 = remainder2/10;
    int remainder21 = remainder2%10;
    int thirdDigit2 = remainder21%10;

     int firstDigit3 = userInput/10;
    int remainder3 = userInput%10;
    int secondDigit3 = remainder3%10;
  

     int firstDigit4 = remainder3%10;



    if (userInput>10000){
       System.out.print("INVALID NUMBER");
        }
       if(userInput==10000){
      System.out.printf("%d  %d  %d  %d  %d%n",fifthDigit,forthDigit,thirdDigit,secondDigit,firstDigit);          
    }
        
    if (userInput<10000){
      System.out.printf(" %d  %d  %d  %d%n",forthDigit1,thirdDigit1,secondDigit1,firstDigit1);          
    }

      
}



}