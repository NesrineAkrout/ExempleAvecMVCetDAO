package DAO;
import java.util.List;
public interface IDao<T>{
	
    List<T> getAll();
	
}
