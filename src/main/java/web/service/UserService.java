package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);

    public List<User> getAllUsers();

    public void removeUser(Long id);

    public void updateUser( User user);

    public User getUserById(Long id);
}
