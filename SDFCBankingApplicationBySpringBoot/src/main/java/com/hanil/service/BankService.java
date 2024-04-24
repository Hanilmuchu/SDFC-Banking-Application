package com.hanil.service;

import com.hanil.entity.Bank;

public interface BankService {

	public Bank createAccount(Bank bank);
	public Bank checkBalance(int accNo);
	public Bank depositBalance(int accNo,double amt);
	public Bank withdrawBalance(int accNo,double amt);
	public Bank transferBalance(Bank bank,int accNo);
	public Bank closeAccount(int accNO);
	public Bank saveBalance(Bank bank);

}
