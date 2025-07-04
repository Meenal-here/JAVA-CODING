import java.util.Scanner;
public class NumberGuessingGame
{
	public static void main(String... args)
	{
		Scanner input = new Scanner(System.in);
		while(true)
		{	
			System.out.println("ENTER A NUMBER TO GUESS THE ACTUAL NUMBER i.e. 1-100");
			int actualNumber = 78;
			int guessNumber = input.nextInt();
			
			if(guessNumber>=1 && guessNumber<=40)
			{
				System.out.println("Number is greater");
			}
			
			if(guessNumber>=41 && guessNumber<=70)
			{
				System.out.println("You're Close to guess the number");
			}
			
			if(guessNumber>=71 && guessNumber<=80)
			{
				if(guessNumber == 78)
				{
					System.out.println("Congrats, You GOT the Number");
					System.exit(0);
				}
				else
				{
					System.out.println("Almost got the number");
				}
			}
			if(guessNumber>=81 && guessNumber<=90)
			{
				System.out.println("You're Close to guess the number");
			}
			if(guessNumber>=91 && guessNumber<=100)
			{
				System.out.println("Smaller then this Guess");
			}
	    }
	}
	
}