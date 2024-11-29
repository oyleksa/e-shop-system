package model;

public class PhysicalProduct extends Product{
    private double weight;
    private String expirationDate;
    private String countryCreator;

    public PhysicalProduct(String productID, String name,
                           String description, double price, double weight,
                           String expirationDate, String countryCreator) {
        super(productID, name, description, price);
        setWeight(weight);
        setExpirationDate(expirationDate);
        setCountryCreator(countryCreator);
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCountryCreator() {
        return countryCreator;
    }

    public void setCountryCreator(String countryCreator) {
        this.countryCreator = countryCreator;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPhysicalProduct{" +
                "weight=" + weight +
                ", expirationDate='" + expirationDate + '\'' +
                ", countryCreator='" + countryCreator + '\'' +
                '}';
    }
}
