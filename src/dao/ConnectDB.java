package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {

    static Connection con =
        null;

    static public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost/coursbdd",
                    "root",
                    "");

            Statement canal =
                con.createStatement();

            ResultSet result;
            result =
                canal.executeQuery("SELECT * FROM personne");

            while (result.next()) {
                String name =
                    result.getString("nom");
                System.out.println("Nom : " + name);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Bien connecté.e à la base de données !");

    }
}
