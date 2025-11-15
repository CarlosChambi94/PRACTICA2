 package AGREGACION.EJERCICIO2;

public class Departamento {
    public String nombre;
    public String area;
    Empleado[] empleados;
    public int cantidadEmpleados;

    public Departamento(String nombre, String area, int capa) {
        this.nombre = nombre;
        this.area = area;
        this.empleados= new Empleado[capa];
        this.cantidadEmpleados= 0;

    }

    public void agregarEmpleados(Empleado e){
        for(int i = 0; i < empleados.length ; i++){
            if(empleados[i] == null){
                empleados[i] = e;
                cantidadEmpleados++;
                break;
            }
        }
    }
    public void mostrarEmpleados(){
        System.out.println("Departamento: " + this.nombre);
        for(int i = 0 ; i < empleados.length ; i++){
            if(empleados[i] != null){
                System.out.println("  - " + empleados[i]);
            }
        }
    }
    public void cambiarSalario(double nuevosalario){
        for(int i = 0 ; i < empleados.length ; i++){
            if (empleados[i] != null) {
                empleados[i].setSueldo(nuevosalario);
            }
        }
    }
    public boolean verificaEmpleado(Departamento d) {
        for (int i = 0; i < empleados.length; i++) {
            Empleado e1 = empleados[i];
            if (e1 != null) {
                for (int j = 0; j < d.empleados.length; j++) {
                    Empleado e2 = d.empleados[j];
                    if (e2 != null && e1.getNombre().equalsIgnoreCase(e2.getNombre())) {
                        return true;

                    }
                }
            }
        }
        return false;
    }

    public void transferirEmpleado(Departamento d){
        for(int i = 0 ; i < empleados.length ; i++){
            if (empleados[i] != null) {
                d.agregarEmpleados(empleados[i]);
                empleados[i] = null;
            }
        }
        cantidadEmpleados = 0;
    }


}
