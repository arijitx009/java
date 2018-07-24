class Arms
{
public static void main(String args[]) 
{
int i,cpy,rem,res=0;  //taking data types and variables

for(i=100;i<=999;i++){ //taking a loop from 100 to 999
cpy=i;
while(cpy>0)
{

rem=cpy%10; //to check whether the number is armstrong or not
res+=Math.pow(rem,3);
cpy/=10;
}
if(res==i)
System.out.println("The armstrong numbers are" +i);
}




}










}



