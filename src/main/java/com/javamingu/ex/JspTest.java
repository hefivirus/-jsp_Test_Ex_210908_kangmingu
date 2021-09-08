package com.javamingu.ex;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JspTest
 */
@WebServlet("/JspTest")
public class JspTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JspTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//request.setCharacterEncoding("EUC-KR");
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String name = getServletContext().getInitParameter("name");
		String email = getServletContext().getInitParameter("email");
		String juso = getServletContext().getInitParameter("juso");
		String job = getServletContext().getInitParameter("job");
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><head></head><body>");
		writer.println("아이디:" +name+"<br/>");
		writer.println("비밀번호:"+pw+"<br/>");
		writer.println("이름:" +name+"<br/>");
		writer.print("Email:"+email+" @ ");
		writer.println("  "+juso+"<br/>");
		writer.println("직업:" +job+"<br/>");
		
		writer.println("</body></html>");
		writer.close();

	}

}
