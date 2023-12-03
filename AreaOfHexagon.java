import java.util.Scanner;

public class AreaOfHexagon{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

   System.out.print("Enter the side of  hexagon(as all side are equal): ");
      double side = input.nextDouble();

     double squareRoot = Math.pow(3,0.5);
      double threeProductSquareRoot = 3*squareRoot;

        double sideSquare = side*side;
        
     double area =(threeProductSquareRoot/2)*sideSquare;

     System.out.print("The Area of the Hexagon is: "+ area);          




   }






}