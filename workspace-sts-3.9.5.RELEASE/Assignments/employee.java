import java.util.Scanner;
class Employee
{
	String name;
	String id;
	double monthlyBasic,monthlyGross,monthlyDeductions,PF,ESIC,protax,monthlyTake,annualTake; // initializing the variables and data types
	
	void accept() //function to print the name id and the monthly basic of the employee
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the employee");
		name=sc.nextLine();
		System.out.println("Enter the id of the employee");
		id=sc.nextLine();
		System.out.println("Enter the monthlybasic of the employee");
		monthlyBasic=sc.nextDouble();
		
	}
	double getAnnualBasic() //function to get the annual basic
	{
		return 12*monthlyBasic;
	}
	double getMonthlyGrossSalary() //function to get gross salary
	{
		monthlyGross=monthlyBasic+(50*monthlyBasic/100)+1250+800;
		return monthlyGross;
	}
	double getMonthlyDeductions() //function to get salary after monthly deductions
	{
		PF=0.1*monthlyBasic;
		ESIC=0.0475*monthlyBasic;
		if(monthlyGross<=10000)
		{
			protax=50;
		}
		else{
			protax=100;
		}
		if(PF<6500 && ESIC<=5000 && (protax==50||protax==100)) 
		{
			monthlyDeductions=PF+ESIC+protax;
			return monthlyDeductions;
		}
		else{
			monthlyDeductions=6500+5000+protax;
			return monthlyDeductions;
		}
		
	}
	double getMonthlyTakeHome() //function to get the amount of money allowed to take home per month
 	{
		monthlyTake=monthlyGross-monthlyDeductions;
		return monthlyTake;
	}
	double getAnnualTakeHome() //function to get the amount of money allowed to take home.
	{
		annualTake=12*monthlyTake;
		return annualTake;
	}
	void display() //display function to display the results
	{
		System.out.println("Name"+name);
		System.out.println("ID"+id);
		System.out.println("monthlybasic"+monthlyBasic);
		System.out.println("AnnualBasic"+(12*monthlyBasic));
		System.out.println("monthly gross"+monthlyGross);
		System.out.println("monthlyDeductions"+monthlyDeductions);
		System.out.println("monthly take home"+monthlyTake);
		System.out.println("Annual take"+annualTake);
		
	}
	
}
class Main //main method
{
	public static void main(String args[])
	{
	Employee e=new Employee();
	e.accept();
	e.getAnnualBasic();
	e.getMonthlyGrossSalary();
	e.getMonthlyDeductions();
	e.getMonthlyTakeHome();
	e.getAnnualTakeHome();
	e.display();
	}
}
	
