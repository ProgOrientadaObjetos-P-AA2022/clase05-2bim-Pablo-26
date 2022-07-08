/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia extends Transporte{
    
    private String cooppTransvia;
    
    public void establecerNombreTransvia(String n){
        cooppTransvia = n;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 3.50;
    }

    public String obtenerNombreTransvia() {
        return cooppTransvia;
    }
}
