/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia {
    
    private String cooppTransvia;
    private double tarifa;
    
    public void establecerNombreTransvia(String n){
        cooppTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 3.50;
    }
    
    public String obtenerNombreTransvia(){
        return cooppTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
}
