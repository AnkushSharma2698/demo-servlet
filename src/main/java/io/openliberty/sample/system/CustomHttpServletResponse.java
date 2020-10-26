package io.openliberty.sample.system;
//Wrapper
import jakarta.servlet.http.HttpServletResponseWrapper;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.CharArrayWriter;

class CustomHttpServletResponse extends HttpServletResponseWrapper {
    private CharArrayWriter output;
    CustomHttpServletResponse(HttpServletResponse res) {
        super(res);
        output = new CharArrayWriter();
    }

    public String toString() {
        return output.toString();
    }

    public PrintWriter getWriter() {
        // I need to create a custom servlet output stream and such to make this show up on screen
        System.out.println("In the custom getWriter");
        return new PrintWriter(output);
    }
}
