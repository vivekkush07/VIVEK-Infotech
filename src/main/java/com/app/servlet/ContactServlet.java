package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        RequestDispatcher rd =
                request.getRequestDispatcher("/header");

        rd.include(request, response);
        out.println("<html>");
        out.println("<body style='background:#f4f8fb;font-family:Arial,sans-serif;'>");

        // Hero Section
        out.println("<center>");
        out.println("<img src='logo.png' width='150' height='150'>");
        out.println("<h1 style='color:#003366;'>Welcome to VIVEK Infotech</h1>");
        out.println("<h3 style='color:#0066cc;'>Innovate • Develop • Deliver</h3>");
        out.println("<p>We Build Modern Websites, Enterprise Software, Mobile Apps & Cloud Solutions.</p>");
        out.println("<hr width='80%'>");
        out.println("</center>");

        // About
        out.println("<h2 style='color:#003366;'>About Us</h2>");
        out.println("<p>");
        out.println("VIVEK Infotech is a professional software development company providing innovative IT solutions for startups, small businesses, and enterprises. Our team delivers secure, scalable, and high-quality applications using the latest technologies.");
        out.println("</p>");

        // Mission
        out.println("<h2 style='color:#003366;'>Our Mission</h2>");
        out.println("<p>To empower businesses with innovative, secure, and scalable technology solutions.</p>");

        // Vision
        out.println("<h2 style='color:#003366;'>Our Vision</h2>");
        out.println("<p>To become one of India's most trusted IT companies by delivering world-class software solutions.</p>");

        // Services
        out.println("<h2 style='color:#003366;'>Our Services</h2>");
        out.println("<table border='1' width='100%' cellpadding='10' cellspacing='0'>");
        out.println("<tr bgcolor='#003366' style='color:white;'>");
        out.println("<th>Service</th>");
        out.println("<th>Description</th>");
        out.println("</tr>");

        out.println("<tr><td>Website Development</td><td>Professional Responsive Websites</td></tr>");
        out.println("<tr><td>Java Full Stack</td><td>Enterprise Java Applications</td></tr>");
        out.println("<tr><td>Mobile App Development</td><td>Android Applications</td></tr>");
        out.println("<tr><td>Cloud Computing</td><td>AWS & Cloud Solutions</td></tr>");
        out.println("<tr><td>Cyber Security</td><td>Secure Business Applications</td></tr>");
        out.println("<tr><td>Software Testing</td><td>Manual & Automation Testing</td></tr>");
        out.println("</table>");

        // Technologies
        out.println("<h2 style='color:#003366;'>Technologies We Use</h2>");
        out.println("<ul>");
        out.println("<li>Java</li>");
        out.println("<li>Spring Boot</li>");
        out.println("<li>Servlet & JSP</li>");
        out.println("<li>HTML5 & CSS3</li>");
        out.println("<li>JavaScript</li>");
        out.println("<li>Bootstrap</li>");
        out.println("<li>MySQL & Oracle</li>");
        out.println("<li>Git & GitHub</li>");
        out.println("</ul>");

        // Why Choose Us
        out.println("<h2 style='color:#003366;'>Why Choose Us?</h2>");
        out.println("<ul>");
        out.println("<li>✔ Experienced Developers</li>");
        out.println("<li>✔ Affordable Pricing</li>");
        out.println("<li>✔ 24×7 Technical Support</li>");
        out.println("<li>✔ On-Time Project Delivery</li>");
        out.println("<li>✔ Latest Technologies</li>");
        out.println("<li>✔ Customer Satisfaction</li>");
        out.println("</ul>");

        // Statistics
        out.println("<h2 style='color:#003366;'>Company Statistics</h2>");
        out.println("<table border='1' width='100%' cellpadding='10'>");
        out.println("<tr bgcolor='lightgray'>");
        out.println("<th>Projects</th>");
        out.println("<th>Clients</th>");
        out.println("<th>Developers</th>");
        out.println("<th>Experience</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td align='center'>500+</td>");
        out.println("<td align='center'>300+</td>");
        out.println("<td align='center'>100+</td>");
        out.println("<td align='center'>10+ Years</td>");
        out.println("</tr>");
        out.println("</table>");

        // Projects
        out.println("<h2 style='color:#003366;'>Featured Projects</h2>");
        out.println("<ol>");
        out.println("<li>E-Commerce Website</li>");
        out.println("<li>Hospital Management System</li>");
        out.println("<li>Employee Management System</li>");
        out.println("<li>School Management System</li>");
        out.println("<li>Banking Management System</li>");
        out.println("<li>Online Food Ordering System</li>");
        out.println("</ol>");

        // Team
        out.println("<h2 style='color:#003366;'>Meet Our Team</h2>");
        out.println("<table border='1' width='100%' cellpadding='10'>");
        out.println("<tr bgcolor='#003366' style='color:white;'>");
        out.println("<th>Name</th>");
        out.println("<th>Designation</th>");
        out.println("</tr>");

        out.println("<tr><td>Vivek Singh</td><td>CEO & Founder</td></tr>");
        out.println("<tr><td>Piyush Singh </td><td>Technical Lead</td></tr>");
        out.println("<tr><td>Sanjeet Kumar</td><td>Manaige Director</td></tr>");
        out.println("<tr><td>Ankit Sharma</td><td>Mainegar</td></tr>");
        out.println("</table>");

        // Testimonials
        out.println("<h2 style='color:#003366;'>Client Testimonials</h2>");
        out.println("<p>⭐⭐⭐⭐⭐ Excellent Service and Professional Team.</p>");
        out.println("<p>⭐⭐⭐⭐⭐ Best Software Company for Business Solutions.</p>");
        out.println("<p>⭐⭐⭐⭐⭐ Highly Recommended for Web Development.</p>");

        // Career
        out.println("<h2 style='color:#003366;'>Careers</h2>");
        out.println("<p>We are hiring Java Developers, Full Stack Developers, UI Designers and QA Engineers.</p>");

        // Contact
        out.println("<h2 style='color:#003366;'>Contact Us</h2>");
        out.println("<p>");
        out.println("<b>Address:</b> Hyderabad, Telangana<br>");
        out.println("<b>Phone:</b> +91-7762913118<br>");
        out.println("<b>Email:</b> info@vivekinfotech.com<br>");
        out.println("<b>Website:</b> www.vivekinfotech.com");
        out.println("</p>");

        out.println("</body>");
        out.println("</html>");

        rd = request.getRequestDispatcher("/footer");

        rd.include(request, response);
    }
}