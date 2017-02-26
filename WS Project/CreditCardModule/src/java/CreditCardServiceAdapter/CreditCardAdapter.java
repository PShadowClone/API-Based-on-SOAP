/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardServiceAdapter;

import Entity.CancelCreditCard;
import Entity.CreditCard;
import Entity.CreditCardRoot;

import Entity.Sale;
import Entity.Person;
import Entity.Person.UserName;
import org.netbeans.xml.schema.creditcardschema.CreditCardType;
import org.netbeans.xml.schema.creditcardschema.CreditRootType;
import org.netbeans.xml.schema.creditcardschema.MakeSaleType;
import org.netbeans.xml.schema.creditcardschema.PersonInformationType;
import org.netbeans.xml.schema.creditcardschema.SpecificCreditCardType;
import org.netbeans.xml.schema.creditcardschema.UserNameType;

/**
 *
 * @author Amr Saidam
 */
public class CreditCardAdapter {

    public static CreditCard convertingCreditCardTypeToEntities(CreditCardType creditCardType) {

        if (creditCardType == null) {
            return null;
        }
        CreditCard creditCard = new CreditCard();
        creditCard.setBalance(creditCardType.getBalance());
        creditCard.setPin(creditCardType.getPIN());
        creditCard.setExpiredDate(creditCardType.getExpiredDate());

        return creditCard;


    }

    public static Sale convertingMakeSaleTypeToEntities(MakeSaleType makeSaleType) {

        if (makeSaleType == null) {
            return null;
        }

        Sale sale = new Sale();
        sale.setPin(makeSaleType.getPIN());
        sale.setPayment(makeSaleType.getPayment());
        sale.setTransactionName(makeSaleType.getTransactionName());
        return sale;
    }

    public static CancelCreditCard convertingSpecificCreditCardTypeToEntities(SpecificCreditCardType specificCreditCardType) {

        if (specificCreditCardType == null) {
            return null;
        }
        CancelCreditCard cancelCreditCard = new CancelCreditCard();
        cancelCreditCard.setPin(specificCreditCardType.getPIN());
        cancelCreditCard.setTransactionName(specificCreditCardType.getTransactionName());
        return cancelCreditCard;
    }

    public static CreditCardRoot convertingCreditCardRootTypeToEntities(CreditRootType creditRootType) {

        if (creditRootType == null) {
            return null;
        }
        CreditCardRoot cardRoot = new CreditCardRoot();
        CreditCard creditCard = new CreditCard();
        if (creditRootType.getCreditCardInfo() == null) {
            cardRoot.setCreditCardInfo(creditCard);
        } else {
            creditCard.setBalance(creditRootType.getCreditCardInfo().getBalance());
            creditCard.setPin(creditRootType.getCreditCardInfo().getPIN());
            creditCard.setExpiredDate(creditRootType.getCreditCardInfo().getExpiredDate());
            cardRoot.setCreditCardInfo(creditCard);
        }
        Person person = new Person();
        Entity.Person.UserName userName = person.new UserName();
        if (creditRootType.getPerson() == null) {
            cardRoot.setPerson(person);
        } else {

            userName.setFirstName(creditRootType.getPerson().getName().getFirstName());
            userName.setMiddleName(creditRootType.getPerson().getName().getMiddleName());
            userName.setLastName(creditRootType.getPerson().getName().getLastName());
            person.setName(userName);
            person.setAddress(creditRootType.getPerson().getAddress());
            person.setEmail(creditRootType.getPerson().getEmail());
            person.setPhoneNumber(creditRootType.getPerson().getPhoneNumber());

            cardRoot.setPerson(person);
        }


        return cardRoot;
    }

    public static PersonInformationType reversingConverterFromPITToPerson(Person person) {
        if (person == null) {
            return null;
        }
        PersonInformationType personInfo = new PersonInformationType();
        UserNameType userNameType = new UserNameType();
        userNameType.setFirstName(person.getName().getFirstName());
        userNameType.setMiddleName(person.getName().getMiddleName());
        userNameType.setLastName(person.getName().getLastName());
        personInfo.setName(userNameType);
        personInfo.setAddress(person.getAddress());
        personInfo.setEmail(person.getEmail());
        personInfo.setPhoneNumber(person.getPhoneNumber());
        return personInfo;


    }

    public static CreditRootType reversingConverterFromCCRToCRT(CreditCardRoot creditCardRoot) {
        if (creditCardRoot == null) {
            return null;
        }
        CreditRootType creditRootType = new CreditRootType();
        CreditCardType creditCardInfo = new CreditCardType();
        creditCardInfo.setBalance(creditCardRoot.getCreditCardInfo().getBalance());
        creditCardInfo.setExpiredDate(creditCardRoot.getCreditCardInfo().getExpiredDate());
        creditCardInfo.setPIN(creditCardRoot.getCreditCardInfo().getPin());
        PersonInformationType personInformationType = new PersonInformationType();
        UserNameType userNameType = new UserNameType();
        userNameType.setFirstName(creditCardRoot.getPerson().getName().getFirstName());
        userNameType.setMiddleName(creditCardRoot.getPerson().getName().getMiddleName());
        userNameType.setLastName(creditCardRoot.getPerson().getName().getLastName());
        personInformationType.setName(userNameType);
        personInformationType.setEmail(creditCardRoot.getPerson().getEmail());
        personInformationType.setAddress(creditCardRoot.getPerson().getAddress());
        personInformationType.setPhoneNumber(creditCardRoot.getPerson().getPhoneNumber());

        creditRootType.setCreditCardInfo(creditCardInfo);
        creditRootType.setPerson(personInformationType);
        return creditRootType;

    }

    
}
