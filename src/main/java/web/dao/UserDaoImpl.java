package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext(unitName = "entityManager")
    private EntityManager entityManager;



//    @Autowired
//    public UserDaoImpl(EntityManager entity) {
//        this.entityManager = entity;
//    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void removeUser(Long id) {

        entityManager.remove(getUserById(id));
        entityManager.flush();
        entityManager.clear();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }
}
