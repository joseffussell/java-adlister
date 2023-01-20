import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    @Override protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String selectedColor = request.getParameter("color");
        request.setAttribute("color", selectedColor);
        System.out.println(selectedColor);
        response.sendRedirect("/viewcolor.jsp?color=" + URLEncoder.encode(selectedColor, StandardCharsets.UTF_8));

    }
}
