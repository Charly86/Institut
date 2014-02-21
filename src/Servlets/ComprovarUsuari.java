package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.AlumneVo;
import dao.AlumneDao;

/**
 * Servlet implementation class ComprovarUsuari
 */
@WebServlet("/ComprovarUsuari")
public class ComprovarUsuari extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComprovarUsuari() {
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
		
		String nom = "";
		
		String password = "";
		
		if (request.getParameter("user") != null){
		
		nom = request.getParameter("user");
		}
		if (request.getParameter("password") != null){
		
		password = request.getParameter("password");
		
		}
		
			AlumneDao alum = new AlumneDao();
		
			if(alum.buscarAlumne(nom)!=null){
				
				AlumneVo a=alum.buscarAlumne(nom);
				
				HttpSession sesionOk = request.getSession();
				
				sesionOk.setAttribute("nom",a.getNomUser());
				
			
				
				response.sendRedirect("pagUsuari.jsp?ID="+a.getNomUser());
			}
			else{
				response.sendRedirect("index.jsp");
				
			}
	}

}
