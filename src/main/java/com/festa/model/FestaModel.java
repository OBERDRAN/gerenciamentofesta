package com.festa.model;

import java.util.Objects;
public class FestaModel {
    private Long Id;
    private String nome;
    private Integer qtdePessoas;
    public FestaModel(Long id, String nome, Integer qtdePessoas){
        this.Id = id;
        this.nome = nome;
        this.qtdePessoas = qtdePessoas;
    }
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(Integer qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FestaModel that = (FestaModel) o;

        if (!Objects.equals(Id, that.Id)) return false;
        if (!Objects.equals(nome, that.nome)) return false;
        return Objects.equals(qtdePessoas, that.qtdePessoas);
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (qtdePessoas != null ? qtdePessoas.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "FestaModel{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", qtdePessoas=" + qtdePessoas +
                '}';
    }
}
