package Entities;

public class Customer {

    int id;
    String firstName;
    String lastname;
    String nationalityId;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastname, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}