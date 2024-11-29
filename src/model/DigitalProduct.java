package model;

public class DigitalProduct extends Product{

    private double fileSize;
    private String fileFormat;

    public DigitalProduct(String productID, String name, String description,
                          double price) {
        super(productID, name, description, price);
    }
}
