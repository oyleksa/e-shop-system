package repository;

import model.User;
import java.util.ArrayList;
import java.util.List;

// This class implements CRUD system (create, read, update, delete) as a database

public class UserRepository {
    private final List<User> usersList = new ArrayList<>();

    public int numOfUsers() {
        return usersList.size();
    }

    public boolean existedByID (String userID) {
        return usersList.stream().anyMatch(user -> user.getUserID().equals(userID));
    }

    // Create
    public void save(User user) {
        // just to check the correct info
        if (user != null && !usersList.contains(user))
            usersList.add(user);
    }

    // Read
    public List<User> findAll() {
        return new ArrayList<>(usersList);
    }

    public User findByID(String userID) {
        return usersList.stream()
                .filter(user -> user.getUserID().equals(userID))
                .findFirst().orElse(null);
    }

    // Update
    public void updateUsers(User updatedUser) {
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getUserID().equals(updatedUser.getUserID())) {
                usersList.set(i, updatedUser);
                // as an exit
                return;
            }
        }
        throw new IllegalArgumentException("The user with this ID " +
                updatedUser.getUserID() + " not found.");
    }

    // Delete
    public boolean deleteByID(String userID) {
        return usersList.removeIf(user -> user.getUserID().equals(userID));
    }

}