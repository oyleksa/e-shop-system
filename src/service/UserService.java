package service;

import model.User;
import repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    // Constructor Dependency injection

    // It provides a way to pass all the dependencies
    // a class will need via its constructor. It's considered the most preferred
    // approach to dependency injection, mainly because it guarantees the object
    // state is valid and its immutability right after its creation.
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register a new user
    public void registerUser (User user) {
        if (userRepository.existedByID(user.getUserID()))
            throw new IllegalArgumentException("This user has already existed.");
        userRepository.save(user);
        System.out.println("New user registered successfully!");
    }

    // Login User
    public User loginUser(String userID, String password) {
        User user = userRepository.findByID(userID);
        if (user == null || user.getPassword().equals(password))
            throw new IllegalArgumentException("Invalid username or password.");
        System.out.println("Login successful for user: " + user.getUserID());
        return user;
    }

    // Find user (why we need to repeat this method? - because
    // service package has a strong high-check. The analogy with the kitchen and manager)
    public User findUser(String userID) {
        User user = userRepository.findByID(userID);
        if (user == null)
            throw new IllegalArgumentException("User " + userID + " does not exist.");
        return user;
    }

    //Update user
    public void updateUser(User user) {
        userRepository.updateUsers(user);
        System.out.println("User updated successfully!");
    }

    // Delete user
    public void deleteUser(String userID) {
        if (!userRepository.existedByID(userID))
            throw new IllegalArgumentException("User " + userID + " does not exist.");
        userRepository.deleteByID(userID);
        System.out.println("User deleted successfully!");
    }
}