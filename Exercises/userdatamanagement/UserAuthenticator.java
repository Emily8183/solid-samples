package userdatamanagement;

public class UserAuthenticator {
    public static boolean authenticateUser(String username, String password) {
        // Validate username and password
        // if (validateUsername(username) && validatePassword(password)) {
        //     // Authenticate user
        //     System.out.println("User logged in successfully.");
        // } else {
        //     System.out.println("Invalid username or password.");
        // }

        return UserValidator.validateUsername(username) && UserValidator.validatePassword(password);
    }

}
