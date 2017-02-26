/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardOperation;

import DBOperations.RetriveInformation;
import DBOperations.StoreInformation;
import Entity.Transaction;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.creditcardschema.MakeSaleType;
import org.netbeans.xml.schema.creditcardschema.SpecificCreditCardType;

/**
 *
 * @author Amr Saidam
 */
public class RetreatFromSale {

    public final static String DONE_STATUS = "Done";
    public final static String INSUFFICIENT_FUND = "InsufficientFund";
    public final static String EXCEPTION = "EXCEPTION";
    private StoreInformation storeInformation;

    public RetreatFromSale() {
        try {
            this.storeInformation = new StoreInformation();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public String dropDiscount(SpecificCreditCardType transactionInformation) {
        try {
            return storeInformation.cancelTransaction(transactionInformation.getPIN(), transactionInformation.getTransactionName());
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

    public static void main(String[] args) {
        RetreatFromSale retreatFromSale = new RetreatFromSale();
        SpecificCreditCardType cardType = new SpecificCreditCardType();
        cardType.setPIN("4444-4444-4444-5555");
        cardType.setTransactionName("cars");
        System.out.println(retreatFromSale.dropDiscount(cardType));
    }
//    public static boolean dropDiscount(SpecificCreditCardType transactionInformation) {
//        try {
//            Transaction transaction = RetriveInformation.getTransactionDetails(transactionInformation);
//            if (transaction == null) {
//                return false;
//            }
//            StoreInformation.wothrawing_updateAccount(transaction.getTransactionInfo().getPIN(), transaction.getTransactionInfo().getPayment());
//            System.out.println("Done");
//            return StoreInformation.deleteTransaction(Integer.parseInt(transaction.getTransactionId()));
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//
}
