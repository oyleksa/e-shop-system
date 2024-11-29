package model;

public class PhysicalProduct extends Product{

    private double weight;
    private String expirationDate;
    private String countryCreator;

    public PhysicalProduct(String productID, String name,
                           String description, double price) {
        super(productID, name, description, price);
    }

    //TODO: setters&getters, to end constructor
}
