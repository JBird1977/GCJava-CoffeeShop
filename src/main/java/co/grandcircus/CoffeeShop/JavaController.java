package co.grandcircus.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class JavaController {
    
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
