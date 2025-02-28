package userdatamanagement;

public class UserManagerApp {
    public static void main(String[] args) {

        String username = "john_doe";
        String password = "Password123";
       
        // UserRegistration userRegistration = new UserRegistration(); // don't need to create an instance of UserRegistration or UserAuthenticator because they are static. Can call them directly using the class name.
        // UserAuthenticator userAuthenticator = new UserAuthenticator();

        if (UserRegistration.registerUser(username,password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("User registration failed.");
        }

        // Separate login functionality
        if (UserAuthenticator.authenticateUser(username, password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

}
