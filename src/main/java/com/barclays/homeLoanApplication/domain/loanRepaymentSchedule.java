
package com.barclays.homeloan.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class loanRepaymentSchedule {
	
	@Column
	private LocalDate date;
	
	@Column
	private float emi;
	
	@Column
	private float principalAmount;
	
	@Column
	private float interestAmount;
	
	@Column
	private float outstanding;

	@Column
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "loanId")
	private loanAccount loanId;
	
	public loanRepaymentSchedule() {}

	
	public loanRepaymentSchedule(int id, LocalDate date, float emi, float principalamount, float interestamount, float outstanding,
			String status, loanAccount loanId) {
		super();
		this.date = date;
		this.emi = emi;
		this.principalAmount = principalamount;
		this.interestAmount = interestamount;
		this.outstanding = outstanding;
		this.status = status;
		this.loanId = loanId;
	}



	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}



	public float getEmi() {
		return emi;
	}

	public void setEmi(float emi) {
		this.emi = emi;
	}



	public float getPrincipalAmount() {
		return principalAmount;
	}


	public void setPrincipalAmount(float principalAmount) {
		this.principalAmount = principalAmount;
	}



	public float getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(float interestAmount) {
		this.interestAmount = interestAmount;
	}


	public float getOutstanding() {
		return outstanding;
	}



	public void setOutstanding(float outstanding) {
		this.outstanding = outstanding;
	}



	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public loanAccount getLoanId() {
		return loanId;
	}



	public void setLoanId(loanAccount loanId) {
		this.loanId = loanId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, emi, interestAmount, loanId, outstanding, principalAmount, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		loanRepaymentSchedule other = (loanRepaymentSchedule) obj;
		return Objects.equals(date, other.date) && Float.floatToIntBits(emi) == Float.floatToIntBits(other.emi)
				&& Float.floatToIntBits(interestAmount) == Float.floatToIntBits(other.interestAmount)
				&& Objects.equals(loanId, other.loanId)
				&& Float.floatToIntBits(outstanding) == Float.floatToIntBits(other.outstanding)
				&& Float.floatToIntBits(principalAmount) == Float.floatToIntBits(other.principalAmount)
				&& Objects.equals(status, other.status);
	}


	@Override
	public String toString() {
		return "loanRepaymentSchedule [date=" + date + ", emi=" + emi + ", principalAmount=" + principalAmount
				+ ", interestAmount=" + interestAmount + ", outstanding=" + outstanding + ", status=" + status
				+ ", loanId=" + loanId + "]";
	}

	
}

