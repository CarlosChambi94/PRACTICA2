package AGREGACION.EJERCICIO14;

public class Empleado {
    private String nombre, puesto;
    private double salario;

    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }


    public void mostrar(){
        System.out.println("Nombre:" + nombre + "Puesto:  " + puesto + "Salario: " + salario);
    }
}
