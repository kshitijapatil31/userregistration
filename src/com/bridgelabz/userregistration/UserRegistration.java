package com.bridgelabz.userregistration;

public class UserRegistration {

	public static void main(String[] args) {
	String regex="[A-Z]{1}[a-z]{2,9}";
	String firstname="Kshitija";
	System.out.println(firstname.matches(regex));
	String regex1="[A-Z]{1}[a-z]{2,9}";
	String lastname="Patil";
	System.out.println(lastname.matches(regex1));
	String regex2="^[a-z]{3}(.+)[a-zA-z_+-]{0,8}@([a-zA-Z]{3,14}(.+))([a-zA-z]{2})$";
	String email="abc.xy_z@Bridgelabz.co";
	
	System.out.println(email.matches(regex));
	}

}
