package alternatives.dao;

import alternatives.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User read(long id) {

        // Whole
        // JDBC
        // Crap
        // Would
        // Go
        // Here

        return new User(id,"John","Doe");
    }
}
