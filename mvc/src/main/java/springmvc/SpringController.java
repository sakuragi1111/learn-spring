package springmvc;

import oldmvc.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {

    @RequestMapping("/user")
    public ModelAndView user() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", new User("spring mvc"));
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
}
