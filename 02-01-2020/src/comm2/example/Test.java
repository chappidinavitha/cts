package comm2.example;

import java.util.Scanner;

public class Test {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[])
	{
		
int choice=-1;
Account account=null;
do
{
	System.out.println("1.create account");
	System.out.println("2.display account");
	System.out.println("0.exit");
	System.out.println("choose ur choic>>:");
	choice=scanner.nextInt();
	switch(choice)
	{
	case 1:
		account=Account.createAccount(AccountType.CREDIT_CARD,10000);
		break;
	case 2:
		System.out.println(account.displayAccount());
		break;
	case 0:
		System.out.println("exit");
		System.exit(0);
	default:
		System.out.println("invalid");
		break;
		
	}
	
}while(choice!=0);
}
}
