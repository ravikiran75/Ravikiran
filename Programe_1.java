import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the numbers");
	Double num1=scan.nextDouble();
	Double num2=scan.nextDouble();
	System.out.println("Enter the operator (+,-,*,/)"+"To Performe Addition, Subtraction,Multiplication,Division");
	String a=scan.next();
	Double result=0.0;
	switch(a){
	case "+" :  Addition.add(num1,num2);
	                                  break;
	case "-":  Subtraction.sub(num1,num2);
                                       break;
	case "*":  Multiplication.mul(num1,num2);
                                         break;
	case "/": Division.div(num1,num2);
                                      break;
	default :
		System.out.println("Invalid Operation you have Entered");
	}
}
}
class Addition{
	static void add(double a,double b){
		double result=a+b;
		System.out.println("The Addition of Two Numbers is :"+result);
		
	}
}
class Subtraction{
	static void sub(double a,double b){
		double result=a-b;
		System.out.println("The Subtraction of Two Numbers is :"+result);
		
	}
}
class Multiplication{
	static void mul(double a,double b){
		double result=a*b;
		System.out.println("The Muliplication of Two Numbers is :"+result);
		
	}
}
class Division{
	static void div(double a,double b){
		double result=a/b;
		System.out.println("The Division of Two Numbers is :"+result);
		
	}
}
