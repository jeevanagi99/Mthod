package com.X_workz.methods;

public class TrainInfo {
	public static String train(int trainno, String traintime) {
		return "udyan express arrives at:" + traintime + "train number is" + trainno;
	}

	public static String ticketBooking(int seatno, String name, String coach) {
		return name + "your ticket is booked  for the seatno:" + seatno + " and the coach:" + coach + "successfully";
	}

	public static void main(String[] args) {

		String train = TrainInfo.train(12345, "9.00AM");
		System.out.println(train);
		String ticket = TrainInfo.ticketBooking(42, "Arpita", "s3");
		System.out.println(ticket);
	}

}
