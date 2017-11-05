package model3;

public class Model {
    private String password;

    Model() {
        password = "password"; //just set a default password.
    }

    public void setPassword(String pass) {
        password = pass;
    }

    public String getPassword() {
        return password;
    }
}


