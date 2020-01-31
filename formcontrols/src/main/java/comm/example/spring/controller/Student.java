package comm.example.spring.controller;

import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Student {
	@NotNull
	@Size(min = 5,max = 20,message = "first name required")
private String firstName;
	@NotNull
	@Size(min = 5,max = 20,message = "first name required")
private String lastName;
private String country;
@Email(message="provide valid email")
private String email;
@Range(min = 18,max = 55,message="between this range")
private int age;
@Pattern(regexp = "([0-9]{6}|[0-9]{3}\\s[0-9]{3})",message="")
private String zipcode;
private LinkedHashMap<String, String> countryOptions;

private String favoriteLanguage;

private String[] operatingSystems;

public Student() {
	
	
	countryOptions = new LinkedHashMap<>();
	
	countryOptions.put("BR", "Brazil");
	countryOptions.put("FR", "France");
	countryOptions.put("DE", "Germany");
	countryOptions.put("IN", "India");
	countryOptions.put("US", "United States of America");		

}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
	this.countryOptions = countryOptions;
}

public String getFavoriteLanguage() {
	return favoriteLanguage;
}

public void setFavoriteLanguage(String favoriteLanguage) {
	this.favoriteLanguage = favoriteLanguage;
}

public String[] getOperatingSystems() {
	return operatingSystems;
}

public void setOperatingSystems(String[] operatingSystems) {
	this.operatingSystems = operatingSystems;
}



}
