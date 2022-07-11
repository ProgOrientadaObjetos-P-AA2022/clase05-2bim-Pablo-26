/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10;

public class Principal {
    public static void main(String[] args) {
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
//        System.out.println(gp.obtenerUrl());
        
        Escritura archivo01 = new Escritura("data/propietarios.dat");
        System.out.printf("%s", gp);
        archivo01.establecerRegistro(gp);
        archivo01.establecerSalida();
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("456788");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
//        System.out.println(gp2.obtenerUrl());

        Escritura archivo02 = new Escritura("data/propietarios.dat");
        System.out.printf("%s", gp2);
        archivo02.establecerRegistro(gp2);
        archivo02.establecerSalida();
        
        System.out.println("---------------------------");
        
        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("456123");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
//        System.out.println(gp3.obtenerUrl());

        Escritura archivo03 = new Escritura("data/propietarios.dat");
        System.out.printf("%s", gp3);
        archivo03.establecerRegistro(gp3);
        archivo03.establecerSalida();
        
        
    }
}
