import java.util.Scanner;
 class Main {
	 public static void main(String args[])
	 {
		 stringCount sco=new stringCount();
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of strings");
			int n=sc.nextInt();
			System.out.println("Enter the String");
			String str=sc.nextLine();
			sco.display(n);
		 //sco.accept(n);
		 sco.count();
		 sco.reverse();
		 
	 }

}
