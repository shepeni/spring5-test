/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.shepeni.spring5web.controller;

import io.shepeni.spring5web.repositories.RepositorioLibro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author omar
 */

@Controller
public class ControladorLibros {
    
    
    RepositorioLibro repositorioLibro;

    public RepositorioLibro getRepositorioLibro() {
        return repositorioLibro;
    }

    public void setRepositorioLibro(RepositorioLibro repositorioLibro) {
        this.repositorioLibro = repositorioLibro;
    }
    
    
    @RequestMapping("/libros")
    public String getLibros(Model model){
        model.addAttribute("libros", repositorioLibro.findAll());
        return "books";
    }
}
