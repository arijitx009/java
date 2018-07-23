import java.time.LocalDate;
import java.time.Period;


public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public String dstring()
	{
		return " Date is " + day + "/" + month + "/" + year + "";
	}
	
	public boolean isSmaller(Date date)
	{
		return((this.year>date.year)?true:(this.year==date.year && this.month>date.month && this.day>date.day)?true:false);
	}
	public int[] First(Date date)
	{
		int ar[]=new int[3];
		LocalDate dateArg=LocalDate.of(date.day, date.year, date.month);
		LocalDate dateIns=LocalDate.of(day,year,month);
		Period diff=Period.between(dateArg, dateIns);
		ar[0]=(int)diff.getDays() + (int)diff.getYears()*365;
		ar[2]=(int)(diff.getMonths() + (int)diff.getDays()*12);
		ar[1]=(int)diff.getYears();
		
		return ar;
	}
	
	
public int getDay()
{
	return day;
}

public int getMonth()
{
	return month;
}
public int getYear()
{
	return year;
}

	
}
