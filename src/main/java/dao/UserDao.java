package dao;

import pojo.User;

import java.util.List;

public interface UserDao {
//       public List<User> lists(User user);
       public User getonee(String username);
       public int add(User user);
}
