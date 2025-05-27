 public class MyProgram{

	public static void main(String[] args)
	{
		System.out.println("length of arguments= "+args.length);
		for(int i=0;i<args.length;i++)
		{
			int store=0;
			for(int j=0;j<args[i].length();j++)
			{
				char ch=args[i].charAt(j);
				switch(ch){
				
				case 'a':{
					store++;
					break;}
				case 'e':{
					store++;
					break;}
				case 'i':{
					store++;
					break;}
				case 'o':{
					store++;
					break;}
				case 'u':{
					store++;
					break;}
				case 'A':{
					store++;
					break;}
				case 'E':{
					store++;
					break;}
				case 'I':{
					store++;
					break;}
				case 'O':{
					store++;
					break;}
				case 'U':{
					store++;
					break;}
				
			}
			
		}
		System.out.println(args[i]+"\twords= "+args[i].length()+"\tvowels="+store);
	}
 }
 }
 



