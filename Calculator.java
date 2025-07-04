import java.util.Scanner;

public class Calculator
{
	
	static public void main(String... args)
	{
		double result = 0.0;
		Scanner input =  new Scanner(System.in);
		while(true)
		{		
			System.out.println("Enter your operation i.e num1 + num2 ...available operations- +,-,/,*");
			double number1 = input.nextDouble();
			char operation = input.next().charAt(0);
			double number2 = input.nextDouble();
			
			switch(operation)
			{
				case '+':
				{
                    
					result = number1 + number2;
					System.out.println("result = " + result);
					break;
				}
				case '-':
				{
					result = number1 - number2;
					System.out.println("result = " + result);
					break;
				}
				case '/':
				{
					result = number1 / number2;
					System.out.println("result = " + result);
					break;
				}
				case '*':
				{
					result = number1 * number2;
					System.out.println("result = " + result);
					break;
				}
				default:
				{
					System.out.println("INVALID OPERATION");
					System.exit(0);
				}
                input.close();
			}
		}
		
		
	}
}