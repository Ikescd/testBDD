package dao;

import bean.PersonBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonDao {

    public void insertIn(PersonBean p) {
        // insère une personne dans la BDD
        try {
            Statement canal = ConnectDB.con.createStatement();

            String lastName = p.getLastName();
            String firstName = p.getFirstName();
            int age = p.getAge();
            String req
                = "INSERT INTO `personne` (`nom`, `prenom`, `age`) VALUES ('"
                + lastName
                + "', '"
                + firstName
                + "', '"
                + age
                + "')";

            canal.executeUpdate(req);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(PersonBean p) {
        // supprime une personne de la BDD
    }

    public PersonBean findById(long id) {
        // Créer le statement depuis la connexion
        PersonBean p = null;
        try {
            Statement canal;
            canal = ConnectDB.con.createStatement();

            ResultSet result = canal.executeQuery(
                "SELECT * FROM personne WHERE id=" + id);
            result.next();

            p = new PersonBean();
            p.setId(result.getInt("id"));
            p.setLastName(result.getString("nom"));
            p.setFirstName(result.getString("prenom"));
            p.setAge(result.getInt("age"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    public List<PersonBean> findAll() {
        // trouve toutes les personnes de la bdd
        return null;
    }

    public List<PersonBean> findAgeSupA(int ageSup) {
        // trouve les personnes dont l'âge est supérieure à...
        return null;
    }
}
