package com.springapp.mvc.aop;

import com.springapp.mvc.domain.beans.User;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import java.util.Date;

/**
 * Created by steven on 4/27/15.
 */
@Aspect
public class RegistrationAop {

    static Logger logger = Logger.getLogger(RegistrationAop.class);

    @Pointcut("execution( * com.springapp.mvc.view.RegisterController." +
            "precessRegistration(com.springapp.mvc.domain.beans.User," +
            "org.springframework.validation.BindingResult," +
            "org.springframework.ui.ModelMap))" +
            "&& args(user, result, model))")
    public void postRegistration(User user, BindingResult result, ModelMap model){}



    @AfterReturning("postRegistration(user, result, model)")
    public void keepRecordOfLogin(User user, BindingResult result, ModelMap model){
        logger.info("User [" + user.getUsername() + "] logged in.");
    }

}
