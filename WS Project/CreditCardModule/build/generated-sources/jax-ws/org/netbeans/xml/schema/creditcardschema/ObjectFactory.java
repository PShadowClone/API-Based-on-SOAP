
package org.netbeans.xml.schema.creditcardschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.creditcardschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreditCard_QNAME = new QName("http://xml.netbeans.org/schema/creditCardSchema", "creditCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.creditcardschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserNameType }
     * 
     */
    public UserNameType createUserNameType() {
        return new UserNameType();
    }

    /**
     * Create an instance of {@link CreditRootType }
     * 
     */
    public CreditRootType createCreditRootType() {
        return new CreditRootType();
    }

    /**
     * Create an instance of {@link CreditCardType }
     * 
     */
    public CreditCardType createCreditCardType() {
        return new CreditCardType();
    }

    /**
     * Create an instance of {@link MakeSaleType }
     * 
     */
    public MakeSaleType createMakeSaleType() {
        return new MakeSaleType();
    }

    /**
     * Create an instance of {@link PersonInformationType }
     * 
     */
    public PersonInformationType createPersonInformationType() {
        return new PersonInformationType();
    }

    /**
     * Create an instance of {@link SpecificCreditCardType }
     * 
     */
    public SpecificCreditCardType createSpecificCreditCardType() {
        return new SpecificCreditCardType();
    }

    /**
     * Create an instance of {@link RequestedBalance }
     * 
     */
    public RequestedBalance createRequestedBalance() {
        return new RequestedBalance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditRootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/creditCardSchema", name = "creditCard")
    public JAXBElement<CreditRootType> createCreditCard(CreditRootType value) {
        return new JAXBElement<CreditRootType>(_CreditCard_QNAME, CreditRootType.class, null, value);
    }

}
