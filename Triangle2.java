/**
 * The program will read 3 sides of a triangle and will say which kind of triangle it is.
 *
 * @Ori Berner - 315572560
 * 
 */

import java.util.Scanner;
public class Triangle2
{
 public static void main (String [] args)
 {
     Scanner scan = new Scanner (System.in);
     System.out.println ("This program is going to show you which kind of triangle is your triangle");
     System.out.println ("Please enter the three lengths"
     + " of the triangle's sides");
     int x = scan.nextInt(); // variable for the side length
     int y = scan.nextInt();// variable for the side length
     int z = scan.nextInt();// variable for the side length
      if (z+y>x && x+z>y && x+y>z) //condition that checks if the 3 numbers represent a triangle
      {
   
      if (x==y && x==z) // checking if its a equilateral triangle
       System.out.println("The numbers: " + x +"," + y + " and " + z + " represent an equilateral triangle");
       else
       if (x==y || x==z || y==z) // checking if its a isosceles triangle
       System.out.println("The numbers: " + x +"," + y + " and " + z + " isosceles triangle");
       else
       if ((x*x)+(y*y)==(z*z) || (x*x)+(z*z)==(y*y) || (y*y)+(z*z) == (x*x)) // checking if its a right-angle triangle
       System.out.println("The numbers: " + x +"," + y + " and " + z + " right-angle triangle");
       else
       {
       System.out.println("The numbers: " + x +"," + y + " and " + z + " represent a common triangle"); //if none of the conditions from above are wrong that mean it a common triangle
        }
        }
        else 
        {System.out.println("The numbers: " + x +"," + y + " and " + z + " cannot represent a triangle");}
} // end of method main
} //end of class Triangle2