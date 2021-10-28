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
public class MotorMecanico extends Motor implements IVendible{
    
    private float tam;
    private String comb;

    public MotorMecanico( int Noserial, String marca, float tam, String comb) {
        super(Noserial, marca);
        this.tam = tam;
        this.comb = comb;
    }

    public float getTam() {
        return tam;
    }

    public void setTam(float tam) {
        this.tam = tam;
    }

    public String getComb() {
        return comb;
    }

    public void setComb(String comb) {
        this.comb = comb;
    }
    
    public double precioCombustible(){
        if ("Gasolina".equals(this.comb)){
            return 40000;
        }else
            if("Diesel".equals(this.comb)){
                return 70000;
            }
            else 
                return 30000;
    }
    
    public double precioTamaño(){
        if (this.tam==1.3){
            return 50000;
        }else
            if(this.tam==1.8){
                return 70000;
            }
        else
                return 120000;
    }
    
    
    @Override
    public double getValorVenta(){
        return this.precioCombustible()+this.precioTamaño();
    }
    
    
    
    @Override
    public String getInfoCatalogo(){
        return "\nTamaño del motor: " + this.tam
                + "\nTipo de Combustible:" + this.comb
                + "\nValor Venta: " + this.getValorVenta();
    }
}
