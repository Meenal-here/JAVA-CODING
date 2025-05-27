import java.util.Scanner; 
public class Time
{
	int sec,min,hour;
	
	Time()
	{}
	
	Time(int hour,int min,int sec)
	{
		this.sec=sec;
		this.min=min;
		this.hour=hour;
	}
	
	void total(Time time1, Time time2)
	{
		int total_sec = time1.sec+ time2.sec;
		this.sec = total_sec%60;
		int total_min = time1.min+time2.min+(total_sec/60);
		this.min = total_min%60;
		int total_hour = time1.hour + time2.hour + (total_min/60);
		this.hour= total_hour;
	
	}
	void display()
	{
		System.out.println(hour+":"+min+":"+sec);
	}
	
	public static void main(String... args)
	{   Scanner myObj = new Scanner(System.in); 
		System.out.println("enter hours");
		int hours = myObj.nextInt();
		System.out.println("enter minutes");
		int minutes = myObj.nextInt();
		System.out.println("enter seconds");
		int seconds = myObj.nextInt();
		Time time1= new Time(hours,minutes,seconds);
		time1.display();
		System.out.println("enter hours");
		hours = myObj.nextInt();
		System.out.println("enter minutes");
		minutes = myObj.nextInt();
		System.out.println("enter seconds");
		seconds = myObj.nextInt();
		Time time2= new Time(hours,minutes,seconds);
		time2.display();
		Time time3=new Time();
		time3.total(time1,time2);
		System.out.println("Sum of both the times is");
		time3.display();		
	}
}
