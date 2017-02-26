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
public class Person implements Serializable {

    public UserName name;
    public String phoneNumber;
    public String email;
    public String address;

    public Person() {
    }

    public Person(UserName name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserName getName() {
        return name;
    }

    public void setName(UserName name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public class UserName implements Serializable{

        private String firstName;
        private String middleName;
        private String lastName;

        public UserName(String firstName, String middleName, String lastName) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        public UserName(){}

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        @Override
        public String toString() {
            return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
        }
    }
}

