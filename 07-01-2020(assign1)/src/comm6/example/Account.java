package comm6.example;

public class Account {
	private Integer accountId;
	private String accountName;
	private float amount;

	public Account() {
		super();
	}

	public Account(Integer accountId, String accountName, float amount) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}