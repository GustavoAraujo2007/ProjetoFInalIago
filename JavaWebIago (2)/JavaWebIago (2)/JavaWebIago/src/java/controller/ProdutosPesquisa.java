/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

/**
 *
 * @author Senai
 */
@WebServlet(urlPatterns = "/pesquisar")
@MultipartConfig
public class ProdutosPesquisa extends HttpServlet {

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
        ProdutosDAO produto = new ProdutosDAO();
        String nome = request.getParameter("nome");
        List<Produtos> produtos = produto.pesquisar(nome);
        request.setAttribute("produtos", produtos);
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("loginManter")){
                request.setAttribute("abacate", cookie.getValue());
                System.out.println(cookie.getValue());
            }
        }
                String url = "/WEB-INF/jsp/index.jsp";
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String action = request.getServletPath();
        if (action.equals("/pesquisar")) {
            achar(request, response);
        } else {
            processRequest(request, response);
        }
    }
        protected void achar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ProdutosDAO produto = new ProdutosDAO();
        String nome = request.getParameter("pesquisa");
        List<Produtos> produtos = produto.pesquisar(nome);
        request.setAttribute("produtos", produtos);
                String url = "/WEB-INF/jsp/index.jsp";
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


}

    