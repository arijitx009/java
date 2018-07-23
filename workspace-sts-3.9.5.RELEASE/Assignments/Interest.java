import java.util.Scanner;
class Interest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principal,rate,time");
double p=sc.nextDouble();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=p*r*t/100;
double ci=(Math.pow(p*(1+r/100),t)-p);
System.out.println("The Simple Interest is "+si);
System.out.println("The Compound Interest is "+ci);








}
}