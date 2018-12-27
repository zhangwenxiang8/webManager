package Jdbcutil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {

    private final static String URL = "jdbc:mysql://127.0.0.1:3306/user?useUnicode=true&characterEncoding=utf-8";
    private final static String USER = "root";
    private final static String PWD = "123456";


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getconn() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn, PreparedStatement pre, ResultSet rss) {
        if (rss != null) {
            try {
                rss.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pre != null) {
            try {
                pre.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




    public static int CUD(String sql, Object... obj) {
        int a = 0;
        Connection conn = null;
        PreparedStatement sta = null;

        conn = getconn();
        try {
            sta = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    sta.setObject(i + 1, obj[i]);
                }
                a=sta.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    public static <T> T getone(String sql,Ronmap<T> rw,Object... obj) {
        T t = null;
        Connection conn = null;
        PreparedStatement sta = null;

        conn = getconn();
        try {
            sta = conn.prepareStatement(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    sta.setObject(i+1,obj[i]);
                }
            }
            ResultSet rs = sta.executeQuery();
            while(rs.next()){
                t=rw.RowMapping(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> List<T> R(String sql,Ronmap<T> rw,Object... obj) {
        List<T> lists = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pst = null;
        conn = getconn();
        try {
            pst = conn.prepareCall(sql);
            if (obj != null) {
                for (int i = 0; i < obj.length; i++) {
                    pst.setObject(i + 1, obj[i]);
                }
            }
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                T e = rw.RowMapping(rs);
                lists.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lists;
    }
}

