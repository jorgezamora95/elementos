/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.campitos.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author campitos
 */

@Entity
//@Table(name="direccion")

public class Direccion {
 
@Id 
 //@Column(name="id")
// @GeneratedValue
@GeneratedValue(generator="secdir") 
@SequenceGenerator(name="secdir",sequenceName="sec_direccion", allocationSize=1) 
 private Long id;
 
  private Integer numero;
 private String calle;
 private Long cp;
 private String municipio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   


    public Direccion() {
    }

    public Direccion(Long id) {
        this.id = id;
    }

    public Direccion(Integer numero, String calle, Long cp, String municipio) {
        this.numero = numero;
        this.calle = calle;
        this.cp = cp;
        this.municipio = municipio;
    }

    public Direccion(Long id, Integer numero, String calle, Long cp, String municipio) {
        this.id = id;
        this.numero = numero;
        this.calle = calle;
        this.cp = cp;
        this.municipio = municipio;
    }
    

    @Override
    public String toString() {
        return "Direccion{" + "numero=" + numero + ", calle=" + calle + ", cp=" + cp + ", municipio=" + municipio + '}';
    }

  
    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the cp
     */
    public Long getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(Long cp) {
        this.cp = cp;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
