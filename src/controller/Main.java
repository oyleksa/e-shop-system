package controller;

import model.DigitalProduct;
import model.PhysicalProduct;

public class Main {
    public static void main(String[] args) {
        // String productID, String name, String description, double price,
        // double weight, String expirationDate, String countryCreator
        PhysicalProduct apple = new PhysicalProduct("101111", "Apple",
                "Cut it and eat", 1.59, 0.235,
                "Due 15 december 2024", "Made in Portugal.");

        System.out.println(apple);
    }
}