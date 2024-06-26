package org.example.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@End
public class ExampleHttpServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Setting up the content type of web page
        response.setContentType("text/html");
        // Writing the message on the web page
        PrintWriter out = response.getWriter();
        out.println("<h1>" + "Menu:" + "</h1>");
        out.println("<p>" + "Hello Friends!" + "</p>");
    }
}
