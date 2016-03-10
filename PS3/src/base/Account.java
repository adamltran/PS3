package base;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date datecreate;
	public Account() {
		datecreate = new Date(); 
	}
	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDatecreate() {
		return datecreate;
	}
	public void setDatecreate(Date datecreate) {
		this.datecreate = datecreate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withdraw (double w) throws InsufficientFundsException {
		
		if (w > balance) {
			throw new InsufficientFundsException(w - balance);
		}
		balance -= w;
	}
	public void deposit (double d) {
		balance += d;
	}
	

	
	
}




