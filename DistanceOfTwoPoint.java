import java.util.Scanner;

public class DistanceOfTwoPoint{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in );

    System.out.print("Enter The first two point x1 and y1: ");
         double x1 = input.nextDouble();
         double y1  = input.nextDouble();
   System.out.print("Enter The Seconnds Points x2 and y2: ");
          double x2 = input.nextDouble();
          double y2 = input.nextDouble();
    
         double pointx = (x2 - x1);
         double pointy = (y2 - y1);

         double pointxSquare = (pointx*pointx);
         double pointySquare = (pointy*pointy);
      
        double sumOfPointSquare = pointxSquare + pointySquare;

        System.out.print("The Distance Between The Two Points is: "+ Math.pow(sumOfPointSquare,0.5));



   } 


}