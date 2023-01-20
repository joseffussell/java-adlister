import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "pizza-order", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //crust type, sauce type, size type (use select inputs), toppings (checkboxes), and delivery address (text input)
        String crustType = request.getParameter("crust-type");
        String sauceType = request.getParameter("sauce-type");
        String sizeType = request.getParameter("size-type");
        String[] toppings = request.getParameterValues("toppings[]");
        String address = request.getParameter("delivery-address");
        System.out.println(crustType);
        System.out.println(sauceType);
        System.out.println(sizeType);
        System.out.println(address);
        for (String t: Arrays.asList(toppings)) {
            System.out.println(t);
        }
    }
}