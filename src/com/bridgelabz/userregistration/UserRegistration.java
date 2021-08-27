package com.bridgelabz.userregistration;

public class UserRegistration {

	public static void main(String[] args) {
	String regex="[A-Z]{1}[a-z]{2,9}";
	String firstname="Kshitija";
	System.out.println(firstname.matches(regex));
	String regex1="[A-Z]{1}[a-z]{2,9}";
	String lastname="Patil";
	System.out.println(lastname.matches(regex1));
	}

}
