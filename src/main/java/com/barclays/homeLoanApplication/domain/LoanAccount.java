package com.barclays.homeLoanApplication.domain;

import javax.persistence.*;

@Entity
@Table
public class LoanAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanAccountNumber;
    @Column
    private int loanAmount;
    @Column
    private float loanInterest;
    @Column
    private int loanTenure;
    @Column
    private String loanStatus;

    public LoanAccount() {
    }

    public LoanAccount(int loanAmount, float loanInterest, int loanTenure, String loanStatus) {
        this.loanAmount = loanAmount;
        this.loanInterest = loanInterest;
        this.loanTenure = loanTenure;
        this.loanStatus = loanStatus;
    }

    public int getLoanAccountNumber() {
        return loanAccountNumber;
    }

    public void setLoanAccountNumber(int loanAccountNumber) {
        this.loanAccountNumber = loanAccountNumber;
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
}
