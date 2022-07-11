/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TarjetaCredito tarjeta = new TarjetaCredito("Jose", 1234, 6);
        
        MayorEdad representante = new MayorEdad("José", tarjeta);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta: %s - Codigo: %d - "
                + "Cupon Maximo: %d\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCodigo(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCuponMaximo());
        
    }
}
