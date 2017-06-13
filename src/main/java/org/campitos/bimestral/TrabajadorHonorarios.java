/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

/**
 *
 * @author campitos
 */
public class TrabajadorHonorarios extends Trabajador implements Nomina{
  float iva;
  float isr;

    @Override
    public String pagarNomina() {
        return "Nomina pagada a Honorarios con iva "+iva+" e isr "+isr;
    }
  
}
