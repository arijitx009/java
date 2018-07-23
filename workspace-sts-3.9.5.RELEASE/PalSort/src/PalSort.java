import java.util.Scanner;

class PalSort 
{
 static int i,c=0,j,temp;	

	 public static void main (String args[])
	 {
		String rev="";
		String t="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Words");
		String w[]=new String[10];
		for(int i=0;i<10;i++)
		{
			w[i]=sc.next();
		}
		String pal[]=new String[10];
		int palS[]=new int[10];
		for(int i=0;i<10;i++)
		{
			rev="";
			String cpy=w[i];
			int n=w[i].length();
			for(int k=n-1;k>=0;k--)
			{
				rev=rev+(w[i].charAt(k));
			}
			System.out.println(rev);
			if(cpy.equals(rev))
			{
				System.out.println(cpy+"is Palindrome");
				pal[c]=cpy;
				palS[c]=pal[c].length();
				c++;
			}
			
		}
		for(i=0;i<c-1;i++)
		{
			for(j=0;j<c-1-i;j++)
			{
				if(palS[j]>palS[j+1])
				{
					temp=palS[j];
					palS[j]=palS[j+1];
					palS[j+1]=temp;
					
					t=pal[j];
					pal[j]=pal[j+1];
					pal[j+1]=t;
					
				}
			}
		}
		for(i=0;i<c;i++)
			System.out.println(pal[i]);
		
	 }
}		