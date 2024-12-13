package es.ies.puerto;

public class Ejercicio {
    static Persona persona;

    public static void main(String[] args) {
        persona = new Estudiante("Juan", 20, "B7980");
       System.out.println(persona.saludar());
    }
}
