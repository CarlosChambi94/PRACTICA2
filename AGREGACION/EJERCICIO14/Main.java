package AGREGACION.EJERCICIO14;

public class Main {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("EA", 10);
        Empleado p1 = new Empleado("Luis", "Administrador", 1000);
        Empleado p2 = new Empleado("Sofia", "Secretaria", 2000);
        Empleado p3 = new Empleado("Yon", "Jefe", 3000);




        e1.agregarEmpleado(p1);
        e1.agregarEmpleado(p2);
        e1.agregarEmpleado(p3);
        e1.mostrarEmpleados();
        e1.buscarEmpleado("sofia");
        e1.eliminarEmpleado("luis  ");
        System.out.println("El salario promedio es " + e1.promedio());
        e1.listarEmpleados(2000);
    }
}
