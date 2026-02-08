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
        
        // Test your htmlgen here
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>HtmlGen Test</title></head>");
        out.println("<body>");
        out.println("<h1>HtmlGen Test Servlet</h1>");
        out.println("<p>Add your htmlgen test code here</p>");
        out.println("</body></html>");
    }
}