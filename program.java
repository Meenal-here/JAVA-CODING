 public class program{

	public static void main(String[] args)
	{
		System.out.println("length of arguments= "+args.length);
		for(int i=0;i<args.length;i++)
		{
			int store=0;
			for(int j=0;j<args[i].length();j++)
			{
				char ch=args[i].charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					store++;
				}	
			}
			System.out.println(args[i]+"\twords= "+args[i].length()+"\tvowels="+store);
		}
	}
 }
 



