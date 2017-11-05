package model1.model;

public class User extends ModelBase {

    private String firstName, lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        onModelChanged("firstName");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        onModelChanged("lastName");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        onModelChanged("age");
    }

}
