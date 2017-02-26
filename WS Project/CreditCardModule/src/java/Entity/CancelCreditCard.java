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
public class CancelCreditCard implements Serializable{

    private String pin;
    private String transactionName;

    public CancelCreditCard() {
    }

    public CancelCreditCard(String pin, String transactionName) {
        this.pin = pin;
        this.transactionName = transactionName;
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



}
