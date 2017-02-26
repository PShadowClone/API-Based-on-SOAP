/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

//import Entity.Person;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.creditcardschema.CreditCardType;
import org.netbeans.xml.schema.creditcardschema.MakeSaleType;
import Entity.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

/**
 *
 * @author Amr Saidam
 */
public class StoreInformation {

    private File file;
    public final static String INSUFFICIENT_FUND = "Insufficient Fund";
    public final static String CREDIT_CARD_FILE_NAME = "CreditCard.dat";
    public final static String TRANSACTION_FILE_NAME = "Transaction.dat";
    public final static String UNAUTHORIZED_PEROSN = "Unauhtorized Person!";
    public final static String ISNOT_EXSISTED = "is not existed";
    public final static String DONE = "Done!";
    private RetriveInformation retriveInformation;

    public StoreInformation() throws IOException {
        file = new File(CREDIT_CARD_FILE_NAME);

        if (!file.exists()) {
            file.createNewFile();
        }
        retriveInformation = new RetriveInformation(file);
    }

    public String saveCreditCardInfo(CreditCardRoot cardRoot) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<CreditCardRoot> creditCards = retriveInformation.retriveCards(file);
        if (!retriveInformation.checkCreditAuthorization(file, cardRoot)) {
            return UNAUTHORIZED_PEROSN;
        }
        creditCards.add(cardRoot);
        saveCreditCardOperation(creditCards, file);
        return DONE;
    }

    private void saveCreditCardOperation(List<CreditCardRoot> creditCards, File file) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(creditCards);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    public String saveTransactions(Sale sale, File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Sale> transactions = retriveInformation.retriveTransactions(file);

        transactions.add(sale);

        CreditCard creditCard = retriveInformation.getCreditCard(sale.getPin());
        if (creditCard == null) {
            return ISNOT_EXSISTED;
        }

        if (getPayment(sale.getPayment(), creditCard.getBalance()) > creditCard.getBalance()) {
            return INSUFFICIENT_FUND;
        }
        saveTransactionOperation(transactions, file);
        System.out.println("Dons");
        creditCard.setBalance(creditCard.getBalance() - Double.parseDouble("" + sale.getPayment()));
        System.out.println(creditCard.getBalance());
        updateCardBalance(creditCard, this.file);
        return DONE;
    }

    private void saveTransactionOperation(List<Sale> sales, File file) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sales);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    private boolean updateCardBalance(CreditCard creditCard, File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<CreditCardRoot> creditCards = retriveInformation.retriveCards(file);
        for (CreditCardRoot tempCreditCard : creditCards) {
            if (tempCreditCard.getCreditCardInfo().getPin().equalsIgnoreCase(creditCard.getPin())) {
                tempCreditCard.getCreditCardInfo().setBalance(creditCard.getBalance());
                saveCreditCardOperation(creditCards, file);
                return true;
            }
        }

        return false;
    }

    public String cancelTransaction(String PIN, String transactionName) throws FileNotFoundException, IOException, ClassNotFoundException {
        Sale sale = removeTransaction(PIN, transactionName, new File(StoreInformation.TRANSACTION_FILE_NAME));
        if (sale == null) {
            return ISNOT_EXSISTED;
        }


        boolean result = retriveDiscount(PIN, Double.parseDouble(sale.getPayment()));
        return result == true ? DONE : ISNOT_EXSISTED;
    }

    private Sale removeTransaction(String PIN, String transactionName, File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Sale> transactions = retriveInformation.retriveTransactions(file);
        for (Sale sale : transactions) {
            if (sale.getPin().equalsIgnoreCase(PIN) && sale.getTransactionName().equalsIgnoreCase(transactionName)) {
                transactions.remove(sale);
                saveTransactionOperation(transactions, file);
                return sale;
            }
        }

        return null;
    }

    private boolean retriveDiscount(String PIN, double retrivedBalance) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<CreditCardRoot> creditCards = retriveInformation.retriveCards(file);
        for (CreditCardRoot tempCreditCard : creditCards) {
            if (tempCreditCard.getCreditCardInfo().getPin().equalsIgnoreCase(PIN)) {
                tempCreditCard.getCreditCardInfo().setBalance(tempCreditCard.getCreditCardInfo().getBalance() + retrivedBalance);
                saveCreditCardOperation(creditCards, file);
                return true;
            }
        }

        return false;
    }

    private static double getPayment(String payment, double balance) {
        String[] paymetnsPart = payment.split("-");

        try {

            double base = Double.parseDouble(paymetnsPart[0]);
            double limit = Double.parseDouble(paymetnsPart[1]);
            if (limit > balance) {
                limit = balance;
            } else {
                return limit;
            }

            Random random = new Random((long) limit);
            double result = random.nextDouble();
            Double r = new Double(result);

            //System.out.println("Integer "+ new Integer(""+r.floatValue()));
            return base + random.nextDouble() - 1;
        } catch (ArrayIndexOutOfBoundsException exception) {
            return Double.parseDouble(payment);
        }

    }

    public static void main(String[] args) {
        System.out.println(Double.parseDouble("" + getPayment("32.0-32.0", 300)));
    }
//
//    private final static String DB_URL = "jdbc:mysql://localhost/frs_db";
//    private static Connection connection = null;
//    private static PreparedStatement preparedStatement = null;
//    private final static String INSERT_CREDIT_CARD = "INSERT INTO creditcards(creditNumber,expireDate,balance) VALUES (?,?,?)";
//    private final static String TRANSACTION_INSERTION = "INSERT INTO sale(saleTransaction,salePIN,salePayment,saleStatus) VALUES (?,?,?,?)";
//    private final static String UPDATE_ACCOUNT = "UPDATE creditcards SET balance = balance - ? WHERE creditNumber = ? ";
//    private final static String WITHDRAWING_UPDATE_ACCOUNT = "UPDATE creditcards SET balance = balance + ? WHERE creditNumber = ? ";
//    private final static String DELETE_TRANSACTION = "DELETE FROM sale WHERE saleId = ?";
//
//    public static CreditCardType storeCreditInfo(org.netbeans.xml.schema.creditcardschema.CreditCardType creditInfo) {
//        CreditCardType creditInfoResult = new CreditCardType();
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(INSERT_CREDIT_CARD);
//            preparedStatement.setString(1, creditInfo.getPIN());
//            preparedStatement.setString(2, creditInfo.getExpiredDate());
//            preparedStatement.setDouble(3, Double.parseDouble("" + creditInfo.getBalance()));
//            preparedStatement.execute();
//            return RetriveInformation.checkCreditCardExisting(creditInfo.getPIN());
//        } catch (ClassNotFoundException ex) {
//            return null;
//
//        } catch (SQLException ex) {
//            if (ex instanceof MySQLIntegrityConstraintViolationException) {
//                try {
//                    return RetriveInformation.checkCreditCardExisting(creditInfo.getPIN());
//
//                } catch (ClassNotFoundException ex1) {
//                    return null;
//                } catch (SQLException ex1) {
//                    return null;
//                }
//            }
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return null;
//
//            }
//        }
//
//        return null;
//    }
//
//    public static boolean storeTransactionInfo(MakeSaleType makeSaleInstance, String status) {
//        MakeSaleType makeSale = new MakeSaleType();
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(TRANSACTION_INSERTION);
//            preparedStatement.setString(1, makeSaleInstance.getTransactionName());
//            preparedStatement.setString(2, makeSaleInstance.getPIN());
//            preparedStatement.setDouble(3, makeSaleInstance.getPayment());
//            preparedStatement.setString(4, status);
//            preparedStatement.execute();
//            return true;
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//            return false;
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
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
//    public static boolean updateAccount(String PIN, double payment) {
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(UPDATE_ACCOUNT);
//
//            preparedStatement.setDouble(1, payment);
//            preparedStatement.setString(2, PIN);
//            int updateResult = preparedStatement.executeUpdate();
//            if (updateResult == 1) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//            return false;
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//
//    }
//
//    public static boolean wothrawing_updateAccount(String PIN, double payment) {
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(WITHDRAWING_UPDATE_ACCOUNT);
//
//            preparedStatement.setDouble(1, payment);
//            preparedStatement.setString(2, PIN);
//            int updateResult = preparedStatement.executeUpdate();
//            if (updateResult == 1) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//            return false;
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//
//    }
//
//    public static boolean deleteTransaction(int transactionId) {
//        try {
//            setConnectionHeadr();
//            preparedStatement = connection.prepareStatement(DELETE_TRANSACTION);
//            preparedStatement.setInt(1, transactionId);
//            int deletionResult = preparedStatement.executeUpdate();
//            if (deletionResult == 1) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//
//    }
//
//    private static void setConnectionHeadr() throws ClassNotFoundException, SQLException {
//        // "org.gjt.mm.mysql.Driver"
//        String myDriver = "com.mysql.jdbc.jdbc2.optional.MysqlDataSource";
//        connection = DriverManager.getConnection(DB_URL, "root", "");
//        Class.forName(myDriver);
//    }
    /************************************************************************************
     * **********************************************************************************
     ************************************************************************************/
}
