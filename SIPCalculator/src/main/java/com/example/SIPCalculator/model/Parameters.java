package com.example.SIPCalculator.model;

public class Parameters {
    private double principal;

    private double interest;

    private int noOfyears;

    private double amount;


    public double getPrincipal() {
        return principal;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


    public void setPrincipal(double principal) {
        this.principal = principal;
    }


    public double getInterest() {
        return interest;
    }


    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getInterestEarned() {
        return interest;
    }

    public int getNoOfyears() {
        return noOfyears;
    }

    public void setNoOfyears(int noOfyears) {
        this.noOfyears = noOfyears;
    }
}
