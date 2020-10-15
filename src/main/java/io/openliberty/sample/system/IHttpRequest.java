import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.AsyncContext;
import jakarta.servlet.http.HttpUpgradeHandler;
import jakarta.servlet.http.MappingMatch;
import jakarta.servlet.ServletException;
import java.io.UnsupportedEncodingException;
import java.io.BufferedReader;
import java.io.IOException;
import jakarta.servlet.http.PushBuilder;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.Part;
import java.lang.StringBuffer;
import java.lang.String;
import java.security.Principal;
import java.util.*;

public class IHttpRequest implements HttpServletRequest {
	public static final String BASIC_AUTH = "BASIC";
	public static final String FORM_AUTH = "FORM";
	public static final String CLIENT_CERT_AUTH = "CLIENT_CERT";
	public static final String DIGEST_AUTH = "DIGEST";

	public boolean authenticate(HttpServletResponse response) throws IOException,ServletException{
		//Use the container login mechanism configured for the ServletContext to authenticate the user making this request.
		return false;
	}

	public String changeSessionId() {
		//Change the session id of the current session associated with this request and return the new session id.
		return null;
	}

	public String getAuthType() {
		//Returns the name of the authentication scheme used to protect the servlet.
		return null;
	}

	public String getContextPath() {
		//Returns the portion of the request URI that indicates the context of the request.
		return null;
	}

	public Cookie[] getCookies() {
		//Returns an array containing all of the Cookie objects the client sent with this request.
		return null;
	}

	public long getDateHeader(String name){
		//Returns the value of the specified request header as a long value that represents a Date object.
		return 1;
	}

	public String getHeader(String name) {
		//Returns the value of the specified request header as a String.
		return null;
	}

	public Enumeration<String> getHeaderNames(){
		//Returns an enumeration of all the header names this request contains.
		return null;
	}

	public Enumeration<String> getHeaders(String name) {
		//Returns all the values of the specified request header as an Enumeration of String objects.
		return null;
	}

	public int getIntHeader(String name) {
		//Returns the value of the specified request header as an int.
		return 1;
	}

	public String getMethod() {
		//Returns the name of the HTTP method with which this request was made, for example, GET, POST, or PUT.
		return null;
	}

	public Part getPart(String name) {
		//Gets the Part with the given name.
		return null;
	}

	public Collection<Part> getParts() {
		//Gets all the Part components of this request, provided that it is of type multipart/form-data.
		return null;
	}

	public String getPathInfo() {
		//Returns any extra path information associated with the URL the client sent when it made this request.
		return null;
	}

	public String getPathTranslated() {
		//Returns any extra path information after the servlet name but before the query string, and translates it to a real path.
		return null;
	}

	public String getQueryString() {
		//Returns the query string that is contained in the request URL after the path.
		return null;
	}

	public String getRemoteUser() {
		//Returns the login of the user making this request, if the user has been authenticated, or null if the user has not been authenticated.
		return null;
	}

	public String getRequestedSessionId() {
		//Returns the session ID specified by the client.
		return null;
	}

	public String getRequestURI() {
		//Returns the part of this request's URL from the protocol name up to the query string in the first line of the HTTP request.
		return null;
	}

	public StringBuffer getRequestURL() {
		//Reconstructs the URL the client used to make the request.
		return null;
	}

	public String getServletPath() {
		//Returns the part of this request's URL that calls the servlet.
		return null;
	}

	public HttpSession getSession() {
		//Returns the current session associated with this request, or if the request does not have a session, creates one.
		return null;
	}

	public HttpSession getSession(boolean create) {
		//Returns the current HttpSession associated with this request or, if there is no current session and create is true, returns a new session.
		return null;
	}

	public Principal getUserPrincipal() {
		//Returns a java.security.Principal object containing the name of the current authenticated user.
		return null;
	}

	public boolean isRequestedSessionIdFromCookie() {
		//Checks whether the requested session ID was conveyed to the server as an HTTP cookie.
		return false;
	}

	public boolean isRequestedSessionIdFromURL() {
		//Checks whether the requested session ID was conveyed to the server as part of the request URL.
		return false;
	}

	public boolean isRequestedSessionIdValid() {
		//Checks whether the requested session ID is still valid.
		return false;
	}

	public boolean isUserInRole(String role) {
		//Returns a boolean indicating whether the authenticated user is included in the specified logical "role".
		return false;
	}

	public void login(String username, String password) {
		//Validate the provided username and password in the password validation realm used by the web container login mechanism configured for the ServletContext.
	}

	public void logout() {
		//Establish null as the value returned when getUserPrincipal, getRemoteUser, and getAuthType is called on the request.
	}

	public <T extends HttpUpgradeHandler> T  upgrade(Class<T> handlerClass) throws IOException, ServletException {
		//Creates an instance of HttpUpgradeHandler for a given class and uses it for the http protocol upgrade processing.
		//Note: Not implemented
		return null;
	}

	public boolean isRequestedSessionIdFromUrl() {
		return false;
	}

	public DispatcherType getDispatcherType() {
		//Gets the dispatcher type of this request.
		//NOTE: currently not returning a dispatcher type
		return null;
	}

	public AsyncContext getAsyncContext() {
		//Gets the AsyncContext that was created or reinitialized by the most recent invocation of startAsync() or startAsync(ServletRequest,ServletResponse) on this request.
		//NOTE: Async context not being returned currently 
		return null;
	}

	public boolean isAsyncSupported() {
		//Gets the dispatcher type of this request.
		//NOTE: currently not returning a dispatcher type
		return false;
	}

	public boolean isAsyncStarted() {
		//Checks if this request supports asynchronous operation.
		return false;
	}

	public AsyncContext startAsync(ServletRequest req, ServletResponse res) {
		return null;
	}

	public AsyncContext startAsync() {
		return null;
	}

	public ServletContext getServletContext() {
		//Gets the servlet context to which this ServletRequest was last dispatched.
		// NOTE: No context currently returned
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

	public RequestDispatcher getRequestDispatcher(String s) {
		return null;
	}

	public RequestDispatcher getRequestDipatcher(String path) {
		//Returns a RequestDispatcher object that acts as a wrapper for the resource located at the given path. 
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

	public Map<String, String[]> getParameterMap() {
		return null;
	}

	public Enumeration<String> getParameterNames() {
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

	public Object getAttribute(String name) {
		//Returns an Object containing the value of the attribute, or null if the attribute does not exist
		return null;
	}

	public Enumeration<String> getAttributeNames() {
		return null;
	}
}