 class PublicTraining extends Training {
	 int participants;
	 double getOrderValue;
	 PublicTraining()
	 {}
	 PublicTraining(double fees,String subject,String id,int participants )
	 {
		 super(fees,subject,id);
		 this.participants=participants;

	 }

	@Override
	void getOrderValue()
	
	{
		 getOrderValue=fees*participants;
		
		
	}
	void display()
	{
		System.out.println(" The total amount for training is "  +getOrderValue);
	}
	
}
