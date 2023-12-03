import java.util.Scanner;

public class AverageClass{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 1;

while(gradeCounter<=10){
   System.out.println("ENTER YOUR GRADE: ");
        int grade = input.nextInt();
   
      total= total + grade;
      gradeCounter = gradeCounter+1;
}
       int average = total/gradeCounter;
System.out.print("the total grade of the class is: \n"+ total);
System.out.print("the Average Score of the Class is: "+ average);
  

  }





}