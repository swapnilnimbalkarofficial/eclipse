package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.model.Student;

@WebServlet("/req1")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String btn = req.getParameter("b1");
		if (btn.equalsIgnoreCase("add")) {
			Student s1 = new Student();
			s1.setName(req.getParameter("name"));
			s1.setCity(req.getParameter("city"));
			s1.setPercentage(Double.parseDouble(req.getParameter("percentage")));
			int check = new StudentDao().insertStudent(s1);
			req.setAttribute("msg", (check != 0) ? "record added succesfully!!!" : "record Not added successfully!!!");
			req.getRequestDispatcher("index.jsp").forward(req, res);

		}
		if (btn.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(req.getParameter("id"));
			int check = new StudentDao().deleteById(id);
			req.setAttribute("msg", (check != 0) ? "recored deleted successfully!!!" : "record not found!!!");
			req.getRequestDispatcher("index.jsp").forward(req, res);
		}
		if (btn.equalsIgnoreCase("display")) {
			int id = Integer.parseInt(req.getParameter("id"));
			Student s = new StudentDao().findStudentById(id);
			if (s != null) {
				req.setAttribute("student", s);
				req.getRequestDispatcher("first.jsp").forward(req, res);
			} else {
				req.setAttribute("msg", "record NOT found!!!");
				req.getRequestDispatcher("index.jsp").forward(req, res);;
			}
		}
		if (btn.equalsIgnoreCase("update")) {

		}
	}

}
