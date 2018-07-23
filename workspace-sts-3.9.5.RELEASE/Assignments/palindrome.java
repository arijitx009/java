import java.util.Scanner;
class Palindrome{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number you want to check");
	int numb=sc.nextInt();
	int copy,rem,rev=0;
	copy=numb;
	while(copy!=0)
	{
		rem=copy%10;
		rev=rem+(rev*10);
		copy/=10;
	}
		if(rev==numb)
		
				System.out.println(numb+ "Is Palindrome");
		
		else
				System.out.println("not palindrome");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}