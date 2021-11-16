package controller;

import bean.PersonBean;
import dao.ConnectDB;
import dao.PersonDao;

public class Pg {

    public static void main(String[] args) {
        PersonBean p =
            new PersonBean("Martin",
                "Paul",
                11);
        System.out.println("Print p : " +
            p);

        ConnectDB.connect();

        PersonDao daoPerson =
            new PersonDao();
        PersonBean person =
            daoPerson.findById(2);
        System.out.println("Print person : " +
            person);

        daoPerson.insertIn(p);
    }
}
