package io.openliberty.sample.system;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

public class CustomFilter implements Filter {
 
    private FilterConfig filterConfig = null;
 
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        // Set the request to be a custom Request that can have special behaviour
        request = new CustomHttpServletRequest((HttpServletRequest) request);
 
        //Read request.getBody() as many time you need
 
        chain.doFilter(request, response);
    }
}