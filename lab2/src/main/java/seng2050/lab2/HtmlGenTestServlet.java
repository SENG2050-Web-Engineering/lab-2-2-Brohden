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
        out.println("<head>");
        out.println(HtmlGen.head("A New Title"));
        out.println(HtmlGen.css("styles/style.css"));
        out.println(HtmlGen.script("js/script.js"));
        out.println("</head>");
        out.println("<body>");
        out.println(HtmlGen.h1("HtmlGen Test Servlet Header 1"));
        out.println(HtmlGen.h2("HtmlGen Test Servlet Header 2"));
        out.println(HtmlGen.h3("HtmlGen Test Servlet Header 3"));
        out.println("<p>This is new test code for htmlGen</p>");
        out.println("</body></html>");
    }
}