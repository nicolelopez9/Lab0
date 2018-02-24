import java.util.Scanner;
class CircleDemo{
   public static void main(String args[]){

      static Scanner sc = new Scanner(System.in);

      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble();

      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
   }
}
