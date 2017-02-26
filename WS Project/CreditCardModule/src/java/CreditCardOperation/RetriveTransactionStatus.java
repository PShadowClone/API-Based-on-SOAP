/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardOperation;

import DBOperations.RetriveInformation;
import DBOperations.StoreInformation;
import Entity.Transaction;
import java.io.File;
import Entity.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.creditcardschema.SpecificCreditCardType;

/**
 *
 * @author Amr Saidam
 */
public class RetriveTransactionStatus {

    private static RetriveInformation retriveInformation;
    public final static String DONE_STATUS = "Done";
    public final static String INSUFFICIENT_FUND = "InsufficientFund";
    public final static String EXCEPTION = "EXCEPTION";

    public RetriveTransactionStatus() {
        this.retriveInformation = new RetriveInformation(new File(StoreInformation.TRANSACTION_FILE_NAME));
    }

    public static String retriveTransaction(SpecificCreditCardType debitOperationInfo) {
        try {
            Sale sale = retriveInformation.getTransaction(debitOperationInfo.getPIN(), debitOperationInfo.getTransactionName());
            if (sale == null) {
                return StoreInformation.ISNOT_EXSISTED;
            }
            return sale.toString();
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
        SpecificCreditCardType specificCreditCardType  =new SpecificCreditCardType();
        specificCreditCardType.setPIN("4444-4444-4444-5555");
        specificCreditCardType.setTransactionName("cars");
        RetriveTransactionStatus retriveTransactionStatus = new RetriveTransactionStatus();
        String result = retriveTransactionStatus.retriveTransaction(specificCreditCardType);
        System.out.println(result);

    }
}
