package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HtmlGenTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
        // Use HtmlGen to generate title
        out.println(HtmlGen.doctype());
        out.println(HtmlGen.head("My Custom Title"));
        out.println("<body>");
        out.println(HtmlGen.h1("HtmlGen Test Servlet"));
        out.println("<p>Add your htmlgen test code here</p>");
        out.println("</body></html>");
    }
}