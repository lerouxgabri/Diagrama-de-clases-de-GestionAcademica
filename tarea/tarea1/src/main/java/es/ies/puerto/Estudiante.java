package es.ies.puerto;

public class Estudiante extends Persona{
    private String matricula;

    public Estudiante(){}

    public Estudiante(String nombre, int edad, String matricula){
        super(edad,nombre);
        this.matricula = matricula;
    }

    @Override
    String pensar() {
        return "Soy estudiante y tengo examen";
    }

    

}
