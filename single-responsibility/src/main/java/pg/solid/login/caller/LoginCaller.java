package pg.solid.login.caller;

import pg.solid.login.controller.LoginController;

public class LoginCaller {
    public static void main(String[] args) {
        LoginController controller = new LoginController();
        controller.login("pranjal", "pranjal");

        controller.login("admin", "pranjal");
    }
}
