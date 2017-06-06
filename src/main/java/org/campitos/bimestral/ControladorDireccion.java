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
    
    @RequestMapping(value="/direccion/{numero}/{calle}/{cp}/{municipio}", method=RequestMethod.POST, headers={"Accept=application/json"})
    public Direccion guardar(@PathVariable Integer numero, @PathVariable String calle, @PathVariable Long cp, @PathVariable String municipio)throws Exception{
        System.out.println("Activado el request");
        Direccion dir=  repo.save(new Direccion(numero, calle, cp, municipio));
        
      return dir;
    }
    
    
}
