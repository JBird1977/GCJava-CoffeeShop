/*  String fName;
    String lName;
    String email;
    String gender;
    String password;*/

package co.grandcircus.CoffeeShop.UserDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import co.grandcircus.CoffeeShop.User;

@Repository
public class UserDao {
    
    @Autowired
    JdbcTemplate jdbc;
    
    public List<User> findAll()
    {        
        return jdbc.query("SELECT * FROM user_db", new BeanPropertyRowMapper<>(User.class));
    }
    
    public User findById(long id)
    {
        String sql = "SELECT FROM user_db WHERE id=?";
        return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(User.class));
    }
     
    public void create(User user)
    {
        String sql = "INSERT INTO user_db(fName, lName, email, gender, password) VALUES(?, ?, ?, ?, ?)";
        jdbc.update(sql, user.getfName(), user.getlName(), user.getEmail(), user.getGender(), user.getPassword());               
    }
    
    public void delete(long id)
    {
        String sql="DELETE FROM user_db WHERE id=?";
        jdbc.update(sql, id);
    }
    
    /*  String fName;
    String lName;
    String email;
    String gender;
    String password;*/
    //public void delete
}
