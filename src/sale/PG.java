package sale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PG {

    public static void main(String[] args) {
        try {
            /*
             * Permet d'appeler / activer le driver JBDC afin de permettre la
             * connexion à la BDD
             */
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =
                DriverManager.getConnection(
                    // "lien" de la BDD
                    "jdbc:mysql://localhost/coursbdd",
                    // Nom d'utilisateur
                    "root",
                    // Mot de passe, souvent vide !
                    "");

            /*
             * On ouvre un canal pour lancer une requête
             */
            Statement canal =
                con.createStatement();

            /*
             * Lancer des requêtes
             * query > Consultations
             * update > Modifications
             */
            ResultSet result;
            // ResultSet : ligne et colonnes

            result =
                canal.executeQuery("SELECT * FROM personne");

            // Aller sur la première ligne de la matrice
            while (result.next()) {
                String name =
                    result.getString("nom");
                System.out.println(name);
            }
        } catch (Exception ex) {
            /*
             * Exception permet d'englober les différentes exceptions et
             * d'éviter le multi-catch
             */
            System.out.println("Connexion non faite");
        }

        System.out.println("Tout est ok.");
    }
}
