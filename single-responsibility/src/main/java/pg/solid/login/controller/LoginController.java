package pg.solid.login.controller;

import pg.solid.login.message.Message;
import pg.solid.login.validator.LoginValidator;

public class LoginController {
    public void login(String username, String password) {
        boolean isValid = LoginValidator.validateUser(username, password);
        String message = isValid ? "Yuppie!! You are logged in successfully." : "Oops!! Incorrect credentials provided.";
        Message.processMessage(message);
    }
}
