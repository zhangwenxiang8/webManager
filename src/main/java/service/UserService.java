package service;

import pojo.User;

public interface UserService {
    public User getonee(String username);
    public int add(User user);
}
