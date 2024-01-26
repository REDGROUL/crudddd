package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public void saveUser(String name, int age);

    public List<User> getAllUsers();

    public boolean removeUser(int id);

    public void updateUser(String name, int age);

}
