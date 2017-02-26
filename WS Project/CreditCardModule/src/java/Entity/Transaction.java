package Entity;

import java.io.Serializable;
import org.netbeans.xml.schema.creditcardschema.MakeSaleType;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amr Saidam
 */
public class Transaction implements Serializable{

    private String transactionId;
    private MakeSaleType transactionInfo;
    private String transactionStatus;
    private String transactionDate;
    

    public Transaction(){}

    public Transaction(MakeSaleType transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public Transaction(String transactionId, MakeSaleType transactionInfo) {
        this.transactionId = transactionId;
        this.transactionInfo = transactionInfo;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public MakeSaleType getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(MakeSaleType transactionInfo) {
        this.transactionInfo = transactionInfo;
    }


    

}
