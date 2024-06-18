/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Hellen
 */
public class HistoricoPedidos {
    private int idPedido;
    private int idUsuario;
    private String nome_pedido;
    private String descricao_pedido;
    private float preco_pedido;
    private int quantidade_pedido;
    private int tamanho_pedido;
    private int idProdutos;
    private float total_precoPedido;

    public HistoricoPedidos() {
    }

    public HistoricoPedidos(int idPedido, int idUsuario, String nome_pedido, String descricao_pedido, float preco_pedido, int quantidade_pedido, int tamanho_pedido, int idProdutos, float total_precoPedido) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.nome_pedido = nome_pedido;
        this.descricao_pedido = descricao_pedido;
        this.preco_pedido = preco_pedido;
        this.quantidade_pedido = quantidade_pedido;
        this.tamanho_pedido = tamanho_pedido;
        this.idProdutos = idProdutos;
        this.total_precoPedido = total_precoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome_pedido() {
        return nome_pedido;
    }

    public void setNome_pedido(String nome_pedido) {
        this.nome_pedido = nome_pedido;
    }

    public String getDescricao_pedido() {
        return descricao_pedido;
    }

    public void setDescricao_pedido(String descricao_pedido) {
        this.descricao_pedido = descricao_pedido;
    }

    public float getPreco_pedido() {
        return preco_pedido;
    }

    public void setPreco_pedido(float preco_pedido) {
        this.preco_pedido = preco_pedido;
    }

    public int getQuantidade_pedido() {
        return quantidade_pedido;
    }

    public void setQuantidade_pedido(int quantidade_pedido) {
        this.quantidade_pedido = quantidade_pedido;
    }

    public int getTamanho_pedido() {
        return tamanho_pedido;
    }

    public void setTamanho_pedido(int tamanho_pedido) {
        this.tamanho_pedido = tamanho_pedido;
    }

    public int getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public float getTotal_precoPedido() {
        return total_precoPedido;
    }

    public void setTotal_precoPedido(float total_precoPedido) {
        this.total_precoPedido = total_precoPedido;
    }
    
}
