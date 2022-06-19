package com.example.demo.strategies;

/**
 * Dummy credit card class.
 * @author Mario
 *
 */
public class CreditCard {
	private int amount;
	private String number;
	private String date;
	private String cvv;
	
	public CreditCard(String number, String date, String cvv) {
		this.amount = 100_00;
		this.number = number;
		this.date = date;
		this.cvv = cvv;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
