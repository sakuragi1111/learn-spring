package oldmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginView = "/WEB-INF/secure/old/login.ftl";
        RequestDispatcher dispatcher = req.getRequestDispatcher(loginView);
        dispatcher.forward(req, resp);
    }
}