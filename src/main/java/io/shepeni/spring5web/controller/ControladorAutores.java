package io.shepeni.spring5web.controller;


import io.shepeni.spring5web.repositories.RepositorioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omar
 */

@Controller
public class ControladorAutores {
    
    @Autowired
    private RepositorioAutor repositorioAutor;

    
    public ControladorAutores(RepositorioAutor repositorioAutor) {
        this.repositorioAutor = repositorioAutor;
    }
    
    @RequestMapping("/autores")
    public String getAutores(Model model){
        model.addAttribute("autores", repositorioAutor.findAll());
        return "autores";
    }
     
   
    
}
