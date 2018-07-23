import java.util.Scanner;
class Tax
{
public static void main(String[] args)
{
	double amt,tax;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount");
    amt=sc.nextDouble();
	if(amt>=0&&amt<=180000)
	{
		
		System.out.println("Tax payable is 0");
		
	}
	else if(amt>180000&&amt<=300000)
	{
		tax=amt*10/100;
			System.out.println("Tax payable is"+tax);
		
	}
	else if(amt>300000&&amt<=500000)
	{
		tax=amt*20/100;
			System.out.println("Tax payable is"+tax);
		
	}
	else if(amt>500000&&amt<=1000000)
	{
		tax=amt*30/100;
			System.out.println("Tax payable is"+tax);
		
	}
}
}