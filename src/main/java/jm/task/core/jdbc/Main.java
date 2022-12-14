package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();


        userService.saveUser("Ryan", "Gosling", (byte) 42);
        userService.saveUser("Brad", "Pitt", (byte) 58);
        userService.saveUser("Leonardo", "Dicaprio", (byte) 48);
        userService.saveUser("Matthew", "Mcconaughey", (byte) 53);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
