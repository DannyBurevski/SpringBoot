package PreProjectSpringBoot.SpringBoot.dao;


import PreProjectSpringBoot.SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> getUsersList();
}
