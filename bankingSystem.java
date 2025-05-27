import java.util.Scanner;

public class bankingSystem
{
	int balance = 500;

	void deposit(int amount)
	{
		this.balance = balance+amount;
	}

	void withdraw(int amount)
	{
		if(balance-amount<500)
		{
			System.out.println("YOUR BALANCE IS LOW (MINIMUM 500)");
		}
		else
		{
			this.balance = balance-amount;
		}
	}
	void display()
	{
		System.out.println("YOUR BANK BALANCE IS "+balance);
	}
	public static void main(String... args)
	{
		Scanner obj = new Scanner(System.in);
		bankingSystem user1= new bankingSystem();
		while(true)
		{	System.out.println("enter your choice\n1.DEPOSIT AMOUNT\n2.WITHDRAW AMOUNT\n3.EXIT");
			int choice = obj.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("enter amount= ");
					int amount = obj.nextInt();
					user1.deposit(amount);
					user1.display();
					break;
				}

				case 2:
				{
					System.out.println("enter amount= ");
					int amount = obj.nextInt();
					user1.withdraw(amount);
					user1.display();
					break;
				}

				case 3:
				{
					System.out.println("YOU'RE EXITTING");
					System.exit(0);
				}
			}
		}

	}
}