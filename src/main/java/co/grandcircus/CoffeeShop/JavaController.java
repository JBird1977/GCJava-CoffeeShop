package co.grandcircus.CoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShop.ProductsDao.ProductsDao;



@Controller
public class JavaController {
    
    @Autowired
    private ProductsDao productsDao;
    
    @RequestMapping("/productList")
    public ModelAndView list() 
    {
        List<Product> leListofProduct = productsDao.findAll();
        return new ModelAndView("productList", "productList", leListofProduct);
    }
    
    /*@RequestMapping("/rooms/{id}")
    public ModelAndView detail(@PathVariable("id") Long id) {
        Room room = roomsDao.findById(id);
        
        return new ModelAndView("detail", "room", room);
    }*/
    
    @RequestMapping("/productList/{id}")
    public ModelAndView detail(@PathVariable("id") Long id)
    {
        Product product = productsDao.findById(id);
        
        return null;
    }
    
    
    @RequestMapping("/")
    public ModelAndView index() {
        
        return new ModelAndView("index");
    }
    
    @RequestMapping("/RegForm")
    public ModelAndView showRegForm()
    {
        return new ModelAndView("RegForm");
    }
    
    @RequestMapping("/RegResult")
    public ModelAndView showRegFormResult(User userEntry)
    {
        
        return new ModelAndView("/RegResult");
    }
    
    @PostMapping("/RegResult")
    public ModelAndView submitRegForm(User userEntry)
    {
        
        return new ModelAndView("RegResult");
    }
    
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
