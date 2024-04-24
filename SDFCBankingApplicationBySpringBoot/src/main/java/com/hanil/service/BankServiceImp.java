package com.hanil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanil.entity.Bank;
import com.hanil.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
	
	@Autowired
	private BankRepo repo;
	@Override
	public Bank createAccount(Bank bank) {
		repo.save(bank);
		return bank;
	}

	@Override
	public Bank checkBalance(int accNo) {
		Bank bank=repo.findById(accNo).get();
		return bank;
	}

	@Override
	public Bank depositBalance(int accNo,double amt) {
		double a=0.0;
		Bank bank=repo.findById(accNo).get();
		a=amt+bank.getAmount();
		bank.setAmount(a);
		return bank;
	}

	@Override
	public Bank withdrawBalance(int accNo,double amt) {
		double a=0.0;
		Bank bank=repo.findById(accNo).get();
		if(bank.getAmount()>amt)
		{
			a=bank.getAmount()-amt;
			bank.setAmount(a);
			return bank;
		}
		else
		{
			return null;
		}
	}

	@Override
	public Bank transferBalance(Bank bank, int accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank closeAccount(int accNO) {
		Bank bank=repo.findById(accNO).get();
		bank.setStatus(1);
		return bank;
	}

	@Override
	public Bank saveBalance(Bank bank) {
		repo.save(bank);
		return null;
	}

	
}
