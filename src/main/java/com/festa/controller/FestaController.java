package com.festa.controller;

import com.festa.model.FestaModel;
import com.festa.service.FestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/festa")
public class FestaController {
    @Autowired
    private FestaService service;
    @PostMapping("/salvar")
    @ResponseStatus(code = HttpStatus.CREATED)
    public FestaModel criarFesta(@RequestBody FestaModel festa){
        return service.criarFesta(festa);
    }
    @PutMapping("/atualizar/{id}")
    @ResponseStatus(code = HttpStatus.CREATED)
    public FestaModel atualizarFesta(@PathVariable("id")Long id, @RequestBody FestaModel festa){
        return service.atualizarFesta(festa);
    }
    @GetMapping("/festas")
    @ResponseStatus(code = HttpStatus.OK)
    public List<FestaModel> listarTodasFesta(){
        return service.listarFestas();
    }
    @GetMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<FestaModel> listarFestaId(@PathVariable("id") Long id){
        return service.ListarFestaId(id);
    }
    @GetMapping("/hello")
    @ResponseStatus(code = HttpStatus.OK)
    public String Hello(){
        return "Hello World";
    }
}
