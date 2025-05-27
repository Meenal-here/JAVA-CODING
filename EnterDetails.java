import java.util.Scanner;
public class EnterValue
{
	public static void main(String... args)
	{
			
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your choice \n1.Add elements\n2.Display data");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				{
					System.out.println("enter more element");
				}
			case 2:
				{
					System.out.println("display element");
				}
			case 3:
				{
					System.out.println("search elements");
				}
		}
		
	}
}