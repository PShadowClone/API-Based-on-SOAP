/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;

/**
 *
 * @author Amr Saidam
 */
public class CreditCard implements Serializable{

    private String pin;
    private double balance;
    private String expiredDate;

    public CreditCard() {
    }

    public CreditCard(String pin, double balance, String expiredDate) {
        this.pin = pin;
        this.balance = balance;
        this.expiredDate = expiredDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


}
