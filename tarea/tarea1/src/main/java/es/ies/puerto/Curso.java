package es.ies.puerto;

/**
 * @author  Gabriel
 * 
 */

public class Curso extends Clase{

    public Curso(String nombre, String codigo){
        super(nombre,codigo);
    }

    public String agregarEstudiantes(String Estudiante){
        return "Se ha añadido al estudiante "+Estudiante;
    }


    public String listarEstudiantes(){
        return "Estudiantes:";
    }
}
