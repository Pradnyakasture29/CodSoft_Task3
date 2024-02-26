import java.util.Scanner;

class Account
{
	private double balance;

	public Account(double balance) 
	{
		super();
		this.balance = balance;
	}
	
	public double getBalance() 
	{
		return balance;
	}

	public void depositMoney(double amount) 
	{
		balance +=amount;
		System.out.println("Current Balance:"+balance);
	}

	public void withdrawMoney(double amount) 
	{
		if(amount<=balance)
		{
			balance -=amount;
			System.out.println("Remaining Balance:"+balance);
		}
		else
		{
			System.out.println("Insufficient Balance...!");
		}
	}
	public void checkBalance()
	{
		System.out.println("Current Balance:"+balance);
	}
}
public class Atm 
{
	public void displayMenu()
    {
    	System.out.println("1.Deposit Money\n2.Withdraw Money\n3.Check Balance\n4.Exit\n");
    }
	public static void main(String[] args) 
	{
		Atm atm=new Atm();
		Account account=new Account(1000);
	    Scanner scanner=new Scanner(System.in);
		
		while(true)
		{
			atm.displayMenu();
			System.out.println("Enter your choice:");
			int choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter amount for deposit");
				double amount=scanner.nextDouble();
				
				account.depositMoney(amount);
				break;
			}
			case 2:
			{
				System.out.println("Enter amount for withdraw");
				double amount=scanner.nextDouble();
				
				account.withdrawMoney(amount);
				break;
			}
			case 3:
			{
				account.checkBalance();
				break;
			}
			case 4:
			{
				System.exit(0);
				break;
			}
			default :
			{
				System.out.println("Wrong Choice");
			}
			}
		}
	}
}
