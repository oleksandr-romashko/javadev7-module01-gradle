package global.goit.edu.romashko.printer;

import com.google.gson.Gson;

public class UserPrinter {
    public void printName(User user) {
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
    }
}
