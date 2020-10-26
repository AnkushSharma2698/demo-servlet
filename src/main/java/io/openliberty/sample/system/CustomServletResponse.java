package io.openliberty.sample.system;
//Wrapper
import jakarta.servlet.ServletResponseWrapper;
import jakarta.servlet.ServletResponse;

import java.io.PrintWriter;
import java.io.CharArrayWriter;

class CustomServletResponse extends ServletResponseWrapper {
    private CharArrayWriter output;
    CustomServletResponse(ServletResponse res) {
        super(res);
        output = new CharArrayWriter();
    }

    public String toString() {
        return output.toString();
    }

    public PrintWriter getWriter() {
        // I need to create a custom servlet output stream and such to make this show up on screen
        System.out.println("In the custom getWriter for ServletResponse");
        return new PrintWriter(output);
    }
}