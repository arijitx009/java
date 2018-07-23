import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to check whether Armstrong:");
int n=sc.nextInt();
int cpy,rem,res=0;
cpy=n;
while(cpy!=0)
{


	rem=cpy%10;
	res+=Math.pow(rem,3);
	cpy/=10;
	}
	if(res==n)
	System.out.println(n+ "Is an Armstrong Number");
	else
		System.out.println("NAAAAAAAAH");




}







}