package ynovM.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet({ "ConnexionServlet", "connexion" })
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnexionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			// TODO: connexion avec daojpa
			
			/*
			Compte compte = new Compte();
			compte.setUserName(request.getParameter("id"));
			compte.setPassword(request.getParameter("mdp"));

			compte = CompteDAO.login(compte);

			if (compte.isValid()) {

				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", compte);
				response.sendRedirect("yoloooo.jsp"); // TODO:replacer par la page de météo
			}

			else {
				request.setAttribute("authentification", "Compte ou mot de passe incorrect");
				request.getRequestDispatcher("connexion.jsp").forward(request, response);
				// response.sendRedirect("invalidLogin.jsp"); //TODO : error page
			}
			*/
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}

	}

}
