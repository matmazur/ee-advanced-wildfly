package beans;

import model.User;

public interface UserDao {

    public User read (long id);
    public boolean save(User user);
}
