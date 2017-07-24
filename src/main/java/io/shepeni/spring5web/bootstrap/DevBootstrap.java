/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.shepeni.spring5web.bootstrap;

import io.shepeni.spring5web.model.Autor;
import io.shepeni.spring5web.model.Libro;
import io.shepeni.spring5web.repositories.RepositorioAutor;
import io.shepeni.spring5web.repositories.RepositorioLibro;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author omar
 */

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
    
    RepositorioAutor repositorioAutor;
    RepositorioLibro repositorioLibro;

    public DevBootstrap(RepositorioAutor repositorioAutor, RepositorioLibro repositorioLibro) {
        this.repositorioAutor = repositorioAutor;
        this.repositorioLibro = repositorioLibro;
    }
        
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        this.initData();
    }
    
    public void initData(){
        
        Autor gabriel = new Autor("Gabriel", "Garcia Marquez");
        Libro cien = new Libro("Cien añños de soledad", "7329372837", "planet");
        gabriel.getLibros().add(cien);
        cien.getAutores().add(gabriel);
        
        repositorioAutor.save(gabriel);
        repositorioLibro.save(cien);
        
        
        Autor victorHugo = new Autor("victor Hugo", "");
        Libro miserables = new Libro("Los miserables", "102983102938", "Sepan Cuantos");
        victorHugo.getLibros().add(miserables);
        miserables.getAutores().add(victorHugo);
                
        repositorioAutor.save(victorHugo);
        repositorioLibro.save(miserables);
        
    }
   
}
