package DAO;
import Model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IDao<User>{
	private List<User> users;

    public UserDao() {
        users = new ArrayList<>();
        users.add(new User(1, "Alice"));
        users.add(new User(2, "Bob"));
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
