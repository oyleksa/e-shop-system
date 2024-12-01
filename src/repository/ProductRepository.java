package repository;

import model.Product;
import java.sql.DataTruncation;
import java.util.ArrayList;
import java.util.List;

// Here I need to implement CRUD operations (create, read, update, delete).
public class ProductRepository {
    // Simulate a database (mb to add later a real DB?)
    private final List<Product> productList = new ArrayList<>();

    // Create
    public void save(Product product) {
        productList.add(product);
    }

    // Read
    public List<Product> findAll(){
        return new ArrayList<>(productList);
    }

    // product -> is a lambda expression
    public Product findByID(String id){
        return productList.stream()
                .filter(product -> product.getProductID()
                .equals(id)).findFirst()
                .orElse(null);
    }

    // Update
    public boolean update(String id, Product updatedProduct){
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductID().equals(id)) {
                productList.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean deleteByID(String id) {
        return productList.removeIf(product -> product.getProductID().equals(id));
    }

}
