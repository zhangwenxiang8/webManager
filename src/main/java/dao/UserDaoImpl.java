package dao;

import Jdbcutil.JdbcUtil;
import Jdbcutil.Ronmap;
import pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDaoImpl implements UserDao {


    @Override
    public User getonee(String username) {
        return JdbcUtil.getone("select * from user where username=?", new Ronmap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u=new User();
                try {
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setTele(rs.getString("tele"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return u;
            }
        }, username);
    }

    @Override
    public int add(User user) {
        return JdbcUtil.CUD("insert into user(username,password,tele) values(?,?,?)",user.getUsername(),user.getPassword(),user.getTele());
    }
}
