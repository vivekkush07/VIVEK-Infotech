package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		RequestDispatcher rd = request.getRequestDispatcher("/header");

		rd.include(request, response);
		out.println("<html>");
        out.println("<body style='background-color: lightblue;'>");
        out.println("<hr>");
        out.println("<h2 style='color:blue;'>About VIVEK Infotech</h2>");
        out.println("<p>VIVEK Infotech is a trusted software company providing innovative technology solutions to businesses across different industries. Our mission is to deliver high-quality software products that help organizations grow in the digital world.</p>");

        out.println("<p>Our experienced team works on modern technologies to build secure, scalable, and user-friendly applications. We believe in customer satisfaction, timely delivery, and continuous innovation.</p>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Our Mission</h2>");
        out.println("<p>Our mission is to empower businesses with cutting-edge technology solutions that improve productivity, efficiency, and customer experience.</p>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Our Vision</h2>");
        out.println("<p>Our vision is to become one of India's leading IT companies by delivering world-class software solutions and creating long-term relationships with our clients.</p>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Our Services</h2>");
        out.println("<ul>");
        out.println("<li>Website Development</li>");
        out.println("<li>Java Full Stack Development</li>");
        out.println("<li>Mobile App Development</li>");
        out.println("<li>Cloud Solutions</li>");
        out.println("<li>Digital Marketing</li>");
        out.println("<li>Cyber Security</li>");
        out.println("<li>Software Testing</li>");
        out.println("<li>Database Management</li>");
        out.println("</ul>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Technologies We Use</h2>");
        out.println("<table border='1' cellpadding='10' cellspacing='0'>");
        out.println("<tr><th>Frontend</th><th>Backend</th><th>Database</th></tr>");
        out.println("<tr><td>HTML</td><td>Java</td><td>Oracle</td></tr>");
        out.println("<tr><td>CSS</td><td>Servlet</td><td>MySQL</td></tr>");
        out.println("<tr><td>JavaScript</td><td>Spring Boot</td><td>PostgreSQL</td></tr>");
        out.println("</table>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Why Choose Us?</h2>");
        out.println("<ul>");
        out.println("<li>Experienced Developers</li>");
        out.println("<li>Affordable Pricing</li>");
        out.println("<li>24/7 Technical Support</li>");
        out.println("<li>Secure Applications</li>");
        out.println("<li>On-Time Project Delivery</li>");
        out.println("<li>Latest Technologies</li>");
        out.println("<li>Customer Satisfaction</li>");
        out.println("</ul>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Our Projects</h2>");
        out.println("<ol>");
        out.println("<li>E-Commerce Website</li>");
        out.println("<li>Hospital Management System</li>");
        out.println("<li>Online Food Ordering System</li>");
        out.println("<li>Employee Management System</li>");
        out.println("<li>School Management System</li>");
        out.println("<li>Banking Application</li>");
        out.println("</ol>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Company Statistics</h2>");
        out.println("<table border='1' cellpadding='10' cellspacing='0'>");
        out.println("<tr><th>Projects Completed</th><th>Happy Clients</th><th>Employees</th><th>Experience</th></tr>");
        out.println("<tr><td>500+</td><td>300+</td><td>100+</td><td>10+ Years</td></tr>");
        out.println("</table>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Our Team</h2>");
        out.println("<p>Our dedicated team consists of Java Developers, Frontend Developers, Backend Developers, UI/UX Designers, QA Engineers, DevOps Engineers, Database Administrators, and Project Managers working together to build innovative software solutions.</p>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Client Testimonials</h2>");
        out.println("<p><b>Ankit Sharma:</b> Excellent service and timely delivery. Highly recommended.</p>");
        out.println("<p><b>Priya Verma:</b> Professional team with outstanding technical expertise.</p>");
        out.println("<p><b>Amit Raj:</b> They developed our business website exactly as we expected.</p>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Career Opportunities</h2>");
        out.println("<p>Join our growing team. We are hiring Java Developers, Full Stack Developers, Software Testers, UI Designers, and Digital Marketing Executives.</p>");

        out.println("<hr>");
        out.println("<h2 style='color:blue;'>Contact Information</h2>");
        out.println("<p>");
        out.println("VIVEK Infotech<br>");
        out.println("Hyderabad, Telangana, India<br>");
        out.println("Phone : +91-7762913118<br>");
        out.println("Email : info@vivekinfotech.com<br>");
        out.println("Working Hours : Monday - Saturday (9:00 AM - 6:00 PM)");
        out.println("</p>");
				 
		 out.println("</body>");
	     out.println("</html>");

		rd = request.getRequestDispatcher("/footer");

		rd.include(request, response);
	}
}