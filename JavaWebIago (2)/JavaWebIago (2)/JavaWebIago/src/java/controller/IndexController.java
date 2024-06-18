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
import model.bean.Categoria;
import model.bean.Produtos;
import model.dao.CarrinhoDAO;
import model.dao.CategoriaDAO;
import model.dao.ProdutosDAO;

/**
 *
 * @author Senai
 */
public class IndexController extends HttpServlet {

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
        
        List<Produtos> produtos = produto.readProdutos1();
        request.setAttribute("produtos", produtos);
        
        ProdutosDAO produto2 = new ProdutosDAO();
        List<Produtos> produtos2 = produto2.readProdutos2();
        request.setAttribute("produtos3", produtos2);
        
        ProdutosDAO produto3 = new ProdutosDAO();
        List<Produtos> produtos3 = produto3.readProdutos3();
        request.setAttribute("produtos3", produtos3);
        
        ProdutosDAO produto4 = new ProdutosDAO();
        List<Produtos> produtos4 = produto4.readProdutos4();
        request.setAttribute("produtos4", produtos4);
        
        ProdutosDAO produto5 = new ProdutosDAO();
        List<Produtos> produtos5 = produto5.readProdutos5();
        request.setAttribute("produtos5", produtos5);
        
        ProdutosDAO produto6 = new ProdutosDAO();
        List<Produtos> produtos6 = produto6.readProdutos6();
        request.setAttribute("produtos6", produtos6);
        
        ProdutosDAO produto7 = new ProdutosDAO();
        List<Produtos> produtos7 = produto7.readProdutos7();
        request.setAttribute("produtos7", produtos7);
        
        ProdutosDAO produto8 = new ProdutosDAO();
        List<Produtos> produtos8 = produto8.readProdutos8();
        request.setAttribute("produtos8", produtos8);
        
        ProdutosDAO produto9 = new ProdutosDAO();
        List<Produtos> produtos9 = produto9.readProdutos9();
        request.setAttribute("produtos9", produtos9);
        
        ProdutosDAO produto10 = new ProdutosDAO();
        List<Produtos> produtos10 = produto10.readProdutos10();
        request.setAttribute("produtos10", produtos10);
       
        CategoriaDAO categoria = new CategoriaDAO();
        List<Categoria> categorias = categoria.listarCategorias();
        request.setAttribute("categoria", categorias);
      
        CarrinhoDAO carrinho = new CarrinhoDAO();

                Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("loginManter")){
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
