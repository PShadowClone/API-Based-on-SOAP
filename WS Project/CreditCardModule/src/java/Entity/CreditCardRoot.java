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
public class CreditCardRoot implements Serializable{

    private Person person;
    private CreditCard creditCardInfo;

    public CreditCardRoot() {
    }

    public CreditCardRoot(Person person, CreditCard creditCardInfo) {
        this.person = person;
        this.creditCardInfo = creditCardInfo;
    }

    public CreditCard getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCard creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
