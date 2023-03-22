package com.model;

public class Account {
	private int accnum;
	private String accHolderName;
	private int withdrawBal;
	private static int accBalance;
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	private int depositeBal;
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getWithdrawBal() {
		return withdrawBal;
	}
	public void setWithdrawBal(int withdrawBal) {
		this.withdrawBal = withdrawBal;
	}
	public int getDepositeBal() {
		return depositeBal;
	}
	public void setDepositeBal(int depositeBal) {
		this.depositeBal = depositeBal;
	}

}
