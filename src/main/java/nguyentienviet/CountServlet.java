package nguyentienviet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputString = request.getParameter("inputString");
        int count = (inputString != null) ? inputString.length() : 0;
        
        request.setAttribute("count", count);
        request.setAttribute("inputString", inputString);
        
        request.getRequestDispatcher("/count.jsp").forward(request, response);
    }
}
