/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Base64;

/**
 *
 * @author Senai
 */
public class Produtos {
private int idProdutos;
private String nome_produtos;
private int categoria;
private int secao;
private String descricao;
private float preco;
private int quantidade;
private byte[] imagem;
private byte[] imagem1;
private byte[] imagem2;
private byte[] imagem3;
private byte[] imagem4;


  public String getImagemBase64() {
        if (imagem != null) {
            return Base64.getEncoder().encodeToString(imagem);
        } else {
            return "";
        }
    }
    public String getImagem1Base64() {
        if (imagem1 != null) {
            return Base64.getEncoder().encodeToString(imagem1);
        } else {
            return "";
        }
    }
      public String getImagem2Base64() {
        if (imagem2 != null) {
            return Base64.getEncoder().encodeToString(imagem2);
        } else {
            return "";
        }
    }
        public String getImagem3Base64() {
        if (imagem3 != null) {
            return Base64.getEncoder().encodeToString(imagem3);
        } else {
            return "";
        }
    }
          public String getImagem4Base64() {
        if (imagem4 != null) {
            return Base64.getEncoder().encodeToString(imagem4);
        } else {
            return "";
        }
        
    }

    public Produtos() {
    }

    public Produtos(int idProdutos, String nome_produtos, int categoria, int secao, String descricao, float preco, int quantidade, byte[] imagem, byte[] imagem1, byte[] imagem2, byte[] imagem3, byte[] imagem4) {
        this.idProdutos = idProdutos;
        this.nome_produtos = nome_produtos;
        this.categoria = categoria;
        this.secao = secao;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imagem = imagem;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
        this.imagem4 = imagem4;
    }

    public int getIdProdutos() {
        return idProdutos;
    }

    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    public String getNome_produtos() {
        return nome_produtos;
    }

    public void setNome_produtos(String nome_produtos) {
        this.nome_produtos = nome_produtos;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public byte[] getImagem1() {
        return imagem1;
    }

    public void setImagem1(byte[] imagem1) {
        this.imagem1 = imagem1;
    }

    public byte[] getImagem2() {
        return imagem2;
    }

    public void setImagem2(byte[] imagem2) {
        this.imagem2 = imagem2;
    }

    public byte[] getImagem3() {
        return imagem3;
    }

    public void setImagem3(byte[] imagem3) {
        this.imagem3 = imagem3;
    }

    public byte[] getImagem4() {
        return imagem4;
    }

    public void setImagem4(byte[] imagem4) {
        this.imagem4 = imagem4;
    }
    
 
}
