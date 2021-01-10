package oldmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // business logic and get result
        req.setAttribute("user", new User("old mvc"));

        // forward to view
//        String unsecureView = "/unsecure/user.jsp";
//        RequestDispatcher dispatcher = req.getRequestDispatcher(unsecureView);

//        String secureView = "/WEB-INF/secure/old/user.jsp";
//        RequestDispatcher dispatcher = req.getRequestDispatcher(secureView);

        String fmView = "/WEB-INF/secure/old/user.ftl";
        RequestDispatcher dispatcher = req.getRequestDispatcher(fmView);
        dispatcher.forward(req, resp);
    }
}
