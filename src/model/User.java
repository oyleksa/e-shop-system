package model;

public abstract class User {

    private String name;
    private String userID;
    private String email;
    private String password;

    // create a constructor
    User(String name, String userID, String email, String password) {
        setName(name);
        setUserID(userID);
        setEmail(email);
        setPassword(password);
    }

    //TODO: add a method that check not null input

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
