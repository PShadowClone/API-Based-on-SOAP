/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import Entity.FilghtServiceEntity;
import Entity.Person;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amr Saidam
 */
public class RetriveInformation {

    private File file;

    public RetriveInformation(File file) {
        this.file = file;

    }

    public List<FilghtServiceEntity> retriveFlightReservationsList() throws FileNotFoundException, IOException, ClassNotFoundException {
        if (this.file.length() <= 0) {
            return new ArrayList<FilghtServiceEntity>();
        }

        return getList(file);


    }

    private List<FilghtServiceEntity> getList(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<FilghtServiceEntity> reservations = (List<FilghtServiceEntity>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return reservations;

    }
//
//    private static List<Person> persons = new ArrayList<Person>();
//
//    public static void retriveAllPersons() {
//        Connection connection = null;
//        Statement statement = null;
//        try {
//            String myDriver = "org.gjt.mm.mysql.Driver";
//            String myUrl = "jdbc:mysql://localhost/frs_db";
//            Class.forName(myDriver);
//            connection = DriverManager.getConnection(myUrl, "root", "");
//            String query = "SELECT * FROM person";
//            statement  = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while(resultSet.next())
//            {
//                persons.add(new Person(resultSet.getString("name"),
//                        resultSet.getString("address"),
//                        resultSet.getString("email"),
//                        resultSet.getString("phoneNumber")));
//
//            }
//        } catch (Exception exception) {
//            exception.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (Exception exception) {
//                exception.printStackTrace();
//            }
//        }
//    }
//
//    public static List<Person> getPersons()
//    {
//        retriveAllPersons();
//        return persons;
//    }
}
