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
	String email="abc.xy_z@Bridgelabz.co.in";
	System.out.println(email.matches(regex));
	
	String regex3="^[+91]{3}\\s{0,1}[0-9]{10}";
	String mobile="+91 9919819801";
	System.out.println(mobile.matches(regex3));
	
	
	String regex4="[a-zA-z]{8,10}";
	String password1="rttyuiopp";
	System.out.println(password1.matches(regex4));
	
	String regex5="(?=.*[A-Z])";
	String password2="G";
	System.out.println(password2.matches(regex5));
	
	String regex6="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$";
	
	String password3="ghyui8Gop";
	System.out.println(password3.matches(regex6));
	
	
	String regex7="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
	String password4="Morningstar@31";
	System.out.println(password4.matches(regex7));
	}

}
