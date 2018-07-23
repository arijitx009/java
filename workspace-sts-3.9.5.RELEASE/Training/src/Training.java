import java.util.*;
abstract class Training {
	String id;
	String subject;
	double fees;
	Training()
	{}
	Training(double fees,String subject,String id)
	{
		this.fees=fees;
		this.subject=subject;
		this.id=id;
		
	}
	
	abstract void getOrderValue();

}

