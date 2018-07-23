import java.util.Scanner;
class Rectangle
{
double l,b,area;

Rectangle(double x,double y)
{
l=x;
b=y;
}


double rectarea()

{
area=l*b;
//System.out.println("The area is" +area);
return area;
}
}
class Main
{
public static void main(String args[])
{
Rectangle r1=new Rectangle(10,20);
Rectangle r2=new Rectangle(10,20);
r1.rectarea();
r2.rectarea();
System.out.println(r1.rectarea());
System.out.println(r2.rectarea());
if(r1.rectarea()==r2.rectarea())
{
System.out.println("The area of the rectangles are equal");

}

else
{
System.out.println("Not equal");
}


}



}