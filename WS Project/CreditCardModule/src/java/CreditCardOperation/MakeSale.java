/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardOperation;

import CreditCardServiceAdapter.CreditCardAdapter;
import DBOperations.RetriveInformation;
import DBOperations.StoreInformation;
import java.io.File;
import Entity.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.creditcardschema.CreditCardType;
import org.netbeans.xml.schema.creditcardschema.CreditRootType;
import org.netbeans.xml.schema.creditcardschema.MakeSaleType;
import org.netbeans.xml.schema.creditcardschema.PersonInformationType;
import org.netbeans.xml.schema.creditcardschema.UserNameType;

/**
 *
 * @author Amr Saidam
 */
public class MakeSale {

    public final static String DONE_STATUS = "Done";
    public final static String INSUFFICIENT_FUND = "InsufficientFund";
    public final static String EXCEPTION = "EXCEPTION";
    private StoreInformation storeInformation;
    private RetriveInformation retriveInformation;

    public MakeSale() {
        try {
            this.storeInformation = new StoreInformation();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        this.retriveInformation = new RetriveInformation(new File(StoreInformation.CREDIT_CARD_FILE_NAME));
    }

//    }
//
    public String saveCreditCard(CreditRootType cardType) {
        try {
            CreditCardRoot creditCardRoot = CreditCardAdapter.convertingCreditCardRootTypeToEntities(cardType);

            System.out.println("CreditCard " + creditCardRoot.getCreditCardInfo());
            System.out.println("Person :" + creditCardRoot.getPerson());
            return storeInformation.saveCreditCardInfo(creditCardRoot);
        } catch (IOException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        }
    }

    public boolean checkCreditCard(double balance) {
        try {
            return retriveInformation.checkCreditCardFund(balance);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return false;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public static void main(String[] args) {
      
//        MakeSale makeSale = new MakeSale();
//        CreditRootType creditRootType = new CreditRootType();
//        CreditCardType cardType = new CreditCardType();
//        cardType.setBalance(3000);
//        cardType.setPIN("4444-4444-4444-5555");
//        cardType.setExpiredDate("12-12-2012");
//
//
//        PersonInformationType personInfo = new PersonInformationType();
//        personInfo.setAddress("gaza");
//        personInfo.setEmail("2323");
//        personInfo.setPhoneNumber("233241413");
//        UserNameType userNameType = new UserNameType();
//        userNameType.setFirstName("Ali6");
//        userNameType.setMiddleName("mostafa");
//        userNameType.setLastName("Saidam");
//        personInfo.setName(userNameType);
//        creditRootType.setCreditCardInfo(cardType);
//        creditRootType.setPerson(personInfo);
//        makeSale.saveCreditCard(creditRootType);
//
//        MakeSaleType transaction = new MakeSaleType();
//        transaction.setPIN("4444-4444-4444-5555");
//        transaction.setPayment(30000);
//        transaction.setTransactionName("cars");
//        String result = makeSale.makeSale(transaction);
//        System.out.println(result);
    }
//

    public String makeSale(MakeSaleType makeSaleInstance) {
        try {
            Sale sale = CreditCardAdapter.convertingMakeSaleTypeToEntities(makeSaleInstance);
            return storeInformation.saveTransactions(sale, new File(StoreInformation.TRANSACTION_FILE_NAME));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        } catch (IOException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        }
    }

  
//
//    public boolean creditCardValidation(String PIN, double transactionPayment) throws ClassNotFoundException, SQLException {
//        CreditCardType creditCardType = RetriveInformation.checkCreditCardExisting(PIN);
//        return transactionPayment <= creditCardType.getBalance() ? true : false;
//    }
//
//    public void saveTransaction(MakeSaleType makeSaleInstance) throws ClassNotFoundException, SQLException {
//        String transactionStatus = "";
//        boolean cardStatus = creditCardValidation(makeSaleInstance.getPIN(), makeSaleInstance.getPayment());
//        if (cardStatus) {
//            transactionStatus = DONE_STATUS;
//        } else {
//            transactionStatus = INSUFFICIENT_FUND;
//        }
//        StoreInformation.storeTransactionInfo(makeSaleInstance, transactionStatus);
//
//    }
//
//    public boolean makeSale(MakeSaleType makeSaleInstance) {
//        try {
//            boolean cardStatus = creditCardValidation(makeSaleInstance.getPIN(), makeSaleInstance.getPayment());
//            if (!cardStatus) {
//                return false;
//            }
//            saveTransaction(makeSaleInstance);
//            return StoreInformation.updateAccount(makeSaleInstance.getPIN(), makeSaleInstance.getPayment());
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//
//    }
}
