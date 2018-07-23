import java.util.Scanner;
class RemoveDuplicate 
{
	public static void main(String args[])
	{
		String input,output="";
		int i=0,l,j;
		System.out.println("Enter");
		Scanner sc=new Scanner(System.in);
	     input=sc.next();
		 output="";
		 l=input.length();
		input+="";
		System.out.println(input);
		
		for( i=0;i<l;i++)
			
		{
			for( j=0;j<i;j++) 
			{
				if(input.charAt(i)==input.charAt(j))
				{
					break;
				}
			}
			
			if(i==j)
			{
				output+=input.charAt(i);
				
				
			}
			
			

}
		System.out.println(output);
	}
}
		
	



