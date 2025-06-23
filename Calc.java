import java.util.Scanner;
 public class Calc {
 public static void main(string[] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter first number: ");
  int a =sc.nextInt();
  
  System.out.println("Enter second number: ");
  int b = sc.nextInt();
   
   int sum=a+b;
   System.out.println("Addition: " +sum);

  int product=a*b;
 System.out.println("Multiplication:" +product);
}

}
