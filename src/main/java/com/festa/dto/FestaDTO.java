package com.festa.dto;

import com.festa.model.FestaModel;

public class FestaDTO {
    private Long Id;
    private String nome;
    private Integer qtdePessoas;
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

    //construtor com argumentos
    public FestaDTO(Long id, String nome, Integer qtdePessoas) {
        Id = id;
        this.nome = nome;
        this.qtdePessoas = qtdePessoas;
    }
    //converter em objeto festa
     public FestaDTO(FestaModel festamodel){
        Id = festamodel.getId();
        nome = festamodel.getNome();
        qtdePessoas = festamodel.getQtdePessoas();
    }
}
