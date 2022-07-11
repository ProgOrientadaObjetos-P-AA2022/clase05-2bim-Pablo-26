/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Lectura {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> lista;
    private String nombreArchivo;
    
    public Lectura(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(nombreArchivo));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo" + ioException);
            } 
        }
    }
    
    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    
    public void establecerGeneradorPeliculas() {
        lista = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                    lista.add(registro);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    
    public ArrayList<GeneradorPeliculas> obtenerGeneradorPeliculas() {
        return lista;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }
    
    @Override
    public String toString() {
        String cadena = "Generador de Peliculas\n";
        for (int i = 0; i < lista.size(); i++) {
            GeneradorPeliculas p = lista.get(i);
            cadena = String.format("%s",
                    p.toString());
        }

        return cadena;
    }
    
    public void cerrarArchivo() {
        try{
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        }catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
