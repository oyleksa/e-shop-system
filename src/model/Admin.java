package model;

public class Admin extends User{

    private String adminRole;

    public Admin(String name, String userID, String email, String adminRole) {
        super(name, userID, email);
        setAdminRole(adminRole);
    }

    // TODO: add the check if String is null

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }
}
