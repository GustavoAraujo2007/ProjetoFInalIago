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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Carrinho;
import model.bean.HistoricoPedidos;
import model.dao.CarrinhoDAO;
import model.dao.HistoricoPedidosDAO;

/**
 *
 * @author Hellen
 */
public class HistoricoPedidiosController extends HttpServlet {

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
            HistoricoPedidosDAO historicoPedidosDAO = new HistoricoPedidosDAO();
            List<HistoricoPedidos> historicos = historicoPedidosDAO.listarHistorico(idUsuario);
            request.setAttribute("historico", historicos);
             CarrinhoDAO carrinhoDAO = new CarrinhoDAO();
            List<Carrinho> carrinhos = carrinhoDAO.listarCar(idUsuario);
            request.setAttribute("carrinho", carrinhos);
             float totalPreco = carrinhoDAO.calcularPreco(idUsuario);
             request.setAttribute("totalPreco", totalPreco);
        } else {
            PrintWriter out = response.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Faça login .');");
            out.println("</script>");
        }
        String nextPage = "/WEB-INF/jsp/historicoPedidos.jsp";
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
        processRequest(request, response);
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

}
