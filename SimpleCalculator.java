// java code for simplecalculator

import java.util.Scanner;
class SimpleCalculator
{
  public static void main(String[]args)
  {Scanner sc=new Scanner(System.in);
  System.out.println("Enter one number:");
    int num1=sc.nextInt();
    System.out.println("Enter another number:");
    int num2=sc.nextInt();
    System.out.println("Press + for addition");
    System.out.println("Press - for subtraction");
    System.out.println("Press * for division");
    System.out.println("Press / for multiplication");
      char choice = sc.next().charAt(0);
    switch(choice)
    {
      case '+':
      {
        System.out.println("addition of"+num1+" and "+num2+" is:"+(num1+num2));
        break;
      }
      case '-':
      {
        System.out.println("subtraction of "+num1+" and "+num2+" is:"+(num1-num2));
        break;

      }
      case '/':
      {
        System.out.println("division of "+num1+" and "+num2+" is: "+(num1/num2));
        break;

      }
      case '*':
      {
        System.out.println("multiplication of "+num1+" and "+num2+" is: "+(num1*num2));

      }
      default:
        {
          System.out.println("enter  operator properly");
        }
    }

  }
}