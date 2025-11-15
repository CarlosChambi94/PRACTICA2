package AGREGACION.EJERCICIO12;

public class Doctor {
    private String nombre, especialidad;

    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void mostrardoctor(){
        System.out.println("Nombre: " + nombre + "Especialidad: " + especialidad);
    }
}
