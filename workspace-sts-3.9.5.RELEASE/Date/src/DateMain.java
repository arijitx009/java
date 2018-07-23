
public class DateMain {
	
	public static void main(String[] args)
	{
		Date ndate=new Date(11,2000,9);
		Date odate=new Date(13,2009,1);
		int ar[]=ndate.First(odate);
		System.out.println("Date 1" +ndate);
		System.out.println("Date 1" +odate);
		System.out.println("Total days difference is" +ar[0]+"\nTotal months difference is" +ar[2]+"\nTotal years difference is" +ar[1] );
		
		
	}

}
