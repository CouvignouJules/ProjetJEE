package ynovM.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ynovM.modele.technique.StationException;

/**
 * Servlet implementation class RedemarrerServlet
 */
@WebServlet({ "RedemarrerServlet", "redemarrer" })
public class RedemarrerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * HttpServlet#HttpServlet()
	 */
	public RedemarrerServlet() {
		// TODO Auto-generated constructor stub
		super();
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
		
		String id = request.getParameter("id");
		
		try {
			Manager.getInstance().redemarrer(Integer.parseInt(id));
			request.setAttribute("message", "OK");
		} catch (StationException e) {
			request.setAttribute("message", e.getMessage());
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
