/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Amr Saidam
 */
public class Person {

    private String personId;
    private String personName;
    private String personAddress;
    private String personEmail;
    private String personPhoneNumber;


    public Person(){}

    public Person(String personName, String personAddress, String personEmail, String personPhoneNumber) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personEmail = personEmail;
        this.personPhoneNumber = personPhoneNumber;
    }

    public Person(String personId, String personName, String personAddress, String personEmail, String personPhoneNumber) {
        this.personId = personId;
        this.personName = personName;
        this.personAddress = personAddress;
        this.personEmail = personEmail;
        this.personPhoneNumber = personPhoneNumber;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }


    public String toString()
    {
        return "person  (" +
                "id : "+this.getPersonId() +"" +
                "name : "+this.getPersonName()+"" +
                "address : "+this.getPersonAddress()+"" +
                "email : "+this.getPersonEmail()+"" +
                "phoneNumber : "+this.getPersonPhoneNumber()+")";
    }

}
