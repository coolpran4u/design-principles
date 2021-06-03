package pg.solid.login;

import java.util.HashMap;
import java.util.Map;

public class Login {

    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        String storedPassword = datastore().get(username);
        boolean isValid = (storedPassword == null || !storedPassword.equals(password)) ? false : true;
        if(isValid) {
            System.out.println("Yuppie!! You are logged in successfully.");
        } else {
            System.out.println("Oops!! Incorrect credentials provided.");
        }
    }

    private static Map<String, String> datastore() {
        Map<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put("admin","admin");
        loginCredentials.put("pranjal","pranjal");
        return loginCredentials;
    }

}
