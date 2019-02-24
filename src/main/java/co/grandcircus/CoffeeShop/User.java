package co.grandcircus.CoffeeShop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name="user_db")


public class User 
{

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    Long id;
    String firstName;
    String lastName;
    String email;
    String gender;
    String password;
    
    public User() {}
    
 
    public User(Long id, String firstName, String lastName, String email, String gender, String password) 
    {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }
    
    

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getGender() 
    {
        return gender;
    }



    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

  
    
    

}
