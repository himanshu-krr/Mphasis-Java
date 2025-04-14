package com.bank.derived;

import com.bank.lib1.BankBase;

public class ATM extends BankBase {
	public ATM(String Bnm, String IFSC, String Bank1)
	{
		super(Bnm, IFSC, Bank1);
	}
	
	public void InvokeMethod()
	{
		super.DisplayBankDetails();
	}
	
	public void ATMAddr()
	{
		System.out.println("BBST-OD5");
	}

}
