import java.util.Scanner;
public class TelevisionMain {
	public static void main(String args[])
	{
		Television t=new Television();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the state of the tv");
		int state=sc.nextInt();
		if(state==0)
		{
			System.out.println("Please Switch On the tv");
			
		}
		else if(state==1)
		{
			System.out.println("Welcome");
			System.out.println("Enter the channel number you want ");
			int cC=sc.nextInt();
			System.out.println("Enter the current volume ");
			int cVolume=sc.nextInt();
			 int iv=t.increaseVolume(cVolume);
			int dv=t.decreaseVolume(cVolume);
			System.out.println(cC);
			System.out.println(iv);
			System.out.println(dv);
			
			
			
			
		}
		else
		{
			System.out.println("Tv is not working");
		}
				
		
		
		
				
		
	}

}
