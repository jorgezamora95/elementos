/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

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
    

/**
 * 
 * @param numero ESte parametro es el numero de calle y es de Integer
 * @param calle  El nombre de la calle es de tipo String
 * @param cp  El codigpo postal es de tipo Long
 * @param municipio  El municipio es de tipo STring
 * @return  El tipo de retorno es el objeto Direccion que se guardo e incluye el id generado
 */
    @RequestMapping(value="/direccion/{numero}/{calle}/{cp}/{municipio}",
            method=RequestMethod.POST, headers ={"Accept=application/json"})
    public Direccion guardar(@PathVariable Integer numero,@PathVariable String 
            calle, @PathVariable Long cp, @PathVariable String municipio){
        
         return repo.save(new Direccion(numero, calle, cp, municipio));
         
    }
            
    
}
