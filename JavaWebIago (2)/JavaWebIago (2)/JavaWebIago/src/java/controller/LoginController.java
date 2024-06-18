/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Senai
 */
@WebServlet(urlPatterns = {"/logar"})
@MultipartConfig
public class LoginController extends HttpServlet {

    Usuario usuario = new Usuario();
    UsuarioDAO userDao = new UsuarioDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = "/WEB-INF/jsp/login.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("loginManter")){
                request.setAttribute("abacate", cookie.getValue());
                System.out.println(cookie.getValue());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
        if (action.equals("/logar")) {
            logar(request, response);
        } else {
            processRequest(request, response);
        }
    }

    protected void logar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario usuario = new Usuario();
        usuario.setEmail(request.getParameter("gmail"));
        usuario.setSenha(request.getParameter("senha"));

        int idUsuario = userDao.logar(usuario);

        PrintWriter sout = response.getWriter();
        if (usuario.getEmail().trim().isEmpty() || usuario.getSenha().trim().isEmpty()) {
            sout.println("<script type=\"text/javascript\">");
            sout.println("alert('Por favor, preencha todos os campos.');");
            sout.println("window.location.href = './Login';");
            sout.println("</script>");
        } else {
            
            if (idUsuario > 0) {
 
                Cookie servilet = new Cookie("loginManter",Integer.toString(idUsuario));
                response.addCookie(servilet);
                if (idUsuario == 1) {
                    response.sendRedirect("./indexAdm");
                } else {
                    response.sendRedirect("./Index");
                }
            } else {
                sout.println("<script type=\"text/javascript\">");
                sout.println("alert('Uusario Ou Senha Errado.');");
                sout.println("window.location.href = './Login';");
                sout.println("</script>");
            }
        }
}
}
