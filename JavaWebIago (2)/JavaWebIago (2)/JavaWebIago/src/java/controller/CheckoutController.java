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
import model.bean.Carrinho;
import model.bean.Checkout;
import model.dao.CarrinhoDAO;
import model.dao.CheckoutDAO;

/**
 *
 * @author Senai
 */
@WebServlet(urlPatterns = "/enviarFor")
@MultipartConfig
public class CheckoutController extends HttpServlet {

    Checkout objcheckout = new Checkout();
    CheckoutDAO objCheckoutDAO = new CheckoutDAO();

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
        String nextPage = "/WEB-INF/jsp/checkout.jsp";
        CarrinhoDAO carrinho = new CarrinhoDAO();
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("loginManter")) {
                request.setAttribute("abacate", cookie.getValue());
                System.out.println(cookie.getValue());
            }
        }
        int idUsuario = -1; // Valor padrão, caso não seja possível extrair o ID do usuário do cookie
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("loginManter")) {
                String cookieValue = cookie.getValue();
                try {
                    idUsuario = Integer.parseInt(cookieValue);
                } catch (NumberFormatException e) {
                    // Em caso de falha na conversão, o idUsuario permanecerá como -1
                    e.printStackTrace(); // ou outro tratamento de erro, se desejado
                }
                break; // Encerra o loop assim que encontrar o cookie desejado
            }
        }
// Verifica se o idUsuario foi definido com sucesso
        if (idUsuario != -1) {
            // Use o idUsuario para listar o carrinho
            CarrinhoDAO carrinhoDAO = new CarrinhoDAO();
            List<Carrinho> carrinhos = carrinhoDAO.listarCar(idUsuario);
            request.setAttribute("carrinho", carrinhos);
            float totalPreco = carrinho.calcularPreco(idUsuario);
            request.setAttribute("totalPreco", totalPreco);
            
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
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
        if (action.equals("/enviarFor")) {
            checkout(request, response);
        } else {
            processRequest(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void checkout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
     
        try {
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("loginManter")) {
                    

                    request.setAttribute("abacate", cookie.getValue());

                    objcheckout.setNome(request.getParameter("nome"));
                    System.out.println(request.getParameter("nome"));

                    objcheckout.setSobrenome(request.getParameter("sobrenome"));
                    System.out.println(request.getParameter("sobrenome"));

                    objcheckout.setEmail(request.getParameter("email"));
                    System.out.println(request.getParameter("email"));

                    objcheckout.setPais(request.getParameter("pais"));
                    System.out.println(request.getParameter("pais"));

                    objcheckout.setEstado(request.getParameter("estado"));
                    System.out.println(request.getParameter("estado"));

                    objcheckout.setCidade(request.getParameter("cidade"));
                    System.out.println(request.getParameter("cidade"));

                    objcheckout.setBairro(request.getParameter("bairro"));
                    System.out.println(request.getParameter("bairro"));

                    objcheckout.setRua(request.getParameter("rua"));
                    System.out.println(request.getParameter("rua"));

                    objcheckout.setNumero(Integer.parseInt(request.getParameter("numero")));
                    System.out.println(Integer.parseInt(request.getParameter("numero")));
                    
                    
                    
                    objcheckout.setIdUsuario(Integer.parseInt(cookie.getValue()));
                    objCheckoutDAO.cCheckout(objcheckout);

                }
            }
        } catch (Exception e) {
            // Lidar com exceção
        }

    }

}
