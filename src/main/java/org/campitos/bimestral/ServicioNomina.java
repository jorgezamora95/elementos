/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author campitos
 */
@Service
public class ServicioNomina {
    
    @Bean
    public Nomina servicioPagarNomina(){
      
        return new TrabajadorHonorarios();
    }
    
    
}
