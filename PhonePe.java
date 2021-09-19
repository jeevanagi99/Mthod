package com.X_workz.methods;

public class PhonePe {
	public static String transferMoney(long Phoneno, int Password) {
		return "transaction is successfull for Phoneno:" + Phoneno;
	}

	public static String Recharge(long Mobileno, int amount) {
		return "recharge successful for Mobileno :" + Mobileno + "of amount" + amount;
	}

	public static String checkBalance(int UPI, int amount) {
		return "your balance is " + amount;
	}

	public static String wallet(int money) {
		return money + "added to wallet successfully:";
	}

	public static void main(String[] args) {
		String Money = PhonePe.transferMoney(142537895, 1234);
		System.out.println("Money");
		System.out.println();
		String Recharge = PhonePe.Recharge(1425378955, 499);
		System.out.println("Recharge");
		System.out.println();

		String balance = PhonePe.checkBalance(1234, 400000);
		System.out.println("balance");
		System.out.println();
		String walletMoney = PhonePe.wallet(200);
		System.out.println(walletMoney);
		System.out.println();

	}
}