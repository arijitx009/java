 class CorporateTraining extends Training{
	 int days;
	 double getOrderValue;
	 CorporateTraining()
	 {}
	 CorporateTraining(double fees,String subject,String id,int days)
	 {
		 super(fees,subject,id);
		 this.days=days;
	 }
	 void getOrderValue()
	 {
		 getOrderValue=fees*days;
	 }
	 void display2()
	 {
		 System.out.println(" The total amount for training is "  +getOrderValue);
	 }

}
