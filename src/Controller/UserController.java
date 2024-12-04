package Controller;
import Model.User;
import View.*;

import java.util.List;

import DAO.*;
public class UserController {
    private UserDao userDao;
    private UserView userView;

    public UserController(UserDao userDao, UserView userView) {
        this.userDao = userDao;
        this.userView = userView;
    }

    public void displayUsers() {
        List<User> users = userDao.getAll();
        userView.displayUsers(users);
    }
}
