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
import model.bean.Estoque;

/**
 *
 * @author Senai
 */
public class EstoqueDAO {
         public java.util.List<Estoque> read() {
        java.util.List<Estoque> estoqueList = new ArrayList();
    try {
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

       
        stmt = conexao.prepareStatement("SELECT * FROM ESTOQUE");
        rs = stmt.executeQuery();

        
        while (rs.next()) {
            
            Estoque estoque = new Estoque();
            
            estoque.setIdEstoque(rs.getInt("ID_ESTOQUE"));
            estoque.setNome_estoque(rs.getString("nome_estoque"));
            estoque.setCategoria_estoque(rs.getString("Categoria_estoque"));
            estoque.setPreco_estoque(rs.getInt("preco_estoque"));
            estoque.setQuantidade_estoque(rs.getInt("quantidade_estoque"));
            estoqueList.add(estoque);
        }
        
        rs.close();
        stmt.close();
        conexao.close();

    } catch (SQLException e) {
        
        e.printStackTrace();
    }
    
    return estoqueList;
}
     public void create(Estoque estoque) {

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;

            stmt = conexao.prepareCall("INSERT INTO estoque (nome_estoque, categoria_estoque, preco_estoque, quantidade_estoque) VALUES (?,?,?,?)");
            stmt.setString(1, estoque.getNome_estoque());
            stmt.setString(2, estoque.getCategoria_estoque());
            stmt.setInt(3, estoque.getPreco_estoque());
            stmt.setInt(4, estoque.getQuantidade_estoque());

            stmt.executeUpdate();

            stmt.close();
            conexao.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void delete(Estoque estoque){
        try{
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conexao.prepareCall("DELETE FROM estoque WHERE id_estoque = ?");
            stmt.setInt(1, estoque.getIdEstoque());
            
            stmt.executeUpdate();
            
            stmt.close();
            conexao.close();
            
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    } 
    public void update(Estoque estoque) {
    try {
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = null;
        stmt = conexao.prepareCall("UPDATE estoque SET nome_estoque = ?, categoria_estoque = ?, preco_estoque =?, quantidade_estoque = ? WHERE idEstoque = ?");
        stmt.setString(1, estoque.getNome_estoque());
        stmt.setString(2, estoque.getCategoria_estoque());
        stmt.setInt(3, estoque.getPreco_estoque());
        stmt.setInt(4, estoque.getQuantidade_estoque());
        stmt.executeUpdate();
        stmt.close();
        conexao.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
 

     
}
