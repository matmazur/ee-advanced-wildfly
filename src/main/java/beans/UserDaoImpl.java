package beans;

import model.User;

public class UserDaoImpl implements UserDao{
    @Override
    public User read(long id) {
        return new User(id,"John","Doe");
    }

    @Override
    public boolean save(User user) {
        return true;
    }
}
