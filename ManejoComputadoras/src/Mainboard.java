/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Palacios
 */
public class Mainboard {
    
    public String modelo;
    public String numeracion;

    public Mainboard(String modelo, String numeracion) {
        this.modelo = modelo;
        this.numeracion = numeracion;
    }
    
    public Mainboard() {
    	
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    @Override
    public String toString() {
        return modelo + " " + numeracion ;
    }
    
    
    
    
    
}
