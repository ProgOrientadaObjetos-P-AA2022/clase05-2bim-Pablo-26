/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Escritura {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> lista;
    
    public Escritura(String n) {
        nombreArchivo = n;
        establecerGeneradorPeliculas();
        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            if (lista.size() > 0) {
                for (int i = 0; i < lista.size(); i++) {
                    establecerRegistro(lista.get(i));
                    establecerSalida();
                }
            }
            
        } catch (IOException IOexception) {
            System.out.println("Error al abrir el archivo");
        }
    }
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    
    public void establecerRegistro(GeneradorPeliculas n) {
        registro = n;
    }
    
    public void establecerSalida() {
        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo");
        }
    }
    
    public void establecerGeneradorPeliculas() {
        Lectura p = new Lectura(nombreArchivo);
        p.establecerGeneradorPeliculas();
        lista = p.obtenerGeneradorPeliculas();
    }
    
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    public ObjectOutputStream obtenerSalida() {
        return salida;
    }
    
    public ArrayList<GeneradorPeliculas> obtenerGeneradorPeliculas() {
        return lista;
    }
    
    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo");
        } 
    } 
}
