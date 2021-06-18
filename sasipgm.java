import java.util.Scanner;
class Multiplication
{
   public static void main(String args[])
   {
      int p, q, r;
      System.out.println("Enter two integers for multiplication: ");
      Scanner sc = new Scanner(System.in);   
      p = sc.nextInt();    
      q = sc.nextInt();
      r = p * q;
      System.out.println("Multiplication of the integers = "+r);
   }
}