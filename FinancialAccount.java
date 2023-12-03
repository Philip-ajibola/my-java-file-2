import java.util.Scanner;

public class FinancialAccount{
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.print("Enter the monthly saving amount: ");
         int amount = input.nextInt();

      double monthlyInterestRate =5/1200.0;
      double monthlyInterest = amount*(1+monthlyInterestRate);
      double secondMonthInterest = (amount + monthlyInterest)*(1+monthlyInterestRate);
      double thirdMonthInterest = (amount + secondMonthInterest)*(1+monthlyInterestRate);
      double forthMonthInterest = (amount + thirdMonthInterest)*(1+monthlyInterestRate);
      double fifthMonthInterest = (amount + forthMonthInterest)*(1+monthlyInterestRate);
      double sixthMonthInterest = (amount + fifthMonthInterest)*(1+monthlyInterestRate);

    System.out.print("After six month, the account value is $"+sixthMonthInterest);

   



  }




}