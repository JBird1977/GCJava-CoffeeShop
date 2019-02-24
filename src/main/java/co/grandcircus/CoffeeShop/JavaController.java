package co.grandcircus.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.ProductsDao.ProductsDao;
import co.grandcircus.CoffeeShop.UserDao.UserDao;



@Controller
public class JavaController {
    
    
    @Autowired
    private UserDao userDao;
    @Autowired
    private ProductsDao productsDao;
    
    @RequestMapping("/")
    public ModelAndView index() {
        
        return new ModelAndView("index");
    }
    
    
    @RequestMapping("/productList")
    public ModelAndView list() 
    {
        List<Product> leListofProduct = productsDao.findAll();
        return new ModelAndView("list", "product", leListofProduct);
    }
    
    
    
   
    
    /*@RequestMapping("/rooms/{id}")
    public ModelAndView detail(@PathVariable("id") Long id) {
        Room room = roomsDao.findById(id);
        
        return new ModelAndView("detail", "room", room);
    }*/
    
    /*@RequestMapping("/productList/{id}")
    public ModelAndView detail(@PathVariable("id") Long id)
    {
        Product product = productsDao.findById(id);
       
        return null;
    }*/
    
    
  
    
    @RequestMapping("/RegForm")
    public ModelAndView showRegForm()
    {
        return new ModelAndView("RegForm");
    }    
    
    @RequestMapping("/UserInfo")
    public ModelAndView showUserList()
    {
        List<User> leListofUser = userDao.findAll();
       
        return new ModelAndView("UserInfo", "user", leListofUser);       
    }
    
    @RequestMapping("/UserInfo/Add")
    public ModelAndView addUser(User user)
    {
        userDao.update(user);
        return new ModelAndView("redirect:/UserInfo");
    }
    
    @RequestMapping("/Admin")
    public ModelAndView showAdminPage()
    {
        List<Product> leListofProduct = productsDao.findAll();
        return new ModelAndView("Admin", "product", leListofProduct);
    }
    
    @RequestMapping("/AddItem")
    public ModelAndView showAddItemPage()
    {
        return new ModelAndView("AddItem");
    }
    
    @PostMapping("/AddItem")
    public ModelAndView addProduct(Product product) 
    {
        productsDao.create(product);
        return new ModelAndView("redirect:/Admin");
    //    return new ModelAndView("list", "product", leListofProduct);
    }
    
    @RequestMapping("/EditItem")
    public ModelAndView editProduct(@RequestParam("id") Long id, Product product) 
    {
       ModelAndView mav = new ModelAndView("EditItem");
       mav.addObject("product", productsDao.findById(id));    
       return mav;
    //    return new ModelAndView("list", "product", leListofProduct);
    }
    
    @PostMapping("/EditItem")
    public ModelAndView editProduct(Product product)
    {        
        productsDao.update(product);        
        return new ModelAndView("redirect:/Admin");
    }
    
    @RequestMapping("/DeleteItem")
    public ModelAndView deleteProduct(@RequestParam("id") Long id)
    {
       
        productsDao.delete(id);
        return new ModelAndView("redirect:/Admin");
    }
    
    
    
   /* @PostMapping("/RegResult")
    public ModelAndView submitRegForm(User userEntry)
    {    
        return new ModelAndView("RegResult");
    }*/
    
    
    
  /*  @PostMapping("/RegResult")
    public ModelAndView submitRegForm(User userEntry) {
        UserRecord.addUser(userEntry);
        
        return new ModelAndView("RegResult");
    }*/
    
    
    
    /*public ModelAndView submitFoodForm(Food food) {
        foodService.addFood(food);
        // using a view name that starts with "redirect:" skips the JSP and instead
        // redirects the browser to the given URL, effectively redirecting to another
        // controller.
        return new ModelAndView("redirect:/food");*/
    
}
