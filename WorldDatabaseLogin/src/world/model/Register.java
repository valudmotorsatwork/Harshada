
package world.model;

import javax.servlet.http.HttpSession;

/**
 * @author HGonge
 * Date 11July2016
 */
public class Register {
private String FirstName;
private String LastName;
private String Email;
private String Password;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

public Register(String FirstName, String LastName, String Email, String Password) {
	super();
	this.FirstName = FirstName;
	this.LastName = LastName;
	this.Email = Email;
	this.Password = Password;
	 
}
public Register() {
	// TODO Auto-generated constructor stub
	super();
}
}
