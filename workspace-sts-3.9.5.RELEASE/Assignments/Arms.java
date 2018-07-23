class Arms
{
public static void main(String args[])
{
int i,cpy,rem,res=0;

for(i=100;i<=999;i++){
cpy=i;
while(cpy>0)
{

rem=cpy%10;
res+=Math.pow(rem,3);
cpy/=10;
}

if(res==i)
System.out.println("The armstrong numbers are" +i);res=0;
}




}










}








