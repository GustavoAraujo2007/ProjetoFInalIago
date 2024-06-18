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
import model.bean.HistoricoPedidos;

/**
 *
 * @author Hellen
 */
public class HistoricoPedidosDAO {
     public List<HistoricoPedidos> listarHistorico(int idUsuario) {
        List<HistoricoPedidos> historico = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareCall("SELECT * FROM HistoricoDePedidos WHERE IdUsuario = ?");
             stmt.setInt(1, idUsuario);
            rs = stmt.executeQuery();
            while (rs.next()) {
                  HistoricoPedidos pedido = new HistoricoPedidos();
                pedido.setIdPedido(rs.getInt("idHistoricoDePedidos"));
                pedido.setIdUsuario(rs.getInt("idUsuario"));
                pedido.setNome_pedido(rs.getString("nome_pedido"));
                pedido.setDescricao_pedido(rs.getString("descricao_pedido"));
                pedido.setPreco_pedido(rs.getFloat("preco_pedido"));
                pedido.setQuantidade_pedido(rs.getInt("quantidade_pedido"));
                pedido.setTamanho_pedido(rs.getInt("tamanho_pedido"));
                pedido.setIdProdutos(rs.getInt("idProdutos"));
                pedido.setTotal_precoPedido(rs.getFloat("total_preco"));
                
                historico.add(pedido);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historico;
    }
     
     public List<HistoricoPedidos> listarHistoricoAdm() {
        List<HistoricoPedidos> historico = new ArrayList<>();
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareCall("SELECT * FROM historicoPedidos ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                  HistoricoPedidos pedido = new HistoricoPedidos();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setIdUsuario(rs.getInt("idUsuario"));
                pedido.setNome_pedido(rs.getString("nome_pedido"));
                pedido.setDescricao_pedido(rs.getString("descricao_pedido"));
                pedido.setPreco_pedido(rs.getFloat("preco_pedido"));
                pedido.setQuantidade_pedido(rs.getInt("quantidade_pedido"));
                pedido.setTamanho_pedido(rs.getInt("tamanho_pedido"));
                pedido.setIdProdutos(rs.getInt("idProdutos"));
                pedido.setTotal_precoPedido(rs.getFloat("total_precoPedido"));
                
                historico.add(pedido);
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historico;
    }
}
