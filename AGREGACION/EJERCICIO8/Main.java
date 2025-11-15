package AGREGACION.EJERCICIO8;

public class Main {
    public static void main(String[] args) {
        Sistema sist = new Sistema(10,5,10);
        Facultad f1 = new Facultad("Ingenieria " , "F1");
        Facultad f2 = new Facultad("Ciencias puras", "FCPN");

        sist.registrarFacultad(f1);
        sist.registrarFacultad(f2);

        Bailarin b1 = new Bailarin("María", 20, f1);
        Bailarin b2 = new Bailarin("Carlos", 22, f2);
        Bailarin b3 = new Bailarin("Lucía", 19, f1);
        Bailarin b4 = new Bailarin("Andrés", 21, f2);
        Bailarin b5 = new Bailarin("Sofía", 23, f1);

        sist.registrarBailarin(b1);
        sist.registrarBailarin(b2);
        sist.registrarBailarin(b3);
        sist.registrarBailarin(b4);
        sist.registrarBailarin(b5);

        Fraternidad frat1 = new Fraternidad("Fraternidad Inti", 5);
        Fraternidad frat2 = new Fraternidad("Fraternidad Kollasuyo", 5);
        frat1.setEncargado(b1);
        frat2.setEncargado(b4);

        frat1.agregarBailarin(b1);
        frat1.agregarBailarin(b3);
        frat1.agregarBailarin(b5);

        frat2.agregarBailarin(b2);
        frat2.agregarBailarin(b1);
        frat2.agregarBailarin(b1);
        sist.registrarFraternidad(frat1);
        sist.registrarFraternidad(frat2);

        sist.mostrarFraternidades();
        sist.mostrarBailarines();
    }
}
