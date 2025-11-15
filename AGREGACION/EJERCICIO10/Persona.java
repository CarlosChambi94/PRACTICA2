package AGREGACION.EJERCICIO10;

public class Persona {
    public String nombre, apellido;
    public int edad, ci;

    public Persona(String apellido, String nombre, int edad, int ci) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCi() {
        return ci;
    }

    public void mostrar(){
        System.out.println(nombre + " " + apellido + " (CI: " + ci + ", edad: " + edad + ")");
    }
}
