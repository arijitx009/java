import java.util.Scanner;
class loginDetails
{
public static void main(String[] args)
{
	String username=new String("admin");
	String password=new String("pass123456");
	String uname;
	String pass;
	int count=0,i;
	Scanner sc=new Scanner(System.in);
	for(i=0;i<3;i++)
	{
	
	System.out.println("Enter the username");
	uname=sc.nextLine();
	System.out.println("Enter the password");
	pass=sc.nextLine();
		if((uname.equals(username))&&(pass.equals(password)))
		{
			System.out.println("\nWelcome");
			break;
		}
		else
		{
			count++;
			if(count>=3)
			{
				System.out.println("Contact admin");
				break;
			}
			else
				continue;
		}
	}
}
}
