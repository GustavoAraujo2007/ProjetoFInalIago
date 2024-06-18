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
import model.bean.Checkout;

/**
 *
 * @author Hellen
 */
public class CheckoutDAO {

    public void cCheckout(Checkout c) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            stmt = conexao.prepareStatement("INSERT INTO checkout (idUsuario, nome, sobrenome, email, pais, estado, cidade, bairro, rua, numero) VALUES (?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, c.getIdUsuario());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getSobrenome());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getPais());
            stmt.setString(6, c.getEstado());
            stmt.setString(7, c.getCidade());
            stmt.setString(8, c.getBairro());
            stmt.setString(9, c.getRua());
            stmt.setInt(10, c.getNumero());
            stmt.executeUpdate();

            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
  

}