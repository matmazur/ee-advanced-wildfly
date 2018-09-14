package alternatives.service;

import alternatives.dao.UserDao;
import alternatives.model.User;

import javax.inject.Inject;

public class UserService {

    @Inject
    private
    UserDao userDao;


    public void printUser(long id){

        User user = userDao.read(id);
        System.out.println(user);
    }
}
