import Controller.UserController;
import DAO.UserDao;
import View.UserView;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserView userView = new UserView();
        UserController userController = new UserController(userDao, userView);

        userController.displayUsers();
    }
}