package com.example.servelet;

import com.example.controller.DB;
import com.example.model.User;
import com.sun.media.sound.ModelMappedInstrument;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/SignIn")
public class SignIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        ServletContext sc = request.getServletContext();

        if(sc.getAttribute("db") !=null){
            DB db =(DB) sc.getAttribute("db");

            boolean already = db.already(email);

            if(already == true){
                User user = db.getUser(email);

                if(email.equals(user.getEmail()) && password.equals(user.getPassword())){

                    request.setAttribute("un",user.getUsername());

                    request.getRequestDispatcher("Home.jsp").forward(request, response);

                }else{
                    response.sendRedirect("index.jsp");
                }
            }
        }

    }
}
