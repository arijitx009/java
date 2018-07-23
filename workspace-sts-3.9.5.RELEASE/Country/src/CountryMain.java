import java.util.Scanner;
public class CountryMai {
	
	public static void main(String args)
	{
		int nofCountries;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of countries");
		nofCountries=sc.nextInt();
		
		Country  c[]=new Country[nofCountries];
		
		System.out.println("Enter the country information:\nCountry \nPopulation \nArea");
		for(int i=0;i<nofCountries;i++)
		{
			c[i]=new Country(sc.next(),sc.nextInt(),sc.nextDouble());
		}
		
			
	}

}
