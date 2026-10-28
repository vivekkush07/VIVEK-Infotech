package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/about")
public class AboutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);

        out.println("<html>");
        out.println("<body style='background:#f4f8fb;font-family:Arial,sans-serif;'>");

        // Hero Section
        out.println("<div style='background:#003366;color:white;padding:40px;text-align:center;'>");
        out.println("<h1>About VIVEK Infotech</h1>");
        out.println("<p>Innovative IT Solutions for Your Digital Success</p>");
        out.println("</div>");

        // About Company
        out.println("<div style='width:90%;margin:auto;padding:30px;'>");
        out.println("<h2 style='color:#003366;'>Who We Are</h2>");
        out.println("<p style='font-size:18px;'>");
        out.println("VIVEK Infotech is a modern software development company committed to delivering high-quality IT solutions. ");
        out.println("We specialize in website development, Java Full Stack Development, cloud solutions, software testing, ");
        out.println("mobile application development, database management, and digital transformation services.");
        out.println("</p>");

        out.println("<p style='font-size:18px;'>");
        out.println("Our experienced professionals work with the latest technologies to build secure, scalable, ");
        out.println("and user-friendly software solutions for startups, small businesses, and enterprises.");
        out.println("</p>");

        // Mission
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Our Mission</h2>");
        out.println("<p>");
        out.println("Our mission is to empower businesses through innovative technology solutions, helping clients achieve growth, productivity, and digital excellence.");
        out.println("</p>");

        // Vision
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Our Vision</h2>");
        out.println("<p>");
        out.println("Our vision is to become one of India's most trusted IT companies by delivering world-class software solutions and exceptional customer service.");
        out.println("</p>");

        // Core Values
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Our Core Values</h2>");
        out.println("<ul>");
        out.println("<li>✔ Innovation</li>");
        out.println("<li>✔ Integrity</li>");
        out.println("<li>✔ Customer Satisfaction</li>");
        out.println("<li>✔ Teamwork</li>");
        out.println("<li>✔ Quality & Excellence</li>");
        out.println("<li>✔ Continuous Learning</li>");
        out.println("</ul>");

        // Why Choose Us
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Why Choose VIVEK Infotech?</h2>");
        out.println("<table border='1' width='100%' cellpadding='12' cellspacing='0'>");
        out.println("<tr style='background:#003366;color:white;'>");
        out.println("<th>Feature</th>");
        out.println("<th>Benefit</th>");
        out.println("</tr>");

        out.println("<tr><td>Experienced Team</td><td>Professional Developers with Industry Experience</td></tr>");
        out.println("<tr><td>Latest Technology</td><td>Modern Tools & Frameworks</td></tr>");
        out.println("<tr><td>Affordable Pricing</td><td>Best Quality at Competitive Cost</td></tr>");
        out.println("<tr><td>24×7 Support</td><td>Dedicated Technical Assistance</td></tr>");
        out.println("<tr><td>Secure Solutions</td><td>Reliable & Protected Applications</td></tr>");
        out.println("</table>");

        // Company Statistics
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Company Statistics</h2>");

        out.println("<table border='1' width='100%' cellpadding='15'>");
        out.println("<tr style='background:#0066cc;color:white;'>");
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

        // Team
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Meet Our Leadership Team</h2>");
        out.println("<ul>");
        out.println("<li><b>Vivek Singh</b> – CEO & Founder</li>");
        out.println("<li><b>Rahul Kumar</b> – Technical Lead</li>");
        out.println("<li><b>Priya Sharma</b> – UI/UX Designer</li>");
        out.println("<li><b>Amit Verma</b> – QA Manager</li>");
        out.println("</ul>");

        // Technologies
        out.println("<hr>");
        out.println("<h2 style='color:#003366;'>Technologies We Work With</h2>");
        out.println("<p>");
        out.println("Java, Servlet, JSP, Spring Boot, Hibernate, HTML, CSS, JavaScript, Bootstrap, React, Oracle, MySQL, PostgreSQL, AWS, Azure, Git and Maven.");
        out.println("</p>");

        // CTA
        out.println("<hr>");
        out.println("<div style='background:#003366;color:white;padding:30px;text-align:center;'>");
        out.println("<h2>Let's Build Something Amazing Together!</h2>");
        out.println("<p>Contact VIVEK Infotech today for innovative and reliable IT solutions.</p>");
        out.println("<button style='padding:12px 25px;background:#00b894;color:white;border:none;font-size:18px;'>Contact Us</button>");
        out.println("</div>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");

        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
    }
}