package AGREGACION.EJERCICIO8;

public class Bailarin {
    private String nombre ;
    private int edad ;
    private Fraternidad fraternidad;
    private Facultad facultad ;

    public Bailarin(String nombre, int edad , Facultad facultad) {
        this.nombre = nombre;
        this.edad = edad;
        this.facultad = facultad;
    }

    public void agregarFraternidad(Fraternidad f){
        this.fraternidad=f;
    }

    public Fraternidad getFraternidad(){
        return fraternidad;


    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public String mostrar() {
        return "Bailarines{" +
                "Bailarim ='" + nombre + '\'' +
                ", edad=" + edad +
                ", fraternidad=" + fraternidad +
                ", facultad=" + facultad.getNombre() +
                '}';
    }
}
