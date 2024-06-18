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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.bean.Carrinho;
import model.bean.Produtos;
import model.dao.CarrinhoDAO;
import model.dao.ProdutosDAO;

@WebServlet(urlPatterns = "/enviarFormulario")
@MultipartConfig
public class ProdutoController extends HttpServlet {

    Carrinho objProduto = new Carrinho();
    CarrinhoDAO objProdutoDao = new CarrinhoDAO();

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
        CarrinhoDAO carrinho = new CarrinhoDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        List<Produtos> produtos = produto.produtoU(id);
        request.setAttribute("produtos", produtos);
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

        String action = request.getServletPath();
        String url = "/WEB-INF/jsp/punico.jsp";
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
        if (action.equals("/enviarFormulario")) {
            carrinho(request, response);
        } else {
            processRequest(request, response);
        }

    }

    protected void carrinho(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            Part filePart = request.getPart("imagem");
            InputStream inputStream = filePart.getInputStream();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("loginManter")) {
                    request.setAttribute("abacate", cookie.getValue());
                    byte[] imageBytes = outputStream.toByteArray();
                    objProduto.setNomeCarrinho(request.getParameter("nome"));
                    objProduto.setPrecoCarrinho(Float.parseFloat(request.getParameter("preco")));
                    objProduto.setDescricaoCarrinho(request.getParameter("descricao"));
                    objProduto.setImagemCarrinho(imageBytes);
                    objProduto.setTamanhoCarrinho(Integer.parseInt(request.getParameter("tamanho")));
                    objProduto.setQuantidadeCarrinho(Integer.parseInt(request.getParameter("quantidade")));
                    objProduto.setIdProdutos(Integer.parseInt(request.getParameter("idProduto")));
                    objProduto.setIdUsuario(Integer.parseInt(cookie.getValue()));
                    objProdutoDao.createC(objProduto);
                    System.out.println(cookie.getValue());
                }
            }
        } catch (Exception e) {
        }
    }

}
