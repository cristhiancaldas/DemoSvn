package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validacionUsuario
 */
public class validacionUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public validacionUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usu, pass;
        usu = request.getParameter("email");
        pass = request.getParameter("password");
        if(usu.equals("admin") && pass.equals("admin")){
            response.sendRedirect("loginExito.jsp");
        }else{
        	response.sendRedirect("loginError.jsp");
        }
	}
}