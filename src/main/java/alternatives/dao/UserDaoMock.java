package alternatives.dao;

import alternatives.model.User;

import javax.enterprise.inject.Alternative;

@Alternative
public class UserDaoMock implements UserDao{


    @Override
    public User read(long id) {

        // Returning object without use of DB
        // Dev/test matter

        return new User(id,"Mock","Doe");
    }
}
