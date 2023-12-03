public class LoanApplicationSchedule{
	private int loanAmount;
	private double interestRate;
	private int year;


public  LoanApplicationSchedule(){

}

public void setLoanAmount(int loanAmount){
 this.loanAmount = loanAmount;

}

public int getLoanAmount(){
  return loanAmount;
}

public void setYear(int year){
 this.year = 12*year;
}

public int getYear(){
	return year;
}

public void setInterestRate(double interestRate){
this.interestRate = interestRate/1200.0;;

}

public double getInterestRate(){
 	return interestRate;
}

public double getMonthPayment(){
	double first = Math.pow(1+getInterestRate(),getYear()) - 1;
	double second = getInterestRate()*(Math.pow(1+getInterestRate(),getYear()));
	double third = first/second;
	double monthPayment = getLoanAmount()/third;
	return monthPayment;
}

 	double totalPayment;
	

public  void totalPaymentScheme(){
		double balance = getLoanAmount();
		 totalPayment = getLoanAmount();
       
	for(int count = 1; count<=getYear();count++){
		 double interestAmount = balance*getInterestRate();
		 
		double principal = getMonthPayment() - interestAmount; 
		 balance = balance - principal;
		
		totalPayment += interestAmount;
		
	System.out.printf("%4d\t%8.2f\t%8.2f\t%8.2f\n",count,interestAmount,principal,balance);	
	
	}	
	
	
	

}
	public void totalPayment(){
		double totalPayment = getMonthPayment()*12;
		System.out.printf("Total Payment is %.2f\n",totalPayment);

	}
	

}







