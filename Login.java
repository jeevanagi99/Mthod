package com.X_workz.methods;

public class Login {
	public static String logingWebsite(String Username, String password) {
		return " you have successfully login with " + Username + "and " + password;
	}

	public static void main(String[] args) {
		String login = Login.logingWebsite("Arpita", "Arpita@123");
		System.out.println(login);

	}

}
