/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardPackage;

import CreditCardOperation.MakeSale;
import CreditCardOperation.RetreatFromSale;
import CreditCardOperation.RetrivePersonOfCreditCard;
import CreditCardOperation.RetriveTransactionStatus;
import javax.ejb.Stateless;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.creditcardmodule.creditcardwsdl.CreditCardWSDLPortType;

/**
 *
 * @author Amr Saidam
 */
@WebService(serviceName = "CreditCardWSDLService", portName = "CreditCardWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.creditcardmodule.creditcardwsdl.CreditCardWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/CreditCardModule/CreditCardWSDL", wsdlLocation = "META-INF/wsdl/CreditCardService/CreditCardWSDLWrapper.wsdl")
@Stateless
public class CreditCardService implements CreditCardWSDLPortType {

    public double checkRservationsBalance(org.netbeans.xml.schema.creditcardschema.RequestedBalance checkRservationsBalanceInfo) {
        //TODO implement this method
        return checkRservationsBalanceInfo.getCarReservationBalance() + checkRservationsBalanceInfo.getHotelReservationBalance();
    }

    public java.lang.String creditCardSale(org.netbeans.xml.schema.creditcardschema.CreditRootType creditInfo) {
        MakeSale makeSale = new MakeSale();
        return makeSale.saveCreditCard(creditInfo);

    }

    public java.lang.String debitCardSale(org.netbeans.xml.schema.creditcardschema.MakeSaleType saleInfo) {
        MakeSale makeSale = new MakeSale();
        return makeSale.makeSale(saleInfo);
    }

    public java.lang.String cancelCreditCardSale(org.netbeans.xml.schema.creditcardschema.SpecificCreditCardType cancelSaleInfo) {
        //TODO implement this method
        RetreatFromSale retreatFromSale = new RetreatFromSale();
        return retreatFromSale.dropDiscount(cancelSaleInfo);
    }

    public org.netbeans.xml.schema.creditcardschema.CreditRootType creditCardUserDetail(java.lang.String pin) {
        RetrivePersonOfCreditCard retrivePersonOfCreditCard = new RetrivePersonOfCreditCard();
        return retrivePersonOfCreditCard.retrivePersonInfo(pin);
    }

    public java.lang.String checkCardDebitStatus(org.netbeans.xml.schema.creditcardschema.SpecificCreditCardType debitOperationInfo) {
        RetriveTransactionStatus retriveTransactionStatus = new RetriveTransactionStatus();
        return retriveTransactionStatus.retriveTransaction(debitOperationInfo);
    }
}
