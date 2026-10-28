package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/services")
public class ServicesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		RequestDispatcher rd = request.getRequestDispatcher("/header");

		rd.include(request, response);
		out.println("<html>");
		out.println("<body style='background-color: lightblue;'>");
		out.println("<center>");
		out.println("<h2 >Services</h2>");
		out.println("</center>");
		out.println("<ol>");
		out.println(
				"<li style='color:purple'>Mobile App Development <span>:-We develop high-performance Android and iOS mobile applications with modern UI and secure backend integration.</span></li>");

		out.println(
				"<li style='color:brown'>Cloud Computing <span>:-We provide cloud-based solutions, cloud migration, hosting, storage, and deployment services using AWS, Azure, and Google Cloud.</span></li>");

		out.println(
				"<li style='color:darkblue'>UI/UX Design <span>:-Our designers create attractive, responsive, and user-friendly interfaces that improve customer experience.</span></li>");

		out.println(
				"<li style='color:darkgreen'>Software Development <span>:-Custom software solutions are designed according to business requirements using the latest technologies.</span></li>");

		out.println(
				"<li style='color:crimson'>API Development <span>:-We build secure REST APIs and integrate third-party services for seamless communication between applications.</span></li>");

		out.println(
				"<li style='color:teal'>Database Administration <span>:-Our experts manage Oracle, MySQL, SQL Server, and PostgreSQL databases with high security and performance.</span></li>");

		out.println(
				"<li style='color:darkorange'>DevOps Services <span>:-We automate software deployment, monitoring, and continuous integration using modern DevOps practices.</span></li>");

		out.println(
				"<li style='color:navy'>IT Consulting <span>:-We help businesses choose the right technology and provide expert IT consulting for digital transformation.</span></li>");

		out.println(
				"<li style='color:maroon'>Network Management <span>:-We design, monitor, and maintain secure computer networks for organizations.</span></li>");

		out.println(
				"<li style='color:darkcyan'>Website Maintenance <span>:-Regular website updates, security patches, backup, and performance optimization services.</span></li>");

		out.println(
				"<li style='color:darkmagenta'>Artificial Intelligence <span>:-We develop AI-powered applications, chatbots, and intelligent automation solutions.</span></li>");

		out.println(
				"<li style='color:olive'>Machine Learning <span>:-Build predictive models and data-driven solutions using machine learning technologies.</span></li>");

		out.println(
				"<li style='color:darkred'>Blockchain Solutions <span>:-Develop secure blockchain-based applications and smart contract solutions.</span></li>");

		out.println(
				"<li style='color:green'>ERP Solutions <span>:-Complete Enterprise Resource Planning software for business management and automation.</span></li>");

		out.println(
				"<li style='color:blue'>CRM Development <span>:-Customer Relationship Management systems to improve customer engagement and sales.</span></li>");

		out.println(
				"<li style='color:darkslateblue'>E-Commerce Development <span>:-Professional online shopping websites with secure payment gateway integration.</span></li>");

		out.println(
				"<li style='color:firebrick'>Web Hosting <span>:-Reliable hosting, domain registration, SSL certificate, and server management services.</span></li>");

		out.println(
				"<li style='color:darkgoldenrod'>SEO Optimization <span>:-Improve website ranking on search engines with advanced SEO strategies.</span></li>");

		out.println(
				"<li style='color:indigo'>Technical Support <span>:-24×7 technical support, troubleshooting, and maintenance for all IT services.</span></li>");
		out.println("</ol>");
		
		out.println("<li style='color:darkblue'>Enterprise Software Development <span>:-We develop enterprise-grade software solutions for large organizations with high security and scalability.</span></li>");

		out.println("<li style='color:green'>Custom Software Development <span>:-We create customized software applications based on specific business requirements.</span></li>");

		out.println("<li style='color:purple'>ERP Development <span>:-Enterprise Resource Planning systems to manage HR, Finance, Sales, Inventory, and Operations.</span></li>");

		out.println("<li style='color:brown'>CRM Development <span>:-Customer Relationship Management software to improve customer engagement and sales.</span></li>");

		out.println("<li style='color:darkred'>Web Portal Development <span>:-Secure business portals, employee portals, student portals, and customer portals.</span></li>");

		out.println("<li style='color:orange'>Payment Gateway Integration <span>:-Integrate secure online payment systems such as Razorpay, Stripe, and PayPal.</span></li>");

		out.println("<li style='color:teal'>Business Intelligence <span>:-Data analytics and reporting solutions for better business decisions.</span></li>");

		out.println("<li style='color:navy'>IT Infrastructure Management <span>:-Complete management of servers, networks, storage, and IT infrastructure.</span></li>");

		out.println("<li style='color:darkcyan'>Cloud Migration <span>:-Move applications and databases securely to cloud platforms.</span></li>");

		out.println("<li style='color:crimson'>Data Backup & Recovery <span>:-Protect business data with secure backup and disaster recovery solutions.</span></li>");

		out.println("<li style='color:darkgreen'>Email Solutions <span>:-Professional business email setup and management services.</span></li>");

		out.println("<li style='color:indigo'>Domain & Hosting Services <span>:-Domain registration, web hosting, SSL certificates, and server maintenance.</span></li>");

		out.println("<li style='color:darkorange'>IT Support & Maintenance <span>:-24×7 technical support, software maintenance, and system monitoring.</span></li>");

		out.println("<li style='color:darkmagenta'>IoT Solutions <span>:-Internet of Things applications for smart devices and automation.</span></li>");

		out.println("<li style='color:blue'>Data Analytics <span>:-Analyze business data to improve performance and make informed decisions.</span></li>");

		out.println("</body>");
		out.println("</html>");

		rd = request.getRequestDispatcher("/footer");

		rd.include(request, response);
	}
}