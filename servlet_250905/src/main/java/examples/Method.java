package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Method")
public class Method extends HttpServlet {
//	get 방식일 때 호출됨
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>get 방식일 때 호출됨</h1>");
	}

//	post 방식일 때 호출됨
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>post 방식일 때 호출됨</h1>");
	}
}
