package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl {
    /*private final Util util = new Util();
    private final Statement statement = util.connectToSQL();

    public UserDaoJDBCImpl() throws SQLException {
    }

    public void createUsersTable() throws SQLException {
        statement.execute("CREATE TABLE IF NOT EXISTS Users(id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), lastName VARCHAR(50), age TINYINT);");
    }

    public void dropUsersTable() throws SQLException {
        statement.execute("DROP TABLE IF EXISTS users");
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        statement.execute("insert into users(name, lastName, age) values('"+ name + "', '" + lastName + "', " + age + ");");
    }

    public void removeUserById(long id) throws SQLException {
        statement.execute("DELETE FROM users where id = " + id);
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        ResultSet rs = statement.executeQuery("select * from users");
        // Количество колонок в результирующем запросе
        int count = 0;

        while(rs.next()){
            User user = new User();
            user.setId(rs.getLong(1));
            user.setName(rs.getString(2));
            user.setLastName(rs.getString(3));
            user.setAge(rs.getByte(4));
            userList.add(user);
        }

        return userList;
    }

    public void cleanUsersTable() throws SQLException {
        statement.execute("delete from users");
    }*/
}
