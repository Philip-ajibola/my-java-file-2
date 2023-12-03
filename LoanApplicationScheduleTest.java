import java.util.Scanner;

public class LoanApplicationScheduleTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		LoanApplicationSchedule loan = new LoanApplicationSchedule();

	System.out.print("Enter The Amount You Want To Borrow \n");
		int amount = input.nextInt();
		loan.setLoanAmount(amount);

	System.out.print("Enter How Many Years You Want To Use To Pay Your Loan \n");
		int year = input.nextInt();
		loan.setYear(year);

	System.out.print("Enter The Interest Rate\n");
		double interestRate = input.nextDouble();
		loan.setInterestRate(interestRate);
		

	System.out.printf("The Monthly Payment is %.2f\n",loan.getMonthPayment());
	    loan.totalPayment();

	
	System.out.print("Month\tinterest\tprincipal\tbalance\n");
		loan.totalPaymentScheme();
		


	}




}