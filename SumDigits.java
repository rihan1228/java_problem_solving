// java code to find the sum of all the digits present in a given number
import java.util.Scanner;
class SumDigits
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    int sum=0;

    while(num>0)
    {
      int lastdig=num%10;
      sum=sum+lastdig;
      num=num/10;
    }
  System.out.println("sum of all digits of a  given number is:"+sum);
  }
    
}