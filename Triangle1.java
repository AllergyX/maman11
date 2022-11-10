/**
 * The program will read 3 sides of a triangle and will calculate the perimeter and are of it.
 *
 * @Ori Berner - 315572560
 * 
 */
import java.util.Scanner;
public class Triangle1
{
 public static void main (String [] args)
 {
    Scanner scan = new Scanner (System.in);
    System.out.println ("This program calculates the area "
    + "and the perimeter of a given triangle. ");
    System.out.println ("Please enter the three lengths"
    + " of the triangle's sides");
    int a = scan.nextInt(); // variable for the side length
    int b = scan.nextInt();// variable for the side length
    int c = scan.nextInt();// variable for the side length
    int perimeter = a + b + c; // calculates the perimeter of the triangle
    double halfPeri = perimeter/2; //calculates the perimeter/2 according to heron's formula
    double area = Math.sqrt((halfPeri*(halfPeri-a)*(halfPeri-b)*(halfPeri-c))); // calculates the area of the triangle
    System.out.println("The lengths of the triangle sides are:" + a+"," + b+"," + c +"."); // prints the lengths of the triangle 
    System.out.println("The perimeter of the triangle is:" + perimeter); // prints the perimeter of the triangle
    System.out.println("The area of the triangle is:" + area); // prints the area of the triangle
} // end of method main
} //end of class Triangle1