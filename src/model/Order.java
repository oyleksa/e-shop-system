package model;

import javax.swing.text.DefaultEditorKit;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {

    private String orderID;
    private Customer customer;
    private List<Product> products;
    private Date orderDate;
    private double totalPrice;

    // a full-field constructor
    public  Order(String orderID, Customer customer, List<Product> products,
                  Date orderDate, double totalPrice){
        setOrderID(orderID);
        setCustomer(customer);
        setProducts(products);
        setOrderDate(orderDate);
        setTotalPrice(totalPrice);
    }

    // what can we do with order? add/remove product, mb sth else?
    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        // be careful product could not be existed
        if (products.remove(product)) {
            totalPrice -= product.getPrice();
        }
    }

    // getters and setters
    // TODO: add a method to check is a value null or not
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                ", orderDate=" + orderDate +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
