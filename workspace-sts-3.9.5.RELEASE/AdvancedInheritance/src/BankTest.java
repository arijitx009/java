
public class BankTest {

	public static void main(String[] args) {
		
		MMBankFactory mm = new MMBankFactory();
		
		MMBankFactory mm1 = new MMBankFactory();
		
		SavingAcc arijitSavings = arijit.getNewSavingAccount("Arijit", 15200, 54000, true);//initailization of saving account
		System.out.println("After Initialization");
		System.out.println(arijitSavings);
		System.out.println("");
		
		
		CurrentAcc rohitCurrent = rohit.getNewCurrentAccount("rohit", 15420, 54796, 10000);//initailization of Current account
		System.out.println("After Initialization");
		System.out.println(rohitCurrent);
		System.out.println("");
		
		
		alfaizSavings.withdraw(42000);
		System.out.println("After Withdrawal from savings"); //Withdrawal
		System.out.println(arijitSavings);
		System.out.println("");
		
		
		arijitSavings.deposit(14520);
		System.out.println("After Deposit in Savings");//Deposit in saving account
		System.out.println(arijitSavings);
		System.out.println("");
		
		
		rohitCurrent.withdraw(15640);
		System.out.println("After Withdrawal from Current");
		System.out.println(rohitCurrent);
		System.out.println("");

		rohitCurrent.withdraw(15640);
		System.out.println("After Deposit from Current");
		System.out.println(rohitCurrent);
		System.out.println("");
		
	}

}
