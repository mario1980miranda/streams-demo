package com.example.demo.strategies;

/**
 * Common interface for all strategies
 * @author Mario
 *
 */
public interface PayStrategy {
	boolean pay(int paymentAmount);
	void collectPaymentDetails();
}
