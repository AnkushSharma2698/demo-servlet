package io.openliberty.sample.system;
//Wrapper
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletRequest;

public class CustomHttpServletRequest extends HttpServletRequestWrapper {
    CustomHttpServletRequest(HttpServletRequest req) {
        super(req);
    }

    // Simply Override whichever methods you wish to override in the 
    @Override
    public Object getAttribute(String name) {
        return "HttpServletRequest Wrapper :- " + super.getAttribute(name);
    }

    @Override
    public String getParameter(String name) {
        return "Proof of concept - " + super.getParameter(name);
    }
}