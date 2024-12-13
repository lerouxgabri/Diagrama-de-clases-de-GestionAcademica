package es.ies.puerto;

/**
 * @author  Gabriel
 * 
 */

public class Biblioteca {
    private String nombre;
    public Biblioteca(){}

    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public String registrarLibro(String Libro){
        return "Se ha registrado el libro: "+Libro+" en la biblioteca";
    }

    public String ListarLibro(){
        return "Se ha listado el libro";
    }
}
