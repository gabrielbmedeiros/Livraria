/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelo.Autor;

/**
 *
 * @author Gabriel Medeiros
 */
public class AutorDAO extends GenericDAO<Autor, Long>{
    public AutorDAO(){
        super(Autor.class);
}
}
