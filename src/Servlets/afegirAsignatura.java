package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlumneDao;

/**
 * Servlet implementation class afegirAsignatura
 */
@WebServlet("/afegirAsignatura")
public class afegirAsignatura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public afegirAsignatura() {
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
		
		
		String nom=request.getParameter("nom");
		String credits2=request.getParameter("credits");
		int credits=Integer.parseInt(credits2);
		
		AlumneDao alum = new AlumneDao();
		
		alum.CrearAssignatura(nom, credits);
		
		response.sendRedirect("afegirAsignatura.jsp");
		
		
	}

}
