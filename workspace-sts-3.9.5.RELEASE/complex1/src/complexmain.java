
public class complexmain {
	public static void main(String args[])
	{
		complex c1=new complex(4,8);
		complex c2=new complex(5,9);
		complex c3=new complex();
		c3=c3.AddComplex(c1,c2);
		System.out.println("Sum"  +c3.real + "+i" +c3.imag);
		
	}

}
