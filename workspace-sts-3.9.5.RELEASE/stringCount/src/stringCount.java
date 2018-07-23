import java.util.Scanner;


class stringCount {
	
		String str;
		String rev="";
		int n,i,l;
		int s=0;
		char ch;
		char c[]=new char[100];
	void accept(int a)
	{
		n=a;
		//str=s;
		
	}
	int count()
	{
		char c[]=str.toCharArray();
		s=c.length-1;
		return s;
	}
	void reverse()
	{
		int l=str.length()-1;
		while(l>=0)
		{
			ch=str.charAt(l);
					rev=rev+ch;
					l--;
		}
		if(rev.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	void display(int x)
	{
		System.out.println(x);
	}
	
}
