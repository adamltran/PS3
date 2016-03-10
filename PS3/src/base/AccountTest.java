package base;

import static org.junit.Assert.*;

import org.junit.Test;

import base.InsufficientFundsException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account x;
	
	@Before
	public void setUp() throws Exception {
		x = new Account(1122, 20000);
		x.setAnnualInterestRate(.045);
		x.withdraw(2500);
		x.deposit(3000);
		System.out.println("Balance : " + x.getBalance());
		System.out.println("Monthly Interest : " + x.getAnnualInterestRate()/12);
		System.out.println("Date :  " + x.getDatecreate());
	}

	@After
	public void tearDown() throws Exception {
		x = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		x.withdraw(x.getBalance() + 1);
	}

	@Test
	public final void testDeposit() {
		x.deposit(500);
		assertEquals(x.getBalance(), 21000, .001);
		}

	
	@Test
	public final void withdrawTest() throws InsufficientFundsException  {
		x.withdraw(250);
		assertEquals(x.getBalance(),20250,.001);
	}

	@Test
	public final void balanceTest() {
		assertEquals(x.getBalance(),20500.00,.001);
	}

	@Test
	public final void testGetID() {
		assertEquals(x.getId(),1122);
	}
}
