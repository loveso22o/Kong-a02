/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Seoyoung Kong
 */
public class converter {

    private double euros;
    private double exchangeRate;

    public double convertEurosToDollars(){

        double dollars = euros *exchangeRate;

        double cents = (dollars * 100);

        return Math.ceil(cents) / 100.0;


    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public double getRate() {
        return exchangeRate;
    }

    public void exchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
