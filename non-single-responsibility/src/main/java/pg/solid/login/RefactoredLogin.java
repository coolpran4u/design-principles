package pg.solid.login;

import java.util.HashMap;
import java.util.Map;

public class RefactoredLogin {


    public static void main(String[] args) {
        login("admin","admin");
        login("pranjal","1234");
    }

    private static void login(String username, String password) {
        boolean isValid = validateUser(username, password);
        if(isValid) {
            loginSuccessful();
        } else {
            loginFailed();
        }
    }

    private static Map<String, String> datastore() {
        Map<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put("admin","admin");
        loginCredentials.put("pranjal","pranjal");
        return loginCredentials;
    }

    private static boolean validateUser(String username, String password) {
        String storedPassword = datastore().get(username);
        return (storedPassword == null || !storedPassword.equals(password)) ? false : true;
    }

    private static void loginSuccessful() {
        System.out.println("Yuppie!! You are logged in successfully.");
    }

    private static void loginFailed() {
        System.out.println("Oops!! Incorrect credentials provided.");
    }
}
