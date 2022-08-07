package com.stock.management;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		StockPortfolio stockPortfolio = new StockPortfolio();
		account.debit(stockPortfolio.totalValue);
	}

}
