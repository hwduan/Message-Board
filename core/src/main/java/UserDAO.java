

import java.util.List;



public interface UserDAO
{
	public void saveUser(User user);

	public void removeUser(User user);

	public User findUserById(Integer id);

	public List<User> findAllUsers();

	public void updateUser(User user);
}
