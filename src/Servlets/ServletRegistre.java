package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlumneDao;


/**
 * Servlet implementation class ServletRegistre
 */
@WebServlet("/ServletRegistre")
public class ServletRegistre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomUser=request.getParameter("nomUser");
		String password=request.getParameter("password");
		String nom=request.getParameter("nom");
		String edat2=request.getParameter("edat");
		int edat=Integer.parseInt(edat2);
		String cognoms=request.getParameter("cognoms");
		
		
		AlumneDao alum = new AlumneDao();
		
		alum.CrearAlumne(nomUser, password, nom, cognoms, edat);
		
		response.sendRedirect("index.jsp");
	}

}
