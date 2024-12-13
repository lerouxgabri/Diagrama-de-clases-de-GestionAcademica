package es.ies.puerto;

public abstract class Persona {
    private int edad;
    private String nombre;


    public Persona(){}

    /**
     * Constructor con parametros
     * @param edad
     * @param nombre
     */

    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getedad() {
        return this.edad;
    }

    public void setedad (int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String saludar(){
        return "Hola me llamo "+nombre;
    }
    abstract String pensar();

}
