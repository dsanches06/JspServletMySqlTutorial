package login.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginRegister() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CustomerDAO cd = new CustomerDAOImp();
		String name = request.getParameter("name");
		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String submitType = request.getParameter("submit");
		Customer c = cd.getCustomer(userName, password);
		if (submitType.equals("login") && c != null && c.getName() != null) {
			request.setAttribute("welcomessage", c.getUserName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else if (submitType.equals("register")) {
			c.setName(name);
			c.setUserName(userName);
			c.setPassword(password);
			c.setEmail(email);
			c.setGender(gender);
			c.setCity(city);
			cd.insertCustomer(c);
			request.setAttribute("sucessMessage", "Registration done, please login to continue !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "Data Not Found, click on Register !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
