
package com.barclays.homeloan.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SavingsAccount {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int seqId;
	
	@Column
	private long accountNumber;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private float balance;

	

	
	public SavingsAccount(int seqId, long accountNumber, String name, String email, float balance) {
		super();
		this.seqId = seqId;
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}




	public int getSeqId() {
		return seqId;
	}




	public void setSeqId(int seqId) {
		this.seqId = seqId;
	}




	public long getAccountNumber() {
		return accountNumber;
	}




	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public float getBalance() {
		return balance;
	}




	public void setBalance(float balance) {
		this.balance = balance;
	}




	public SavingsAccount() {};
	
	@Override
	public String toString() {
		return "SavingsAccount [seqId=" + seqId + ", accountNumber=" + accountNumber + ", name=" + name + ", email="
				+ email + ", balance=" + balance + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance, email, name, seqId);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		return accountNumber == other.accountNumber
				&& Float.floatToIntBits(balance) == Float.floatToIntBits(other.balance)
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name) && seqId == other.seqId;
	}


	

}