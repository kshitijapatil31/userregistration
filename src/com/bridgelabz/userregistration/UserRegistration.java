package com.bridgelabz.userregistration;

public class UserRegistration {

	public static void main(String[] args) {
	String regex="[A-Z]{1}[a-z]{2,9}";
	String str="Kshitija";
	System.out.println(str.matches(regex));
	}

}
