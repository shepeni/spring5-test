/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.shepeni.spring5web.bootstrap;

import io.shepeni.spring5web.model.Autor;
import io.shepeni.spring5web.model.Libro;

/**
 *
 * @author omar
 */


public class DevBootstrap {
    public void initData(){
        
        Autor gabriel = new Autor("Gabriel", "Garcia Marquez");
        Libro cien = new Libro("Cien añños de soledad", "7329372837", "planet");
        gabriel.getLibros().add(cien);
        cien.getAutores().add(gabriel);
        
        
        Autor victorHugo = new Autor("victor Hugo", "");
        Libro miserables = new Libro("Los miserables", "102983102938", "Sepan Cuantos");
        victorHugo.getLibros().add(miserables);
        miserables.getAutores().add(victorHugo);
        
        
    }
}
