package br.edu.unifcv.carros;

import android.graphics.drawable.Drawable;

public class CarroModel {

    private int id;
    private String modelo;
    private String fabricante;
    private int potencia;
    private Double preco;
    private Drawable imagem;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Drawable getImagem() {
        return imagem;
    }

    public void setImagem(Drawable imagem) {
        this.imagem = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CarroModel(int id, String modelo, String fabricante, int potencia, Double preco, Drawable imagem) {
        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.preco = preco;
        this.imagem = imagem;
    }
}
