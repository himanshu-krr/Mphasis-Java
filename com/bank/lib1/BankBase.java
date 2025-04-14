package com.bank.lib1;

public class BankBase {
	String BankName;
	String BankIFSC;
	String BankLoc;
	
	protected BankBase(String BankName, String BankIFSC, String BankLoc)
	{
		this.BankName = BankName;
		this.BankIFSC = BankIFSC;
		this.BankLoc = BankLoc;
		
	}
	
	public void DisplayBankDetails()
	{
		System.out.println(BankName + " " + BankIFSC + " "+BankLoc );
	}
	
}
