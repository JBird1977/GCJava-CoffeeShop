package co.grandcircus.CoffeeShop;

public class User {
    
    String fName;
    String lName;
    String email;
    String gender;
    String password;
    
    
    
    
    public String getfName() {
        return fName;
    }




    public User(String fName, String lName, String email, String gender, String password) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }




    public String getGender() {
        return gender;
    }




    public void setGender(String gender) {
        this.gender = gender;
    }




    public void setfName(String fName) {
        this.fName = fName;
    }




    public String getlName() {
        return lName;
    }




    public void setlName(String lName) {
        this.lName = lName;
    }




    public String getEmail() {
        return email;
    }




    public void setEmail(String email) {
        this.email = email;
    }




    public String getPassword() {
        return password;
    }




    public void setPassword(String password) {
        this.password = password;
    }




    private User() {}

}
