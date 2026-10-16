package com.runoops.patterns.dao;

/**
 * DAO pattern demo (client)
 * Article: https://runoops.com/design-patterns-dao.html
 *
 * Business -> DAO Interface -> DAO Impl -> (simulated) DB
 */
public class DaoDemo {

    public static void main(String[] args) {
        UserDao dao = new UserDaoImpl();
        UserService service = new UserService(dao);
        User user = service.getUser(1001);
        System.out.println("User name: " + user.getName());
        dao.save(user);
    }
}
