
public class TrainingTest 
{
	public static void main(String args[])
	{
		PublicTraining pt=new PublicTraining(1000,"BigData","1678",100);
		CorporateTraining ct=new CorporateTraining(2500,"Java","3444",5);
		
		pt.getOrderValue();
		pt.display();
		ct.getOrderValue();
		ct.display2();
		
				
	}
	
	
}
