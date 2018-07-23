import java.util.Scanner;
class Marks
{
static int arr[][];
public static void main(String a[])

{
arr=new int[5][5];
int total=0;
int tot=0;
int av=0;
int avg=0;
Scanner sc=new Scanner(System.in);

for(int i=0;i<3;i++)
{

System.out.println("Enter the marks for the student" +(i+1));
for(int j=0;j<3;j++)
{

arr[i][j]=sc.nextInt();
}
}
for(int i=0;i<3;i++)
{
total=0;
avg=0;
for(int j=0;j<3;j++)
{

total+=arr[i][j];

}
avg=total/3;
System.out.println("\n"+total);

System.out.println("\n"+avg);

}
for(int j=0;j<3;j++)
{
	tot=0;
	av=0;
	for(int i=0;i<3;i++)
	{
		
		tot=+arr[i][j];
	}
	av=tot/3;
	System.out.println("\n"+tot);

System.out.println("\n"+av);
}
}
}