package comm6.example;

public class SavingsAccount {
	private float rateofIntrest;
	private float amount;
	public SavingsAccount()
	{
		super();
	}
	


	public SavingsAccount(float rateofIntrest, float amount) {
		super();
		this.rateofIntrest = rateofIntrest;
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "SavingsAccount [rateofIntrest=" + rateofIntrest + ", amount=" + amount + "]";
	}
}
	
