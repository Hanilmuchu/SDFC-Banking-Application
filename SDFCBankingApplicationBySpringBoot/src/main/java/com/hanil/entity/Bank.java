package com.hanil.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sdfcbank")
public class Bank {
	@Id
	private int accNo;
	private String name;
	private String password;
	private double amount;
	private String address;
	private long mno;
	private int status;
	
	public Bank() {
		super();
	}

	public Bank(int accNo, String name, String password, double amount, String address, long mno, int status) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mno = mno;
		this.status = status;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", name=" + name + ", password=" + password + ", amount=" + amount
				+ ", address=" + address + ", mno=" + mno + ", status=" + status + "]";
	}
	
	
}