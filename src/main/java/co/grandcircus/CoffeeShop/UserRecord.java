package co.grandcircus.CoffeeShop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserRecord 
{   
 private static List<User> userRecordList = new ArrayList<>();   
 
 public void userRecord() 
 {
         userRecordList.add(
         new User("Jason", "Westbrook", "jason@gmail.com", "male", "secret"));
         
 }
 
 public static void addUser(User userRecord)
 {
   userRecordList.add(userRecord);  
 }
     
}
 
 
