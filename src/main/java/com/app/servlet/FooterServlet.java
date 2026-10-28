package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/footer")
public class FooterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body style='background-color: lightblue;'>");
        out.println("<hr>");
     
        out.println("<h3 style='margin-left:70%;'>Manage by Prachi Group</h3>");
        
        
        out.println("</body>");
        out.println("</html>");
    }
}