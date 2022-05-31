package PreProjectSpringBoot.SpringBoot.service;

import PreProjectSpringBoot.SpringBoot.dao.UserDao;
import PreProjectSpringBoot.SpringBoot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
}