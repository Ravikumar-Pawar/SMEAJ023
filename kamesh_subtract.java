import java.util.Scanner;
public class Substract_Two_Num{
public static void main(String args[]){
//variable declaration 
int result,num1,num2;
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
System.out.println("Enter the first number  ");
num1=scan.nextInt();//read the first input 
System.out.println("Enter the second number  ");
num2=scan.nextInt();//read the second input
result=num2-num1;//calculate subtraction
System.out.println("Substraction of entered integer: "+result);
//display the result
}
}