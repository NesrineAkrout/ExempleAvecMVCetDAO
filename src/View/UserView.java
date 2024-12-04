package View;
import java.util.List;

import Model.User;
public class UserView {
	
	    public void displayUsers(List<User> users) {
	        for (User user : users) {
	            System.out.println("User ID: " + user.getId() + ", Name: " + user.getName());
	        }
	    }
}
