/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author campitos
 */
@RestController
public class ControladorHola {
    
    @RequestMapping("/hola")
    public String hola(){
        return "Hola mundo";
    }
}
    

