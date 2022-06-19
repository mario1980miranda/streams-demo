package com.example.demo.strategies.order;

import com.example.demo.strategies.PayStrategy;

/**
 * Order class. Doesn't know the concrete payment method (strategy) user has
 * picked. It uses common strategy interface to delegate collecting payment data
 * to strategy object. It can be used to save order to database.
 * @author Mario
 *
 */
public class Order {
	private int totalCost = 0;
	private boolean isClosed = false;
	
	public void processOrder(PayStrategy strategy) {
		strategy.collectPaymentDetails();
		// Here we could collect and store payment data from the strategy
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost += totalCost;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed() {
		this.isClosed = true;
	}
}
