package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/header")
public class HeaderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body style='background-color: lightblue;'>");
        out.println("<hr>");
        out.println("<img src='viveklogo.png' width='150' height='150'>");
       
      
        out.println("<center>");
        out.println("<h1 style='margin-right:40px''>VIVEK Infotech</h1>");
       
        out.println("</center>");
        out.println("<a href='home'style='margin-right:30px'>Home</a>  ");
        out.println("<a href='contact'style='margin-right:30px'>Contact</a>  ");
        out.println("<a href='services'style='margin-right:30px'>Services</a> ");
        out.println(" <a href=\"contact\" style='margin-right:30px'>About us</a> ");
        out.println("<a href=\"contact\" style='margin-right:40%'>Careers</a>  ");
        
        out.println("");
        out.println("<button style='margin-right:40px'>Click Here to Regristration</button>");
        out.println("<button>Click Here to Login</button>");
        out.println("<h2 style='color:purple'>CEO & Founder Vivek Singh</h2>");  
        
            
        out.println("<hr>");
        
        out.println("</body>");
        out.println("</html>");
    }
}