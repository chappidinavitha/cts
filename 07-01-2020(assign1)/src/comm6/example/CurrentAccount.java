package comm6.example;

public class CurrentAccount {
	private boolean isEligible;
	private float amount;
	public CurrentAccount()
	{
		super();
	}
	

	public CurrentAccount(boolean isEligible, float amount) {
		super();
		this.isEligible = isEligible;
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "CurrentAccount [isEligible=" + isEligible + ", amount=" + amount + "]";
	}
}

	
