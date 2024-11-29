package model;

abstract class User {

    private String name;
    private String userID;
    private String email;

    // create a constructor
    User(String name, String userID, String email) {
        setName(name);
        setUserID(userID);
        setEmail(email);
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
}
