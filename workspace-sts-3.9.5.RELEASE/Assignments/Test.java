import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
double m1=sc.nextDouble();
double m2=sc.nextDouble();
double m3=sc.nextDouble();
if(m1>60 && m2>60 && m3>60)
{
System.out.println("Passed");
}
else if(m1>60 && m2>60 ||m1>60 && m3>60 ||m2>60 && m3>60)
{
System.out.println("Promoted");
}
else
{
System.out.println("Failed");
}
}
}