package com.wipro.bank.entity;

public class Account {

	private int accountID;
	private String userName;
	private double balance;
	
	
	
	public Account (){
		
	}

	/**
	 * @param accountID
	 * @param userName
	 */
	public Account(int accountID, String userName) {
		super();
		this.accountID = accountID;
		this.userName = userName;
	}


	/**
	 * @param accountID
	 * @param userName
	 * @param balance
	 */
	public Account(int accountID, String userName, double balance) {
		super();
		this.accountID = accountID;
		this.userName = userName;
		this.balance = balance;
	}
	
	/**
	 * @return the accountID
	 */
	public int getAccountID() {
		return accountID;
	}
	
	
	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
