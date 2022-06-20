package com.example.demo.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.strategies.models.DebitCard;

public class PayByDebitCard implements PayStrategy {

	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private static final Map<String, Integer> DATA_BASE = new HashMap<>();
	private boolean verified;
	private int pinProvided;
	private DebitCard debitCard; 
	
	static {
		DATA_BASE.put("PIN", 8042);
	}
	
	@Override
	public boolean pay(int paymentAmount) {
		if (cardIsPresent()) {
			System.out.println("Paying " + paymentAmount + " Using Debit Card.");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void collectPaymentDetails() {
		try {
			System.out.println("Enter card's PIN :");
			pinProvided = Integer.parseInt(READER.readLine());
			debitCard = new DebitCard(pinProvided);
			if(cardIsPresent()) {
				if(verify(debitCard)) {
					System.out.println("Debit successfull.");
				} else {
					System.out.println("Incorrect PIN number.");
				}
			} else {
				System.out.println("Please insert Debit Card.");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private boolean verify(DebitCard debitCard) {
		this.setVerified(debitCard.getPinNumber() == DATA_BASE.get("PIN"));
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	
	private boolean cardIsPresent() {
		return debitCard != null;
	}
}
