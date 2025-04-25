// UserService.java

public class UserService {
    private String name;
    
    // Constructor
    public UserService(String name) {
        this.name = name;
    }
    
    // Getter method to return the name
    public String getName() {
        return name;
    }
    
    // Setter method to update the name
    public void setName(String name) {
        this.name = name;
    }
    
    // A simple method to display user details
    public String displayUserDetails() {
        return "User name is: " + name;
    }

    public static void main(String[] args) {
        // Creating an instance of UserService
        UserService user = new UserService("John Doe");

        // Displaying user details
        System.out.println(user.displayUserDetails());

        // Changing the name using the setName method
        user.setName("Alice");

        // Displaying updated user details
        System.out.println(user.displayUserDetails());
    }
}
