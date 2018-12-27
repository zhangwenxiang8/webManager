package service;

import dao.UserDao;
import dao.UserDaoImpl;
import pojo.User;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();

    @Override
    public User getonee(String username) {
        return userDao.getonee(username);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }
}
