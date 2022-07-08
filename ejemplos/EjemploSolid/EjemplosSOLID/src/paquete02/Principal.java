/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pablo Ramon", 18);
        
        Persona p2 = new Persona("Armando Paredes", 35);
        
        Persona p3 = new Persona("Juan Perez", 24);
        
        Persona p4 = new Persona("Esteban Quito", 27);
        
        ArrayList<Persona> lista = new ArrayList<>();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        OperacionesEstudiantes operacion = new OperacionesEstudiantes();
        operacion.establecerEstudiante(lista);
        operacion.establecerPromedioEdades();
        
        System.out.printf("%s\n", operacion);
    }
}
