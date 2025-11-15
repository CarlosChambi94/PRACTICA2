package AGREGACION.EJERCICIO2;

public class Main {
    public static void main(String[] args){
        Departamento p1 = new Departamento("TIC", "Tecnologia", 10);
        Departamento p2 = new Departamento("Tecnología", "Sistemas", 10);

        Empleado[] lista = {
                new Empleado("Ana", "Gerente", 5000),
                new Empleado("Luis", "Analista", 4000),
                new Empleado("María", "Asistente", 3500),
                new Empleado("Pedro", "Reclutador", 3700),
                new Empleado("Lucía", "Coordinadora", 4200)
        };

        for (int i = 0; i < lista.length; i++) {
            p1.agregarEmpleados(lista[i]);
        }

        p1.mostrarEmpleados();
        p2.mostrarEmpleados();

        double salario = 500;
        p1.cambiarSalario(500);
        p1.mostrarEmpleados();

        boolean tienenComun = p1.verificaEmpleado(p2);
        if(tienenComun){
            System.out.println("SI tiene un empleado en comun");
        }else{
            System.out.println("no tienen en comun");
        }

        p1.transferirEmpleado(p2);
        p1.mostrarEmpleados();
        p2.mostrarEmpleados();
    }
}
