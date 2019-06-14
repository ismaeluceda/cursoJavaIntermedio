package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//etiqueta de JEE -> paquete javax
//url -> http://localhost:8080/06_SpringWeb/ServletPrueba
@WebServlet("/ServletPrueba")
public class ServletPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por el doGET");

		String nombre = request.getParameter("nombre");
		System.out.println("hola " + nombre);
		
		if(nombre!=null) {
			request.getSession().setAttribute("nombreSesion", nombre);
		}
		
		//ahora irian las posibles llamadas al gestor
		
		RequestDispatcher rd = request.getRequestDispatcher("principal.jsp");
		//enviamos datos
		request.setAttribute("atributoNombre", nombre);
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por el doPOST");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doGet(request, response);
	}

}
