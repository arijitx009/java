
public class DistanceMain {
	public static void main(String args[])
	{
		Distance d1=new Distance(4,8.0f);
		Distance d2=new Distance(5,9.0f);
		Distance d3=new Distance();
		d3=d3.AddDistance(d1,d2);
		System.out.println("Distance"  +d3.feet+ "feet" + +d3.inch +"inch");
		
	}

}