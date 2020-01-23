package comm.example.bean2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter


public class Address {
	private String address1;
	private String address2;
	private String phoneNumber;
	private String zipCode;
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", phoneNumber=" + phoneNumber
				+ ", zipCode=" + zipCode + "]";
	}
	 
	

}
