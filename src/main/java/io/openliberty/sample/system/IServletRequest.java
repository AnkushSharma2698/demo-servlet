import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.AsyncContext;
import jakarta.servlet.DispatcherType;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.String;
import java.util.*;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Locale;

public class IServletRequest implements ServletRequest {
	public Object getAttribute(String name) {
		//Returns an Object containing the value of the attribute, or null if the attribute does not exist
		return null;
	}

	public Enumeration<String> getAttributeNames() {
		return null;
	}

	public String getCharacterEncoding() {
		//Returns the name of the character encoding used in the body of this request.
		return null;
	}

	public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
		//Overrides the name of the character encoding used in the body of this request. This method must be called prior to reading request parameters or reading input using getReader(). Otherwise, it has no effect.
	}

	public int getContentLength() {
		//Returns the length, in bytes, of the request body and made available by the input stream, or -1 if the length is not known or is greater than Integer.MAX_VALUE. For HTTP servlets, same as the value of the CGI variable CONTENT_LENGTH.
		return -1;
	}

	public long getContentLengthLong() {
		//Returns the length, in bytes, of the request body and made available by the input stream, or -1 if the length is not known or is greater than Integer.MAX_VALUE. For HTTP servlets, same as the value of the CGI variable CONTENT_LENGTH.
		return -1;
	}

	public String getContentType() {
		//Returns the MIME type of the body of the request, or null if the type is not known. For HTTP servlets, same as the value of the CGI variable CONTENT_TYPE.
		return null;
	}

	public ServletInputStream getInputStream() throws IOException {
		//Retrieves the body of the request as binary data using a ServletInputStream. Either this method or getReader() may be called to read the body, not both.
		return null;
	}

	public String getParameter(String name) {
		//Returns the value of a request parameter as a String, or null if the parameter does not exist. Request parameters are extra information sent with the request.
		return null;
	}

	public String[] getParameterValues(String name) {
		//Returns an array of String objects containing all of the values the given request parameter has, or null if the parameter does not exist.
		return null;
	}

	public String getProtocol() {
		//Returns the name and version of the protocol the request uses in the form protocol/majorVersion.minorVersion, for example, HTTP/1.1. 
		return null;
	}

	public String getScheme() {
		//Returns the name of the scheme used to make this request, for example, http, https, or ftp. Different schemes have different rules for constructing URLs, as noted in RFC 1738.
		return null;
	}

	public String getServerName() {
		//Returns the host name of the server to which the request was sent. It is the value of the part before ":" in the Host header value, if any, or the resolved server name, or the server IP address.
		return null;
	}

	public int getServerPort() {
		//Returns the port number to which the request was sent. It is the value of the part after ":" in the Host header value, if any, or the server port where the client connection was accepted on.
		return 1;
	}

	public BufferedReader getReader() throws IOException {
		//Retrieves the body of the request as character data using a BufferedReader. The reader translates the character data according to the character encoding used on the body. Either this method or getInputStream() may be called to read the body, not both.
		return null;
	}

	public String getRemoteAddr() {
		//Returns the Internet Protocol (IP) address of the client or last proxy that sent the request. For HTTP servlets, same as the value of the CGI variable REMOTE_ADDR.
		return null;
	}

	public String getRemoteHost() {
		//Returns the fully qualified name of the client or the last proxy that sent the request. 
		return null;
	}

	public void setAttribute(String name, Object o) {
		//Stores an attribute in this request. Attributes are reset between requests. This method is most often used in conjunction with RequestDispatcher.
	}

	public void removeAttribute(String name){
		//Removes an attribute from this request. This method is not generally needed as attributes only persist as long as the request is being handled.
	}

	public Locale getLocale() {
		//Returns the preferred Locale that the client will accept content in, based on the Accept-Language header. If the client request doesn't provide an Accept-Language header, this method returns the default locale for the server.
		Locale locale = new Locale("");
		 return locale;
	}

	public Enumeration<Locale> getLocales() {
		//Returns an Enumeration of Locale objects indicating, in decreasing order starting with the preferred locale, the locales that are acceptable to the client based on the Accept-Language header. If the client request doesn't provide an Accept-Language header, this method returns an Enumeration containing one Locale, the default locale for the server.
		return null;
	}

	public boolean isSecure() {
		//Returns a boolean indicating whether this request was made using a secure channel, such as HTTPS.
		return false;
	}

	public RequestDispatcher getRequestDipatcher(String path) {
		//Returns a RequestDispatcher object that acts as a wrapper for the resource located at the given path. 
		return null;
	}

	public String getRealPath(String path){
		return null;
	}

	public int getRemotePort() {
		//Returns the Internet Protocol (IP) source port of the client or last proxy that sent the request.
		return 1;
	}

	public String getLocalName() {
		//Returns the host name of the Internet Protocol (IP) interface on which the request was received.
		return null;
	}

	public String getLocalAddr() {
		//Returns the Internet Protocol (IP) address of the interface on which the request was received.
		return null;
	}

	public int getLocalPort() {
		//Returns the Internet Protocol (IP) port number of the interface on which the request was received.
		return 1;
	}

	public ServletContext getServletContext() {
		//Gets the servlet context to which this ServletRequest was last dispatched.
		// NOTE: No context currently returned
		return null;
	}

	public AsyncContext startAsync() throws IllegalStateException {
		//Puts this request into asynchronous mode, and initializes its AsyncContext with the original (unwrapped) ServletRequest and ServletResponse objects.
		//NOTE: No Async Context currently returned
		return null;
	}

	public boolean isAsyncStarted() {
		//Checks if this request supports asynchronous operation.
		return false;
	}

	public AsyncContext getAsyncContext() {
		//Gets the AsyncContext that was created or reinitialized by the most recent invocation of startAsync() or startAsync(ServletRequest,ServletResponse) on this request.
		//NOTE: Async context not being returned currently 
		return null;
	}

	public DispatcherType getDispatcherType() {
		//Gets the dispatcher type of this request.
		//NOTE: currently not returning a dispatcher type
		return null;
	}

	public boolean isAsyncSupported() {
		//Gets the dispatcher type of this request.
		//NOTE: currently not returning a dispatcher type
		return false;
	}

	public AsyncContext startAsync(ServletRequest req, ServletResponse res) {
		return null;
	}

	public RequestDispatcher getRequestDispatcher(String s) {
		return null;
	}

	public Map<String, String[]> getParameterMap() {
		return null;
	}

	public Enumeration<String> getParameterNames() {
		return null;
	}
}