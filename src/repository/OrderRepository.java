package repository;

import model.Order;
import java.util.ArrayList;
import java.util.List;

// Here I need to implement CRUD operations (create, read, update, delete).
public class OrderRepository {
    private final List<Order> orderList = new ArrayList<>();

    // Create
    public void save(Order order) {
        orderList.add(order);
    }

    // Read
    public List<Order> findAll(){
        return new ArrayList<>(orderList);
    }

    public Order findByID(String id) {
        return orderList.stream()
                .filter(order -> order.getOrderID().equals(id))
                .findFirst().orElse(null);
    }

//    public Order findByCustomer(String customerID) {
//
//    }
}
