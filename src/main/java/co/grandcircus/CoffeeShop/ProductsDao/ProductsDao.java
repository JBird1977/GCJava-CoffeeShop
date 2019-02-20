package co.grandcircus.CoffeeShop.ProductsDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import co.grandcircus.CoffeeShop.Product;


@Repository
public class ProductsDao 
{
    @Autowired
    private JdbcTemplate jdbc;
    
   /* public List<Product> findAll()
    {
        return jdbc.query("SELECT * FROM products", new BeanPropertyRowMapper<>(Product.class));
    }*/
    
    public List<Product> findAll() 
    {       
        // BeanPropertyRowMapper uses the rows from the SQL result create
        // new Room objects and fill in the values by calling the setters.
        // Use .query for SQL SELECT statements.
        return jdbc.query("SELECT * FROM products", new BeanPropertyRowMapper<>(Product.class));
    }
    
    public Product findById(long id) 
    {
        Product match = jdbc.queryForObject("SELECT * FROM Room WHERE id = ?",
                        new BeanPropertyRowMapper<>(Product.class), id);
        return match;
    }
    
    public void update(Product product) 
    {
        jdbc.update("UPDATE Product SET name = ?,  = ?, description = ?, quantity = ?, price = ? WHERE id = ?");        
    }
    
    public void create(Product product)
    {
        String sql = "INSERT INTO Product (name, description, quantity, price) VALUES (?, ?, ?, ?)";
        jdbc.update(sql, product.getName(), product.getDescription(), product.getQuantity(), product.getPrice());
    }
    
    public void delete(Long id) 
    {
        
        jdbc.update("DELETE FROM Product WHERE id=?", id);
    }
}

