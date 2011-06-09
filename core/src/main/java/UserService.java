

import java.io.InputStream;
import java.util.List;



public interface UserService
{
	public List<User> findAll();

	public void save(User user);

	public void delete(User user);

	public User findById(Integer id);

	public void update(User user);
	
	public InputStream getInputStream();
}
