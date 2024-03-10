package com.zhangzikang.week2.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class submit extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>User Registration</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>User Registration Form</h2>");
        out.println("<form action=\"submit\" method=\"get\">");
        out.println("<table>");
        out.println("<tr><td>Username:</td><td><input type=\"text\" name=\"username\"></td></tr>");
        out.println("<tr><td>Password:</td><td><input type=\"password\" name=\"password\"></td></tr>");
        out.println("<tr><td>Email:</td><td><input type=\"email\" name=\"email\"></td></tr>");
        out.println("<tr><td>Birthdate:</td><td><input type=\"text\" name=\"birthdate\" placeholder=\"YYYY-MM-DD\"></td></tr>");
        out.println("<tr><td colspan=\"2\"><input type=\"submit\" value=\"Submit\"></td></tr>");
        out.println("</table>");
        out.println("</form>");

        // Handle GET request data
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String birthdate = request.getParameter("birthdate");

        if (username != null && password != null && email != null && birthdate != null) {
            out.println("<h3>Submitted Data:</h3>");
            out.println("<p>Username: " + username + "</p>");
            out.println("<p>Password: " + password + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Birthdate: " + birthdate + "</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
