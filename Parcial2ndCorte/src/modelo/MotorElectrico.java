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
public class MotorElectrico extends Motor implements IReservable {
    
    private double numkv;

    public MotorElectrico(int Noserial, String marca, double numkv) {
        super(Noserial, marca);
        this.numkv = numkv;
    }

    public double getNumkv() {
        return numkv;
    }

    public void setNumkv(double numkv) {
        this.numkv = numkv;
    }
    
    public double getConsumoHora(){
        double kvhora = this.numkv * 60;
        return kvhora;
        
    }
    
    
    @Override
    public double getValorReserva() {
        double precio = this.getConsumoHora() * 1500;
        return precio;
        
    }
    
    @Override
    public String getInfoCatalogo(){
        return "\nNúmero de KV por minuto: " + this.numkv
                + "Consumo Kv por Hora: " + this.getConsumoHora()
                + "Valor de Reserva X Hora: " + this.getValorReserva();
              
    }

    
    
}
