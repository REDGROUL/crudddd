package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(String name, int age);

    public List<User> getAllUsers();

    public boolean removeUser(int id);

    public void updateUser(String name, int age);
}
