package beans;

import interceptors.TimeLogger;
import model.User;

public class UserDaoImpl implements UserDao{



    @Override
    @TimeLogger
    public User read(long id) {
        return new User(id,"John","Doe");
    }

    @Override
    public boolean save(User user) {
        return true;
    }
}
