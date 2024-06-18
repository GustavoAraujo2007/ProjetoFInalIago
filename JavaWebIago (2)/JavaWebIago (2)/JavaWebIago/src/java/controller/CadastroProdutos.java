/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.bean.Categoria;
import model.bean.Produtos;
import model.bean.Secao;
import model.dao.CategoriaDAO;
import model.dao.ProdutosDAO;
import model.dao.SecaoDAO;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

/**
 *
 * @author Senai
 */
@WebServlet(urlPatterns = {"/produtos"})
@MultipartConfig
public class CadastroProdutos extends HttpServlet {

    Produtos produto = new Produtos();
    ProdutosDAO produtoDao = new ProdutosDAO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        CategoriaDAO categoria = new CategoriaDAO();
        List<Categoria> categorias = categoria.listarCategorias();
        request.setAttribute("categoria", categorias);
        String nextPage = "/WEB-INF/jsp/cadastroProdutos.jsp";
        
          SecaoDAO produtos = new SecaoDAO();
        List<Secao> secoes = produtos.listarSecao();
        request.setAttribute("secao", secoes);
        
        
        
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
        if (action.equals("/produtos")) {
            insert(request, response);
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

    protected void insert(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Part filePart = request.getPart("imagem");
        Part filePart1 = request.getPart("imagem1");
        Part filePart2 = request.getPart("imagem2");
        Part filePart3 = request.getPart("imagem3");
        Part filePart4 = request.getPart("imagem4");

        InputStream inputStream = filePart1.getInputStream();
        InputStream inputStream1 = filePart1.getInputStream();
        InputStream inputStream2 = filePart2.getInputStream();
        InputStream inputStream3 = filePart3.getInputStream();
        InputStream inputStream4 = filePart4.getInputStream();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream outputStream1 = new ByteArrayOutputStream();
        ByteArrayOutputStream outputStream2 = new ByteArrayOutputStream();
        ByteArrayOutputStream outputStream3 = new ByteArrayOutputStream();
        ByteArrayOutputStream outputStream4 = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;
        
         while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        while ((bytesRead = inputStream1.read(buffer)) != -1) {
            outputStream1.write(buffer, 0, bytesRead);
        }
        while ((bytesRead = inputStream2.read(buffer)) != -1) {
            outputStream2.write(buffer, 0, bytesRead);
        }
        while ((bytesRead = inputStream3.read(buffer)) != -1) {
            outputStream3.write(buffer, 0, bytesRead);
        }
        while ((bytesRead = inputStream4.read(buffer)) != -1) {
            outputStream4.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = outputStream.toByteArray();
        byte[] imageBytes1 = outputStream1.toByteArray();
        byte[] imageBytes2 = outputStream2.toByteArray();
        byte[] imageBytes3 = outputStream3.toByteArray();
        byte[] imageBytes4 = outputStream4.toByteArray();

        produto.setImagem(imageBytes);
        produto.setImagem1(imageBytes1);
        produto.setImagem2(imageBytes2);
        produto.setImagem3(imageBytes3);
        produto.setImagem4(imageBytes4);
        produto.setNome_produtos(request.getParameter("nome"));
        produto.setCategoria(Integer.parseInt(request.getParameter("categoria")));
        produto.setPreco((int) Float.parseFloat(request.getParameter("preco")));
        produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
        produto.setDescricao(request.getParameter("descricao"));
        produto.setSecao(Integer.parseInt(request.getParameter("secao")));
        produtoDao.create(produto);
        response.sendRedirect("redirect.jsp");

    }

}
