package fr.dawan.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dawan.bdd.StagiaireDao;
import fr.dawan.domain.Stagiaire;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static StagiaireDao dao = new StagiaireDao();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *
	 *      On ne gere que le POST depuis un formulaire ...
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Stagiaire> resultat;
		try {
			resultat = dao.readAll();

			// On place le résultat en attribut de la requete/session (au choix)
			// pour pouvoir l'exploiter dans la JSP
			request.setAttribute("liste", resultat);

			// on redirige vers la JSP de liste, soit par redirection, soit par
			// forward
			// request.getRequestDispatcher("liste.jsp").forward(request,
			// response);
			response.sendRedirect("liste.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			response.sendError(500, e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.sendError(500, e.getMessage());
		}
	}

}
