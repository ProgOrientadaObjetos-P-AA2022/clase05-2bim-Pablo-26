
package paquete06;

public class TarjetaCredito {
    
    private String nombre;
    private int codigo;
    private int cuponMaximo;
    
    public TarjetaCredito(String nom, int c, int cM){
        nombre = nom;
        codigo = c;
        cuponMaximo = cM;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerCodigo(int c){
        codigo = c;
    }
    
    public void establecerCponMaximo(int c){
        cuponMaximo = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerCodigo(){
        return codigo;
    }
    
    public int obtenerCuponMaximo(){
        return cuponMaximo;
    }
}
