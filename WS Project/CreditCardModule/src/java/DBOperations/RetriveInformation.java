/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import CreditCardOperation.MakeSale;
import Entity.Transaction;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.xml.schema.creditcardschema.CreditCardType;
import org.netbeans.xml.schema.creditcardschema.CreditRootType;
import org.netbeans.xml.schema.creditcardschema.MakeSaleType;
import org.netbeans.xml.schema.creditcardschema.PersonInformationType;
import org.netbeans.xml.schema.creditcardschema.SpecificCreditCardType;
import org.netbeans.xml.schema.creditcardschema.UserNameType;
import Entity.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Amr Saidam
 */
public class RetriveInformation {

    private File file;

    public RetriveInformation(File file) {
        this.file = file;
    }

    public List<CreditCardRoot> retriveCards(File file) throws FileNotFoundException, IOException, ClassNotFoundException {

        if (file.length() <= 0) {
            System.out.println("Done");
            return new ArrayList<CreditCardRoot>();

        }


        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<CreditCardRoot> creditCards = (List<CreditCardRoot>) objectInputStream.readObject();
        return creditCards;
    }

    public boolean checkCreditAuthorization(File file, CreditCardRoot creditCard) throws ClassNotFoundException, IOException {
        List<CreditCardRoot> creditCards = retriveCards(file);
        if (creditCards.isEmpty()) {
            return true;
        }
        for (CreditCardRoot tempCreditCard : creditCards) {
            System.out.println(creditCard.getPerson().getName().toString() + "#@#");
            System.out.println(tempCreditCard.getPerson().getName().toString() + "$$$");
            if (creditCard.getPerson().getName().toString().equalsIgnoreCase(tempCreditCard.getPerson().getName().toString()) && tempCreditCard.getCreditCardInfo().getPin().equalsIgnoreCase(creditCard.getCreditCardInfo().getPin())) {
                return false;
            }
        }
        return true;
    }

    public boolean checkCreditCardFund(double requestedBalance) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<CreditCardRoot> creditCards = retriveCards(file);
        for (CreditCardRoot tempCreditCard : creditCards) {
            if (tempCreditCard.getCreditCardInfo().getBalance() >= requestedBalance) {
                return true;
            }
        }
        return false;

    }

    public CreditCardRoot getPerson(String PIN) throws FileNotFoundException, FileNotFoundException, IOException, ClassNotFoundException {
        List<CreditCardRoot> creditCards = retriveCards(file);
        for (CreditCardRoot tempCreditCard : creditCards) {
            if (tempCreditCard.getCreditCardInfo().getPin().equalsIgnoreCase(PIN)) {
                return tempCreditCard;
            }
        }
        return null;
    }

    public List<Sale> retriveTransactions(File file) throws FileNotFoundException, IOException, ClassNotFoundException {

        if (file.length() <= 0) {
            return new ArrayList<Sale>();
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Sale> creditCards = (List<Sale>) objectInputStream.readObject();
        return creditCards;
    }

    public CreditCard getCreditCard(String PIN) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<CreditCardRoot> creditCards = retriveCards(file);
        for (CreditCardRoot tempCreditCard : creditCards) {
            if (tempCreditCard.getCreditCardInfo().getPin().equalsIgnoreCase(PIN)) {
                return tempCreditCard.getCreditCardInfo();
            }
        }
        return null;
    }

    public Sale getTransaction(String PIN, String transactionName) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Sale> sales = retriveTransactions(file);
        if (sales == null) {
            return null;
        }

        for (Sale sale : sales) {
            if (sale.getPin().equalsIgnoreCase(PIN) && sale.getTransactionName().equalsIgnoreCase(transactionName)) {
                return sale;
            }
        }
        return null;
    }
//
//    private final static String DB_URL = "jdbc:mysql://localhost/frs_db";
//    private static Connection connection = null;
//    private static PreparedStatement preparedStatement = null;
//    private final static String FETCH_ALL_CREDIT_CARDS = "SELECT * FROM creditcards WHERE creditNumber = ?";
//    private final static String FETCH_TRANSACTION = "SELECT * FROM sale WHERE salePIN = ? AND saleTransaction  = ? AND saleStatus = ?";
//    private final static String FETCH_PERSON_INFO = "SELECT * FROM person WHERE personId = (SELECT personId FROM creditcards WHERE creditNumber = ?)";
//    private final static String FETCH_SPECIFIC_TRANSACTION = "SELECT * FROM sale WHERE salePIN = ? AND saleTransaction = ?";
//
//    public static CreditCardType checkCreditCardExisting(String PIN) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_ALL_CREDIT_CARDS);
//        preparedStatement.setString(1, "" + PIN + "");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        CreditCardType creditInfo = null;
//        creditInfo = returnCreditInfo(resultSet);
//        System.out.println(resultSet.getRow());
//        System.out.println(resultSet.next());
////        if (!resultSet.next()) {
////            creditInfo = null;
////        } else {
////            creditInfo = new CreditCardType();
////
////        }
//        closeDBSession();
//        return creditInfo;
//    }
//
//    public static Transaction getTransactionDetails(SpecificCreditCardType transactionInfo) throws ClassNotFoundException, SQLException {
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_TRANSACTION);
//        preparedStatement.setString(1, transactionInfo.getPIN());
//        preparedStatement.setString(2, transactionInfo.getTransactionName());
//        preparedStatement.setString(3, MakeSale.DONE_STATUS);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (!resultSet.next()) {
//            return null;
//        }
//        resultSet.afterLast();
//        Transaction transaction = new Transaction();
//        MakeSaleType makeSale = new MakeSaleType();
//        while (resultSet.previous()) {
//            transaction.setTransactionId("" + resultSet.getInt("saleId"));
//            makeSale.setPIN(resultSet.getString("salePIN"));
//            makeSale.setPayment(resultSet.getDouble("salePayment"));
//            makeSale.setTransactionName(resultSet.getString("saleTransaction"));
//        }
//
//        transaction.setTransactionInfo(makeSale);
//        closeDBSession();
//        return transaction;
//
//    }
//
//    public static CreditRootType retriveCreditCardPerson(String PIN) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_PERSON_INFO);
//        preparedStatement.setString(1, PIN);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (!resultSet.next()) {
//            return null;
//        }
//
//        CreditRootType allPersonInfo = new CreditRootType();
//        PersonInformationType personInfo = new PersonInformationType();
//        while (resultSet.next()) {
//            UserNameType userName = new UserNameType();
//            userName.setFirstName(resultSet.getString("firstName"));
//            userName.setMiddleName(resultSet.getString("middleName"));
//            userName.setLastName(resultSet.getString("lastName"));
//            personInfo.setName(userName);
//            personInfo.setAddress(resultSet.getString("address"));
//            personInfo.setEmail(resultSet.getString("email"));
//            personInfo.setPhoneNumber(resultSet.getString("phoneNumber"));
//
//        }
//        allPersonInfo.setPerson(personInfo);
//        allPersonInfo.setCreditCardInfo(checkCreditCardExisting(PIN));
//        closeDBSession();
//        return allPersonInfo;
//    }
//
//    public static Transaction getSpecificTransaction(SpecificCreditCardType specificCreditCardType) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_SPECIFIC_TRANSACTION);
//        preparedStatement.setString(1, specificCreditCardType.getPIN());
//        preparedStatement.setString(2, specificCreditCardType.getTransactionName());
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (!resultSet.next()) {
//            return null;
//        }
//        resultSet.afterLast();
//        System.out.println("Here");
//        Transaction transaction = new Transaction();
//        while (resultSet.previous()) {
//
//            System.out.println(resultSet.getString("salePIN"));
//            transaction.setTransactionId("" + resultSet.getInt("saleId"));
//            MakeSaleType makeSale = new MakeSaleType();
//            makeSale.setPIN(resultSet.getString("salePIN"));
//            makeSale.setPayment(resultSet.getDouble("salePayment"));
//            makeSale.setTransactionName(resultSet.getString("saleTransaction"));
//            transaction.setTransactionInfo(makeSale);
//            transaction.setTransactionStatus(resultSet.getString("saleStatus"));
//            transaction.setTransactionDate("" + resultSet.getDate("created_at"));
//            System.out.println(transaction.getTransactionStatus());
//
//        }
//
//        closeDBSession();
//        return transaction;
//    }
//
//    private static void setConnectionHeadr() throws ClassNotFoundException, SQLException {
//        String myDriver = "org.gjt.mm.mysql.Driver";
//        connection = DriverManager.getConnection(DB_URL, "root", "");
//        Class.forName(myDriver);
//    }
//
//    private static void closeDBSession() throws SQLException {
//        if (connection != null) {
//            connection.close();
//        }
//        if (preparedStatement != null) {
//            preparedStatement.close();
//        }
//    }
//
//    private static CreditCardType returnCreditInfo(ResultSet resultSet) throws SQLException {
//        CreditCardType creditInfo = new CreditCardType();
//        while (resultSet.next()) {
//            creditInfo.setPIN(resultSet.getString("creditNumber"));
//            creditInfo.setExpiredDate(resultSet.getString("expireDate"));
//            creditInfo.setBalance(resultSet.getDouble("balance"));
//        }
//        return creditInfo;
//    }
}
