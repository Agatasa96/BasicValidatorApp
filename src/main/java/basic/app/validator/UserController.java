package basic.app.validator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping()
    public String userRegister(Model model) {
        model.addAttribute("user", new User());
        return "userRegister";
    }

    @PostMapping()
    public String userRegister(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "userRegister";
        }
        System.out.println(user.getUserName());
        System.out.println(user.getPesel());
        System.out.println(user.getDescription());
        return "mainPage";
    }
}
