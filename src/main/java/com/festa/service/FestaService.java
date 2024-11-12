package com.festa.service;

import com.festa.dto.FestaDTO;
import com.festa.model.FestaModel;
import com.festa.repository.FestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FestaService {
    @Autowired
    private FestaRepository repository;
    private FestaModel festarepo;
    public FestaModel criarFesta(FestaModel festa){
        return repository.save(festa);
    }
    public FestaModel atualizarFesta(FestaModel festa){
        return repository.save(festa);
    }
    public List<FestaModel> listarFestas(){
        return repository.findAll();
    }
    public Optional<FestaModel> ListarFestaId(Long id){
         if(repository.existsById(id)){
             return repository.findById(id);
         }
        return Optional.empty();
    }

    //trabalhando com dtos
    public FestaDTO listarFestaiddto(Long id){
        FestaModel festamodel = repository.findById(id).get();
        //converter
        FestaDTO festadto = new FestaDTO(festamodel);
        return festadto;
    }
}
