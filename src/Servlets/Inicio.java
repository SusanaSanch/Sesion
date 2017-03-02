package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre = null;
		int n_llamadas = 0;
		
		nombre = request.getParameter("nombre");
		
		HttpSession session = request.getSession(false);
		
		if(session == null)
		{
		session = request.getSession(true);
		session.setAttribute("nombre_usuario", nombre);
		session.setAttribute("numero_llamadas", n_llamadas);
		}
			else
				{
				session.setAttribute("numero_llamadas", (Integer)(session.getAttribute("numero_llamadas")) + 1);
				}
		
		request.setAttribute("nombre_usuario", nombre);
		request.setAttribute("numero_llamadas", n_llamadas);
		response.sendRedirect("saludo.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
