package model;
import java.util.ArrayList;
import java.util.List;

// A cart used during the shopping process
public class Cart {
    private List<Product> products = new ArrayList<>();
    private User user;

    // a constructor. why without List? because we will change it during the process
    public Cart(User user) {
        setUser(user);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // TODO: check how I can improve this method (I mean is it possible it product
    //  does not exist).
    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotalPrice() {
        return products.stream().mapToDouble(product -> product.getPrice()).sum();
    }

    // getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
