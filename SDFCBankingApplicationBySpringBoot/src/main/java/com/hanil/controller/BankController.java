package com.hanil.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hanil.entity.Bank;
import com.hanil.service.BankServiceImp;
@Controller
public class BankController {
	@Autowired
	private BankServiceImp service;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/newaccount")
	public String newAccount()
	{
		return "newacc";
	}
	@RequestMapping("/register")
	public String registerPage(Bank bank,@RequestParam String password,@RequestParam String confirmPassword)
	{
		if(password.equals(confirmPassword))
		{
		service.createAccount(bank);
		return "success";
		}
		else
			return "password";
	}
	@RequestMapping("/balance")
	public String balancePage()
	{
		return "balance";
	}
	@RequestMapping("/checkbal")
	public String checkBal(ModelMap model,@RequestParam int accNo,@RequestParam String name,@RequestParam String password)
	{
		Bank bank=service.checkBalance(accNo);
		model.put("users", bank);
		if(bank.getAccNo()==accNo && bank.getName().equals(name) && bank.getPassword().equals(password))
		{
		if(bank.getStatus()==0)
		{
		return "bal";
		}
		else
			return "status";
		}
		else
		{
		return "error";
		}	
	}
	@RequestMapping("/deposit")
	public String depositForm()
	{
		return "deposit";
	}
	
	@RequestMapping("/depositamt")
	public String depositPage(ModelMap model,@RequestParam int accNo,@RequestParam String name,@RequestParam String password,@RequestParam double amt)
	{
		Bank bank=service.depositBalance(accNo, amt);
		model.put("users", bank);
		if(bank.getAccNo()==accNo && bank.getName().equals(name) && bank.getPassword().equals(password))
		{
		if(bank.getStatus()==0)
		{
		service.saveBalance(bank);
		return "bal";
		}
		else
			return "status";
		}
		else
		{
		return "error";
		}		
	}
	@RequestMapping("/withdraw")
	public String withdrawForm()
	{
		return "withdraw";
	}
	@RequestMapping("/withdrawamt")
	public String withdrawPage(ModelMap model,@RequestParam int accNo,@RequestParam String name,@RequestParam String password,@RequestParam double amt)
	{
		Bank bank=service.withdrawBalance(accNo, amt);
		model.put("users", bank);
		if(bank.getAccNo()==accNo && bank.getName().equals(name) && bank.getPassword().equals(password))
		{
			if(bank.getStatus()==0)
			{
			if(bank!=null)
			{
				service.saveBalance(bank);
				return "bal";
			}
			else
				return "status";
			}
			else
			{
				return "insuff";
			}
		}
		else
		{
		return "error";
		}
		}
	@RequestMapping("/transfer")
	public String transferForm()
	{
		return "transfer";
	}
	@RequestMapping("/transferamt")
	public String transferAmount(ModelMap model,@RequestParam int accNo,@RequestParam int taccNo,@RequestParam String name,@RequestParam String password,@RequestParam double amt)
	{
		Bank b1=service.withdrawBalance(accNo, amt);
		Bank b2=service.depositBalance(taccNo, amt);
		model.put("user1", b1);
		model.put("user2", b2);
		if(b1.getName().equals(name) && b1.getPassword().equals(password) && b1.getAmount()>amt)
		{
			service.saveBalance(b1);
			service.saveBalance(b2);
			return "trans";
		}
		else
			return "error";
		
	}
	@RequestMapping("/aboutus")
	public String aboutUsPage()
	{
		return "aboutus";
	}
	@RequestMapping("/closeacc")
	public String closeAccForm()
	{
		return "closeacc";
	}
	@RequestMapping("/close")
	public String closePage(@RequestParam int accNo,@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		Bank b1=service.closeAccount(accNo);
		if(b1.getName().equals(name) && b1.getPassword().equals(password))
		{
			service.saveBalance(b1);
			return "status";
		}
		else
			return "error";
		
	}

}
