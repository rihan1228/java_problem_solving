// write a java program to check whether the number is =ve,-ve,,zero or special character
import java.util.Scanner;
class PosNeg
{
  public static void main(String[]args)
  {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
 int num=sc.nextInt();
 if(num>0)
 {
  System.out.println("Entered number is positive");
 }
 else if(num<0)
 {
  System.out.println("Entered number is negative");

 }
 else 
 {
  System.out.println("Entered number is zero");
 }
 

  }
}