import java.util.Scanner;

public class CountingOfPositiveNegativeAndZeroNumbers1{
  public static void main(String[] args){
   Scanner scr = new Scanner(System.in);

     System.out.print("Enter Your First Interger: ");
       int num1 = scr.nextInt();

      System.out.print("Enter Your Second Interger: "); 
       int num2 = scr.nextInt();


      System.out.print("Enter Your Third Interger: ");
       int num3 = scr.nextInt();

      System.out.print("Enter Your Forth Interger: ");
       int num4 = scr.nextInt();


      System.out.print("Enter Your Fifth Interger: ");
       int num5 = scr.nextInt();

      
      int totalPositive = 0;
      int totalNegative = 0;
      int totalZero     =0;

     if(num1>1){
        totalPositive=num1;
     }
     
     if(num2>1){
       totalPositive=num2;
     }
        if(num3>1){
        totalPositive=num3;
     }
       if(num4>1){
          totalPositive=num4;
     }
       if(num5>1){
         totalPositive=num5;
     }
       if(num1<1){
          totalNegative=num1;
     }
        if(num2<1){
       totalNegative=num2;
     }
         if(num3<1){
       totalNegative=num3;
     } 
        if(num4<1){
       totalNegative=num4;
     }
      
      if(num5<1){
       totalNegative=num5;
     }
       if(num1==0){
       totalZero=num1;
     }
       if(num2==0){
       totalZero=num2;
     }
         if(num3==0){
          totalZero=num3;
     } 
        if(num4==0){
       totalZero=num4;
     }
        if(num5==0){
       totalZero=num5;
     }

         System.out.printf("The total number of  positive Number is: %d%n ", totalPositive);
         System.out.printf("The total number of  Negative Number is: %d%n ", totalNegative);
          System.out.printf("The total number of  Zero Number is: %d%n ", totalZero);



  }



 }