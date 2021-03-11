package com.example.myWebApp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServletTraitement", value = "/ServletTraitement")
public class ServletTraitement extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String sexe = request.getParameter("sexe");
        String fonction = request.getParameter("fonction");
        String loisirs = request.getParameter("loisirs");
        String msg ="";

        if (sexe.equals("F")){
            msg ="Bonjour Mme " + nom + prenom ;
        }
        else{
            msg ="Bonjour Mr " +nom +prenom ;
        }
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> " + msg + "</h1>");
        out.println("<h2>  Fonction : " + fonction + "</h2>");
        out.println("<h2>  Loisirs      : " + loisirs + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}