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
import model.bean.Secao;


/**
 *
 * @author Senai
 */
public class SecaoDAO {
    public List<Secao> listarSecao() {
        List<Secao> secoes = new ArrayList();
        
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT * FROM secao");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Secao s = new Secao();
                s.setIdSecao(rs.getInt("idSecao"));
                s.setNomeSecao(rs.getString("nome_secao"));
                
                secoes.add(s);
            }
        } catch(SQLException e) {
            
        }
        
        return secoes;
    }
}
