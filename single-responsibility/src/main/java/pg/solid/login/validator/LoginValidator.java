package pg.solid.login.validator;

import pg.solid.login.datastore.LoginDatabase;

public class LoginValidator {
    public static boolean validateUser(String username, String password) {
        String storedPassword = LoginDatabase.datastore().get(username);
        return (storedPassword == null || !storedPassword.equals(password)) ? false : true;
    }
}
