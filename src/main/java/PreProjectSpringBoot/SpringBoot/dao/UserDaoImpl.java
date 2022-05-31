package PreProjectSpringBoot.SpringBoot.dao;

import PreProjectSpringBoot.SpringBoot.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager entityManager;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(Long id) {
        return (User) entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }


    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }

    @Override
    public List<User> getUsersList() {
        String jpql = "from User";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }
}