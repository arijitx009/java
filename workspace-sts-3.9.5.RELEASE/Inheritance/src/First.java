
public class First {
	
	int i;
	int j;
	First()
	{}
	First(int i)
	{
		this.i=i;
		
	}
	void disp()
	{
		System.out.println("number"+i);
	}

}
class Second extends First {
	int a;
	
	Second(int i,int a)
	{
		super(i);
		this.a=a;
		
		
	}
	void display()
	{
		super.disp();
		System.out.println("Product is" +(i*a));
	}
	
}

