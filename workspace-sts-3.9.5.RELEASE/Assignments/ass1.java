import java.util.Scanner;
class Square
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
   System.out.println("Enter number to find square in java:");
	double n=sc.nextDouble();
	
	double sq=Math.pow(n,2);
	
	System.out.println("Number"+n);
		System.out.println("Square"+sq);
}

	}