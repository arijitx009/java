import java.util.Scanner;
public class StringSearch 
{
	public static void main(String args[])
	{
		int i=0,flag=0;
		String search;
		String str[]= {"Abhirup","Arijit","Kaka","Ronaldo","Messi","Dhoni","Virat"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to search");
		search=sc.next();
		for(i=0;i<str.length;i++)
		{
			if(str[i].equals(search))
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("String found at position"  +(i+1));
		}
		else {
			System.out.println("Not Found");
		}
}
}
