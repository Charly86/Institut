package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.AlumneVo;
import vo.AssignaturaVo;
import dao.AlumneDao;

/**
 * Servlet implementation class matricular
 */
@WebServlet("/matricular")
public class matricular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public matricular() {
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
		String alumne=request.getParameter("alumne");
		String nota2=request.getParameter("nota");
		int nota=Integer.parseInt(nota2);
		
		
		AlumneDao alum = new AlumneDao();
		
		AssignaturaVo a=alum.CrearAssignatura(nom, alum.retornaCredits(nom));
		
		AlumneVo al= alum.buscarAlumne(alumne);
		
		alum.CrearMatricula(al, a, nota);
		
		response.sendRedirect("pagUsuari.jsp");
	}

}
