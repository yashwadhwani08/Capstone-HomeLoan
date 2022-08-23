
package com.barclays.homeloan.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class loanAccount {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanAccountId;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seqId")
	private SavingsAccount seqId;
    
    
    @Column
    private int loanAmount;
    
    @Column
    private float loanInterest;
    
    @Column
    private int loanTenure;
    
    @Column
    private String loanStatus;
    

    public loanAccount() {
    }

    public loanAccount(int loanAmount, float loanInterest, int loanTenure, String loanStatus) {
        this.loanAmount = loanAmount;
        this.loanInterest = loanInterest;
        this.loanTenure = loanTenure;
        this.loanStatus = loanStatus;
    }

	public int getLoanAccountId() {
		return loanAccountId;
	}

	public void setLoanAccountId(int loanAccountId) {
		this.loanAccountId = loanAccountId;
	}

	public SavingsAccount getSeqId() {
		return seqId;
	}

	public void setSeqId(SavingsAccount seqId) {
		this.seqId = seqId;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public float getLoanInterest() {
		return loanInterest;
	}

	public void setLoanInterest(float loanInterest) {
		this.loanInterest = loanInterest;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	 	@Override
		public int hashCode() {
			return Objects.hash(loanAccountId, loanAmount, loanInterest, loanStatus, loanTenure, seqId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			loanAccount other = (loanAccount) obj;
			return loanAccountId == other.loanAccountId && loanAmount == other.loanAmount
					&& Float.floatToIntBits(loanInterest) == Float.floatToIntBits(other.loanInterest)
					&& Objects.equals(loanStatus, other.loanStatus) && loanTenure == other.loanTenure
					&& Objects.equals(seqId, other.seqId);
		}

		@Override
		public String toString() {
			return "loanAccount [loanAccountId=" + loanAccountId + ", seqId=" + seqId + ", loanAmount=" + loanAmount
					+ ", loanInterest=" + loanInterest + ", loanTenure=" + loanTenure + ", loanStatus=" + loanStatus
					+ "]";
		}
		
    
}
