/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCardOperation;

import CreditCardServiceAdapter.CreditCardAdapter;
import DBOperations.RetriveInformation;
import DBOperations.StoreInformation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.creditcardschema.CreditRootType;

/**
 *
 * @author Amr Saidam
 */
public class RetrivePersonOfCreditCard {

    private static RetriveInformation retriveInformation;

    public RetrivePersonOfCreditCard() {
        this.retriveInformation = new RetriveInformation(new File(StoreInformation.CREDIT_CARD_FILE_NAME));
    }

    public CreditRootType retrivePersonInfo(String PIN) {
        try {
            return CreditCardAdapter.reversingConverterFromCCRToCRT(retriveInformation.getPerson(PIN));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        RetrivePersonOfCreditCard retrivePersonOfCreditCard = new RetrivePersonOfCreditCard();
        CreditRootType creditRootType = retrivePersonOfCreditCard.retrivePersonInfo("4444-4444-4444-5555");
        System.out.println(creditRootType.getCreditCardInfo().getBalance());
    }
}
