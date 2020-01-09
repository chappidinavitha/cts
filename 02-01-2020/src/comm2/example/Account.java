package comm2.example;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Account {

	private String accNo;
	private AccountType accType;
	private double amount;
	private LocalDate DateOfOpening;
	private static Account account;
	static {
		account = new Account();
	}

	public static Account createAccount(AccountType accType,double amount)
	{
		account.setAccNo(UUID.randomUUID().toString());
		account.setAccType(accType);
		account.setAmount(amount);
		account.setDateOfOpening(LocalDate.now());
		return account;
		
	}
public String displayAccount()
{
	return "Account Number:" +getaccNo()+"Account Type:" +getaccType()+"amount:" +getamount()+"OPening Date:" +getDateOfOpening();
	
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public AccountType getAccType() {
	return accType;
}
public void setAccType(AccountType accType) {
	this.accType = accType;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public LocalDate getDateOfOpening() {
	return DateOfOpening;
}
public void setDateOfOpening(LocalDate dateOfOpening) {
	DateOfOpening = dateOfOpening;
}
public static Account getAccount() {
	return account;
}
public static void setAccount(Account account) {
	Account.account = account;
}
}