package com.springapp.mvc.view;

import com.springapp.mvc.domain.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by steven on 4/24/15.
 */
@Controller()
public class SimpleController {
    @RequestMapping("/")
    public ModelAndView simple(){
        return new ModelAndView("redirect:" + "/login");

    }
}
