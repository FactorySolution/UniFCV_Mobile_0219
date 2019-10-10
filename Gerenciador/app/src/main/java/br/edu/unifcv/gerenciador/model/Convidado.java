package br.edu.unifcv.gerenciador.model;

public class Convidado {

    private Integer ID;
    private String Nome;
    private Integer Presenca;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getPresenca() {
        return Presenca;
    }

    public void setPresenca(Integer presenca) {
        Presenca = presenca;
    }
}
