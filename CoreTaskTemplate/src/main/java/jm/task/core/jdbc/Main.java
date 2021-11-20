package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserService userService = new UserServiceImpl();
        ArrayList<User> users = new ArrayList<>();
        userService.dropUsersTable(); //удаление пустой таблицы

        // создание 4-х юзеров
        for(int i=0 ; i<4 ; i++){
            User user = new User();
            users.add(user);
            users.get(i).setName(String.valueOf((char) ('a'+i)));
            users.get(i).setLastName(String.valueOf((char)('A'+i)));
            users.get(i).setAge((byte)i);
        }
        userService.createUsersTable();
        userService.createUsersTable();// создание уже имеющейся таблицы

        // добавление юзеров в таблицу
        for (int i=0 ; i<4 ; i++){
            userService.saveUser(users.get(i).getName(),users.get(i).getLastName(),users.get(i).getAge());
        }

        //получение всех юзеров и вывод в консоль
        List<User> userList = userService.getAllUsers();
        for(User user : userList){
            System.out.println(user);
        }
        // удаление третьего элемента
        userService.removeUserById(3);
        // очистка и удаление таблицы
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
