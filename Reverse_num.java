import java.util.Scanner;
class Reverse_num
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    int rev=0;

    while(num>0)
    {
      int lastdig=num%10;
      rev=rev*10+lastdig;
      num=num/10;
    }
  System.out.println("reversed number is:"+rev);
  }
}