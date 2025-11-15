package AGREGACION.EJERCICIO8;

public class Fraternidad {
    private String nombre ;
    private Bailarin[] bailarines ;
    private Bailarin encargado;
    private int nrodBailarines  = 0 ;

    public Fraternidad(String nombre, int maxBailarines) {
        this.nombre = nombre;
        bailarines = new Bailarin[maxBailarines];


    }
    public String getNombre() {
        return nombre;
    }

    public void setEncargado(Bailarin encargado) {
        this.encargado = encargado;
    }
    public boolean agregarBailarin(Bailarin b) {
        if (b.getFraternidad() != null) {
            System.out.println( b.getNombre() + " ya pertenece a otra fraternidad: " + b.getFraternidad().getNombre());
            return false;
        }
        if (nrodBailarines < bailarines.length) {
            bailarines[nrodBailarines] = b;
            nrodBailarines++;
            b.agregarFraternidad(this);
            return true;
        } else {
            System.out.println("No hay espacio para más bailarines en " + nombre);
            return false;
        }
    }

    public void mostrarInf(){
        System.out.println("Fraternidad: " + nombre);
        System.out.println("Encargado: " + encargado.getNombre());
        System.out.println("Bailarines");
        for(int i = 0 ; i < nrodBailarines ;i++ ){
            System.out.println("- " + bailarines[i].getNombre() + " (" + bailarines[i].getEdad() +
                    " años, " + bailarines[i].getFacultad().getNombre() + ")");

        }
    }
}
