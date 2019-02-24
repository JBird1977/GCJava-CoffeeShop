package co.grandcircus.CoffeeShop.ProductsDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.CoffeeShop.Product;


@Repository
@Transactional
public class ProductsDao 
{
    
    @PersistenceContext
    private EntityManager em;
    
   /* @Autowired
    private JdbcTemplate jdbc;*/
    
   /* public List<Product> findAll()
    {
        return jdbc.query("SELECT * FROM products", new BeanPropertyRowMapper<>(Product.class));
    }*/
    
    public List<Product> findAll() 
    {       
        // BeanPropertyRowMapper uses the rows from the SQL result create
        // new Room objects and fill in the values by calling the setters.
        // Use .query for SQL SELECT statements.
        
        return em.createQuery("FROM Product", Product.class).getResultList();
    }
    
    public Product findById(Long id) 
    {

        return em.find(Product.class, id);
    }
    
    public Product findByName(String name) 
    {
        // getSingleResult finds a single matching row rather than a list of results.
        // But if it doesn't find one, it throws a NoResultException.
        try 
        {
            return em.createQuery("FROM Product WHERE name = :name", Product.class)
                    .setParameter("name", name)
                    .getSingleResult();
        } catch (NoResultException ex) 
        {
            return null;
        }
    }
    
    public void update(Product product) 
    {
        em.merge(product);        
    }
    
    public void create(Product product)
    {
        em.persist(product);
    }
    
    public void delete(Long id) 
    {
    //  jdbc.update("DELETE FROM Product WHERE id=?", id);
        Product product = em.getReference(Product.class, id);
        em.remove(product);
    }
}

