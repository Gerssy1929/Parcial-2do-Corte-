/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author German
 */
public abstract class Motor {
    
    private int Noserial;
    private String marca;

    
    
    public Motor(int Noserial, String marca) {
        this.Noserial = Noserial;
        this.marca = marca;
    }

    public int getNoserial() {
        return Noserial;
    }

    public void setNoserial(int Noserial) {
        this.Noserial = Noserial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public abstract String getInfoCatalogo();
    
    
    public String getInfoMotor(){
        return "\nNo serial: " + this.Noserial
                + "\nMarca: " + this.marca + this.getInfoCatalogo();
    }



}

