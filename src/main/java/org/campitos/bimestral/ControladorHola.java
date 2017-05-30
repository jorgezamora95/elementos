/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author campitos
 */
@RestController
@CrossOrigin
public class ControladorHola {
    
    @RequestMapping(value="/hola/{mensaje}", method=RequestMethod.GET,
            headers = {"Accept=text/html"})
    public String saludar(@PathVariable String mensaje){
        String algo="Bienvenido "+mensaje;
        return algo;
    }
   @RequestMapping(value="/usuario", method=RequestMethod.GET,
           headers = {"Accept=application/json"})
   public Usuario obtener(){
       Usuario u=new Usuario("Juan Carlos", "Campos", 46);
       return u;
   }
}