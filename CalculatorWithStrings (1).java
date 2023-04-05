import java.util.Scanner;

public class Project_week_5 {
public static void main(String [] args){
double a, b, result = 0.0;
//Unnecessary for this example ==> char operator;
boolean error = false;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter two numbers: ");
a = scanner.nextDouble();
b = scanner.nextDouble();

System.out.print
  ("What operation (add, subtract, multiply, divide)? ");
String input = scanner.next();
//operator = input.charAt(0); 

if (input.compareTo("add") == 0)
		result = a + b;
else 
	if (input.compareTo("subtract") == 0)
			result = a - b;
	else 
		if (input.compareTo("multiply") == 0)
				result = a * b;
		else 
			if (input.compareTo("divide") == 0)
				{	if (b == 0.0)
					error = true;
				else
					result = a / b;
				}
				else
					error = true;

System.out.println();
if(error)
	System.out.println("Invalid operation");
else
	System.out.println("Result: " + result);

} // end main method
} // end class
