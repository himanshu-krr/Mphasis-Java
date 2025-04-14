package com.bank.scripttorun;

import com.bank.derived.ATM;

public abstract class TestBankRun {
	public static void main(String[] args)
	{
		ATM atm = new ATM("ICICI", "ICI9878", "BBS-1");
		
		atm.ATMAddr();
		atm.DisplayBankDetails();
	}

}
