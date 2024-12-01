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

    public List<Order> findByCustomer(String customerID) {
        return orderList.stream()
                .filter(order -> order.getCustomer().getUserID().equals(customerID))
                .toList();
    }

    // Update (if the order repository have already existed we need only )
    public void updateOrder(Order updatedOrder){
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderID().equals(updatedOrder.getOrderID())) {
                // to replace
                orderList.set(i, updatedOrder);
                // in this context it means exit
                return;
            }
        }
        throw new IllegalArgumentException("Order with ID " + updatedOrder.getOrderID() +
                " not found.");
    }

    // Delete
    // why this method boolean? it helps caller to understand if the procedure of
    // deleting finish correctly
    public boolean deleteByID(String id) {
        return orderList.removeIf(order -> order.getOrderID().equals(id));
    }

}
