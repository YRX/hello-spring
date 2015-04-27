package com.springapp.mvc.filter;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by steven on 4/27/15.
 */
@Component("loginFilter")
public class LoginFilter implements Filter {
    static Logger logger = Logger.getLogger(LoginFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        logger.info("user from " + httpRequest.getRemoteAddr() + " is logging.");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
