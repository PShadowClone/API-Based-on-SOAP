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
public class Sale implements Serializable {

    public String pin;
    public String payment;
    public String transactionName;

    public Sale() {
    }

    public Sale(String pin, String payment, String transactionName) {
        this.pin = pin;
        this.payment = payment;
        this.transactionName = transactionName;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    @Override
    public String toString() {
        return "TransactionName : " + this.getTransactionName() + " , TransactionPayment : " + this.getPayment() + " , PIN : " + this.getPin();
    }
}
