package Main;
import java.util.Scanner;
import project.Interest_Calculation.*;

public class CalculateInterest {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Interest comp=new Compound();
		Interest simp=new Simple();
		System.out.println("----Interest Calculator----");
		System.out.println("Enter the Principal Amount : ");
		float principal_amount=scan.nextFloat();
		System.out.println("Enter the Interest rate : ");
		float interest_rate=scan.nextFloat();
		System.out.println("Enter the time : ");
		int time=scan.nextInt();
		System.out.println("Choose:\n1.Simple Interest\n2.Compound Interest");
		int choice=scan.nextInt();
		if(choice==1)
		{
			System.out.println("Final Amount is "+simp.calc_Interest(principal_amount, interest_rate, time, 1));
		}
		else if(choice==2)
		{
			System.out.println("Enter the Compounded : ");
			int compounded=scan.nextInt();
			System.out.println("Final Amount is "+comp.calc_Interest(principal_amount, interest_rate, time, compounded));
		}
		else
			System.out.println("Invalid Choice");
	}

}
