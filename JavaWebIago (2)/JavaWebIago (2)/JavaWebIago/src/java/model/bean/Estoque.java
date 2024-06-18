/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Estoque {
private int idEstoque;
private String nome_estoque;
private String categoria_estoque;
private int preco_estoque;
private int quantidade_estoque;

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getNome_estoque() {
        return nome_estoque;
    }

    public void setNome_estoque(String nome_estoque) {
        this.nome_estoque = nome_estoque;
    }

    public String getCategoria_estoque() {
        return categoria_estoque;
    }

    public void setCategoria_estoque(String categoria_estoque) {
        this.categoria_estoque = categoria_estoque;
    }

    public int getPreco_estoque() {
        return preco_estoque;
    }

    public void setPreco_estoque(int preco_estoque) {
        this.preco_estoque = preco_estoque;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public Estoque(int idEstoque, String nome_estoque, String categoria_estoque, int preco_estoque, int quantidade_estoque) {
        this.idEstoque = idEstoque;
        this.nome_estoque = nome_estoque;
        this.categoria_estoque = categoria_estoque;
        this.preco_estoque = preco_estoque;
        this.quantidade_estoque = quantidade_estoque;
    }

    public Estoque() {
    }

}
