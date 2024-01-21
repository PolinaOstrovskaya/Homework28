import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ProcessRequestServ extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");

        if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
            // Перенаправляем обратно на страницу ввода данных
            resp.sendRedirect("save-request.jsp");
        } else {
            // В случае корректно заполненной формы перенаправляем на страницу успешного сохранения
            resp.sendRedirect("success.jsp?name=" + name + "&email=" + email);
        }
    }
}

