package AGREGACION.EJERCICIO8;

public class Facultad {
    private String nombre;
    private String sigla;

    public Facultad(String nombre, String sigla) {
        this.nombre = nombre;
        this.sigla = sigla;
    }


    public String getSigla() {
        return sigla;
    }

    public String getNombre() {
        return nombre;
    }
}
