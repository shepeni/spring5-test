/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.shepeni.spring5web.repositories;

import io.shepeni.spring5web.model.Autor;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author omar
 */
public interface RepositorioAutor  extends CrudRepository<Autor,Long>{

 
}
