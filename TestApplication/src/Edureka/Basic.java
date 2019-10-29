/* package Edureka;
import java.io.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Basic extends HttpServlet {

	public String message;
	
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		message = "This is my test servlet";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
*/