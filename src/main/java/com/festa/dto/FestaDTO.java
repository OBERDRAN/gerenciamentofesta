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


    //converter em objeto festa
     public FestaDTO(FestaModel festa){
        this.Id = festa.getId();
        this.nome = festa.getNome();
        this.qtdePessoas = festa.getQtdePessoas();
    }
}
