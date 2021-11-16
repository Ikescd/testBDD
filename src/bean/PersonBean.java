package bean;

import dao.DaoTEMPLATE;
import java.util.List;

public class PersonBean  {

    private long id;
    private String lastName;
    private String firstName;
    private int age;

    // pojo plain old Java object : 
    public PersonBean(String lastName,
        String firstName,
        int age) {
        super();
        this.firstName =
            firstName;
        this.lastName =
            lastName;
        this.age =
            age;
    }

    public PersonBean() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id =
            id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName =
            lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName =
            firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age =
            age;
    }

}
