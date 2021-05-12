package entities;

import exceptions.WithdrawException;


public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account() {
	};

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void withdraw (Double amount) {
		if (amount > 0 && amount <= this.withdrawLimit) {
			this.balance = this.balance - amount;
		} if (amount > this.withdrawLimit) throw new WithdrawException("The amount exceeds withdraw limit");
		if (amount > this.balance) throw new WithdrawException("Not enough balance");
		
	};

	public void deposit (Double amount) {this.balance += amount;}
	
	
}
