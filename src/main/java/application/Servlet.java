package application;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import application.Model;

import java.io.IOException;
import java.util.ArrayList;
//import application.Model;
@WebServlet("/register")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name=request.getParameter("name");
		String Email =request.getParameter("email");
		String Age=request.getParameter("age");
		String DateOfBirth=request.getParameter("dob");
		System.out.println(Name+""+Email+""+Age+""+DateOfBirth);
		Model m=new Model(Name,Email,Age,DateOfBirth);
		m.setName(Name);
		m.setEmail(Email);
		m.setAge(Age);
		m.setDateOfBirth(DateOfBirth);
		Dao d=new Dao();
		String status=d.insertData(m);                   
		if(status.equals("success")) {
			ArrayList<Model> list=d.listData(m);
			request.setAttribute("list", list);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			for(Model e:list)
				System.out.println(e);	
		}
		else {
			
			RequestDispatcher rd1=request.getRequestDispatcher("/Webapp.jsp");
			rd1.include(request,response);
		
	}
	}

}
