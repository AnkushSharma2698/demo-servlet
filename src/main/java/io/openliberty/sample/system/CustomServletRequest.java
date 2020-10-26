package io.openliberty.sample.system;
//Wrapper
import jakarta.servlet.ServletRequestWrapper;
import jakarta.servlet.ServletRequest;

class CustomServletRequest extends ServletRequestWrapper {
    CustomServletRequest(ServletRequest req) {
        super(req);
    }

    // Simply Override whichever methods you wish to override in the 
    @Override
    public Object getAttribute(String name) {
        return "ServletRequest Wrapper :- " + super.getAttribute(name);
    }

    @Override
    public String getParameter(String name) {
        return "ServletRequest Wrapper Param: " + super.getParameter(name);
    }
}