/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author campitos
 */
@RestController
public class ControladorDireccion {
    
@Autowired RepositorioDireccion repo;
    

    @RequestMapping(value="/direccion/{numero}/{calle}/{cp}/{municipio}",
            method=RequestMethod.POST, headers ={"Accept=application/json"})
    public Direccion guardar(@PathVariable Integer numero,@PathVariable String 
            calle, @PathVariable Long cp, @PathVariable String municipio){
        
         return repo.save(new Direccion(numero, calle, cp, municipio));
         
    }
 @RequestMapping(value="/direccion/{id}/{numero}/{calle}/{cp}/{municipio}",
            method=RequestMethod.PUT, headers ={"Accept=application/json"})
    public Direccion guardar(@PathVariable Long id, @PathVariable Integer numero,@PathVariable String 
            calle, @PathVariable Long cp, @PathVariable String municipio){
        
         return repo.save(new Direccion(id,numero, calle, cp, municipio));
         
    }
    
    @RequestMapping(value="/direccion/{id}",
            method=RequestMethod.DELETE, headers ={"Accept=application/json"})
    public Estatus guardar(@PathVariable Long id){
        
         repo.delete(new Direccion(id));
         Estatus estatus=new Estatus();
         estatus.setSuccess(true);
         return estatus;
    }  
    @RequestMapping(value="/direccion/{id}", method=RequestMethod.GET, 
            headers = {"Accept=application/json"})
    public Direccion buscarPorId(@PathVariable Long id){
        
        return repo.findOne(id);
    }
    
    @RequestMapping(value="/direccion", method=RequestMethod.GET, 
            headers = {"Accept=application/json"})
    public ArrayList<Direccion> buscarTodos(){
        
        return (ArrayList<Direccion>) repo.findAll();
    }
    
}
