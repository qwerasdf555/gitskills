package com.ajax.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LastAccessServlet
 */
@WebServlet("/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LastAccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookies[]=request.getCookies();
		for(int i=0;i< cookies.length;i++){
		  if(cookies[i].getName().equals("lastAccess")){
			 System.out.println(cookies[i].getName()+cookies[i].getValue()); 
		  }
		  else{
			  Date date = new Date();
			  Cookie cookie = new Cookie("date",date.toString());
			  cookie.setMaxAge(3600);
			  response.addCookie(cookie);
		  }
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
