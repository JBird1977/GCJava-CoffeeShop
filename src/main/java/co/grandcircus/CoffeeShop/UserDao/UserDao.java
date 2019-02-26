/*  String fName;
    String lName;
    String email;
    String gender;
    String password;*/

package co.grandcircus.CoffeeShop.UserDao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import co.grandcircus.CoffeeShop.User;



@Repository
@Transactional
public class UserDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<User> findAll()
    {        
        return em.createQuery("FROM User", User.class).getResultList();
    }
    
    public User findById(long id)
    {
        return null;
      //  return em.queryForObject( new BeanPropertyRowMapper<>(User.class), id);
    }
    
    public User findByUserName(String name)
    {       
        try 
        {
            return em.createQuery("FROM User WHERE username = :username", User.class)
                    .setParameter("username", name)
                    .getSingleResult();
        } catch (NoResultException ex) 
        {
            return null;
        }
    }
    public void create(User user)
    {  
    em.persist(user);
    }
    
    public void update(User user) {
        em.merge(user);
    }
    
    public void delete(long id)
    {
        User user = em.getReference(User.class, id);
        em.remove(user);
    }
    
    
    /*  String fName;
    String lName;
    String email;
    String gender;
    String password;*/
    //public void delete
}
