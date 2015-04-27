package com.springapp.mvc.view;

import com.springapp.mvc.domain.beans.User;
import com.springapp.mvc.service.UserBeanService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;


/**
 * Created by steven on 4/24/15.
 */
@Controller()
@RequestMapping("/login")
public class RegisterController {
    static Logger logger = Logger.getLogger(RegisterController.class);

    @Autowired
    private UserBeanService userBeanService;

    @RequestMapping(method = RequestMethod.GET)
    public String printForm(){
        return "login";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String precessRegistration(@Valid User user, BindingResult result, ModelMap modelMap){
        if (result.hasErrors()){
            modelMap.addAttribute("error", "please fill fields with correct content.");
            return "result";
        }
        if (userBeanService.ifDuplicateUserName(user.getUsername())) {
            modelMap.addAttribute("error", "this is username is token by others.");
        } else {
            userBeanService.insertUser(user);
            modelMap.addAttribute("user", userBeanService.getUserByName(user.getUsername()));
            modelMap.addAttribute("error", "sign up success.");
        }

        logger.debug("in Registration, before returning.");
        return "result";
    }
}
