package model;

public class Customer extends User{

    private String address;
    private String postCode;
    private int phoneNumber;

    public Customer(String name, String userID, String email, String address,
                    String postCode, int phoneNumber) {
        super(name, userID, email);
        setAddress(address);
        setPostCode(postCode);
        setPhoneNumber(phoneNumber);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // TODO: add a method to check correct post code (2 symbols "-" 4 symbols)

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    // TODO: add a method to check correct phone number (9 symbols and only int)

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
