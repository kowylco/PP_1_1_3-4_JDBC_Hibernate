package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

        userDao.saveUser("Aasya", "Pukin", (byte) 23);
        userDao.saveUser("Xasya", "Pukin", (byte) 34);
        userDao.saveUser("FEsya", "Pukin", (byte) 24);

        List<User> users = userDao.getAllUsers();
        users.forEach(System.out::println);

        userDao.dropUsersTable();
    }
}
