package Controller;

import Entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList = new ArrayList<>();
    public void addUser(User user) {
            userList.add(user);
    }
}
