/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
public class Bank {
    private double principal;
    private double interestRate;
    private int years;


    public double getMoney(){

        double cents= 100*(principal*(1 + ((interestRate/100)*years)));
        cents = Math.ceil(cents);

        return cents/100.0;

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }
}
