package pg.solid.login.datastore;

import java.util.HashMap;
import java.util.Map;

public class LoginDatabase {
    public static Map<String, String> datastore() {
        Map<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put("admin","admin");
        loginCredentials.put("pranjal","pranjal");
        return loginCredentials;
    }
}
