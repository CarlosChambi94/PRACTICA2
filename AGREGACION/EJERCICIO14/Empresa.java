package AGREGACION.EJERCICIO14;

public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private int ed;

    public Empresa(String nombre, int maxcantidad){
        this.nombre=nombre;
        this.empleados = new Empleado[maxcantidad];
        this.ed=0;
    }
    public void agregarEmpleado(Empleado e){
        empleados[ed] = e;
        ed++;
    }
    public void mostrarEmpleados(){
        System.out.println("La empresa: " + nombre);
        System.out.println("Empleados: ");
        for(int i = 0 ; i < empleados.length ; i++){
            if(empleados[i]!=null){
                empleados[i].mostrar();
            }
        }
    }

    public void buscarEmpleado(String n){
        boolean encontrado = false;
        int indice = 0;
        for(int i=0 ; i < empleados.length ; i++){
            if(empleados[i]!=null){
            if(empleados[i].getNombre().equalsIgnoreCase(n)){
                encontrado = true;
                indice = i;
            }

        }
    }
        if(encontrado){
            System.out.println("Empleado encontrado");
            empleados[indice].mostrar();
        }else{
            System.out.println("Empleado no encontrado");
        }
    }
    public void eliminarEmpleado(String n) {

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                if (empleados[i].getNombre().equalsIgnoreCase(n)) {
                    empleados[i] = null;
                    System.out.println(n + "fue eliminado");
                }
            }
        }
    }
    public double promedio(){
        double promedio=0;
        double sm = 0;
        double divisor = 0;
        for(int i = 0 ; i < empleados.length; i++){
            if(empleados[i]!=null){
                sm += empleados[i].getSalario();
                divisor++;
            }
        }
        promedio = sm/divisor;


        return promedio;
    }

    public void listarEmpleados(int cant){
        System.out.println("Empleados que tienen salario mayor que " + cant);
        for(int i = 0 ; i < empleados.length ; i++ ){
            if(empleados[i]!=null){
                if(empleados[i].getSalario()>cant){
                    empleados[i].mostrar();
                }
            }
        }
    }

}
