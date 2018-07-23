
public class TimeMain
{

	public static void main(String args[])
	{
		Time t1=new Time(4,52);
		Time t2=new Time(5,53);
		Time t3=new Time();
		t3=t3.AddTime(t1,t2);
		System.out.println("Hours"  +t3.hours+  ":" + +t3.minutes +"minutes");
		
	}

}
