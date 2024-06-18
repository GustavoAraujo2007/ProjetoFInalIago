/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Produtos;

/**
 *
 * @author Senai
 */
public class ProdutosDAO {

    public List<Produtos> readProdutos1() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 1");
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos2() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 2");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos3() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 3");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos4() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 4");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos5() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 5");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos6() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 6");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos7() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 7");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos8() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 8");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos9() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 9");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
    public List<Produtos> readProdutos10() {
        List<Produtos> produtos = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos Where secao = 10");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produtos produto = new Produtos();
                produto.setIdProdutos(rs.getInt("idProdutos"));
                produto.setNome_produtos(rs.getString("nome"));
                produto.setCategoria(rs.getInt("categoria"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getInt("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setImagem(rs.getBytes("imagem"));
                produto.setImagem1(rs.getBytes("imagem1"));
                produto.setImagem2(rs.getBytes("imagem2"));
                produto.setImagem3(rs.getBytes("imagem3"));
                produto.setImagem4(rs.getBytes("imagem4"));

                produtos.add(produto);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    

    public void create(Produtos produto) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareStatement("INSERT INTO produtos(nome, imagem, imagem1, imagem2, imagem3, imagem4, categoria, descricao, preco, quantidade, secao)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, produto.getNome_produtos());
            stmt.setBytes(2, produto.getImagem());
            stmt.setBytes(3, produto.getImagem1());
            stmt.setBytes(4, produto.getImagem2());
            stmt.setBytes(5, produto.getImagem3());
            stmt.setBytes(6, produto.getImagem4());
            stmt.setInt(7, produto.getCategoria());
            stmt.setString(8, produto.getDescricao());
            stmt.setFloat(9, produto.getPreco());
            stmt.setInt(10, produto.getQuantidade());
            stmt.setInt(11, produto.getSecao());
            stmt.executeUpdate();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produtos> pesquisar(String pesquisar) {
        List<Produtos> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE nome LIKE ?");
            stmt.setString(1, "%" + pesquisar + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos produtos = new Produtos();
                produtos.setIdProdutos(rs.getInt("idProdutos"));
                produtos.setNome_produtos(rs.getString("nome"));
                produtos.setImagem(rs.getBytes("imagem"));
                produtos.setCategoria(rs.getInt("categoria"));
                produtos.setDescricao(rs.getString("descricao"));
                produtos.setPreco((int) rs.getFloat("preco"));
                produtos.setQuantidade(rs.getInt("quantidade"));
                produto.add(produtos);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }

    public List<Produtos> produto(int categoria) {
        List<Produtos> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE categoria = ?");
            stmt.setInt(1, categoria);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos prt = new Produtos();
                prt.setIdProdutos(rs.getInt("idProdutos"));
                prt.setNome_produtos(rs.getString("nome"));
                prt.setImagem(rs.getBytes("imagem"));
                prt.setCategoria(rs.getInt("categoria"));
                prt.setDescricao(rs.getString("descricao"));
                prt.setPreco((int) rs.getFloat("preco"));
                prt.setQuantidade(rs.getInt("quantidade"));
                produto.add(prt);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }
public List<Produtos> produtoU(int  id) {
        List<Produtos> produto = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM produtos WHERE IdProdutos = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produtos a= new Produtos();
                a.setIdProdutos(rs.getInt("idProdutos"));
                a.setNome_produtos(rs.getString("nome"));
                a.setPreco((int) rs.getFloat("preco"));
                a.setQuantidade(rs.getInt("quantidade"));
                a.setImagem(rs.getBytes("imagem"));
                a.setImagem1(rs.getBytes("imagem1"));
                a.setImagem2(rs.getBytes("imagem2"));
                a.setImagem3(rs.getBytes("imagem3"));
                a.setImagem4(rs.getBytes("imagem4"));
                a.setCategoria(rs.getInt("categoria"));
                a.setDescricao(rs.getString("descricao"));
                produto.add(a);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produto;
    }


public void deleteProduto(int id) {
    try {
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = null;

        stmt = conexao.prepareStatement("DELETE FROM produtos WHERE idCarrinho = ?");
        stmt.setInt(1, id);

        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Nenhum produto encontrado com o ID informado.");
        }

        stmt.close();
        conexao.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
